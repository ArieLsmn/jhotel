
/**
 * Program untuk fungsi Administrasi hotel.
 *
 * @author Aria Lesmana
 * @version 1.6
 * @since 12-4-2018
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
     * @param pesan
     * @param kamar
     */
    public static void pesananDitugaskan(Pesanan pesan, Room kamar)
    {pesan.setStatusSelesai(false);
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
    
    public static void pesananDibatalkan(Room kamar){
       Pesanan pesan = DatabasePesanan.getPesanan(kamar);
       pesan.setStatusSelesai(false);
       pesan.setStatusDiproses(false);
        //kamar.setPesanan(null);
       pesan.setStatusAktif(false);
    }
    
    public static void pesananSelesai(Room kamar){
        Pesanan pesan = DatabasePesanan.getPesanan(kamar);
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        //kamar.setPesanan(null);
        pesan.setStatusAktif(false);
    }
    
    public static void pesananDibatalkan(Pesanan pesan){
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
        pesan.setStatusAktif(false);
    }
    
    public static void pesananSelesai(Pesanan pesan){
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
        pesan.setStatusAktif(false);
    }
}


