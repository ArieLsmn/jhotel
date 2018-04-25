package jhotel;
/**
 * Program untuk fungsi Administrasi pelanggan pada hotel.
 *
 * @author Aria Lesmana
 * @version 1.7
 * @since 19-4-2018
 */
public class Administrasi
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Administrasi
     */
    public Administrasi()
    {

    }
    /**
     * @param pesan Pesanan yang ditujukan untuk kamar
     * @param kamar Kamar yang dipesan
     */
    public static void pesananDitugaskan(Pesanan pesan, Room kamar)
    {
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(true);
        pesan.setRoom(kamar);
    }
    /*/**
     * @param pesan
     * @param kamar
     */
    /*public static void roomAmbilPesanan(Pesanan pesan, Room kamar){
        kamar.setStatusKamar(StatusKamar.Booked);
        kamar.setPesanan(pesan);
    }
    /**
     * @param kamar
     */
    /*public static void roomLepasPesanan(Room kamar){
        kamar.setStatusKamar(StatusKamar.Vacant);
        kamar.setPesanan(null);
    }*/

    /**
     *
     * @param kamar Kamar yang pesanannya akan dibatalkan
     */
    public static void pesananDibatalkan(Room kamar){
        Pesanan pesan = DatabasePesanan.getPesanan(kamar);
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        //kamar.setPesanan(null);
        pesan.setStatusAktif(false);
        kamar.setStatusKamar(StatusKamar.Vacant);
    }

    /**
     *
     * @param kamar Kamar yang pesanannya sudah selesai
     */
    public static void pesananSelesai(Room kamar){
        Pesanan pesan = DatabasePesanan.getPesanan(kamar);
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        //kamar.setPesanan(null);
        pesan.setStatusAktif(false);
        kamar.setStatusKamar(StatusKamar.Vacant);
    }

    /**
     *
     * @param pesan Pesanan yang akan dibatalkan
     */
    public static void pesananDibatalkan(Pesanan pesan){
        pesan.getRoom().setStatusKamar(StatusKamar.Vacant);
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
        pesan.setStatusAktif(false);
    }

    /**
     *
     * @param pesan Pesanan yang sudah selesai
     */
    public static void pesananSelesai(Pesanan pesan){
        pesan.getRoom().setStatusKamar(StatusKamar.Vacant);
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
        pesan.setStatusAktif(false);
    }
}


