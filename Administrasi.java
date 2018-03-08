
/**
 * Write a description of class Administrasi here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
    public static void pesananDitugaskan(Pesanan pesan, Room kamar)
    {pesan.setStatusSelesai(false);
     pesan.setStatusDiproses(true);
     pesan.setRoom(kamar);
    }
    
    public static void roomAmbilPesanan(Pesanan pesan, Room kamar){
        kamar.setStatusKamar(StatusKamar.Booked);
        kamar.setPesanan(pesan);
    }
    public static void roomLepasPesanan(Room kamar){
        kamar.setStatusKamar(StatusKamar.Vacant);
        kamar.setPesanan(null);
    }
public static void pesananDibatalkan(Room kamar){
Pesanan pesan = kamar.getPesanan();
pesan.setStatusSelesai(false);
pesan.setStatusDiproses(false);
kamar.setPesanan(null);
}
public static void pesananSelesai(Room kamar){
Pesanan pesan = kamar.getPesanan();
pesan.setStatusSelesai(true);
pesan.setStatusDiproses(false);
kamar.setPesanan(null);
}
public static void pesananDibatalkan(Pesanan pesan){
pesan.setStatusSelesai(false);
pesan.setStatusDiproses(false);
pesan.setRoom(null);
}
public static void pesananSelesai(Pesanan pesan){
pesan.setStatusSelesai(true);
pesan.setStatusDiproses(false);
pesan.setRoom(null);
}
}


