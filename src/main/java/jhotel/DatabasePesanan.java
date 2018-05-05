package jhotel;
import java.util.ArrayList;
/**
 * Database pesanan
 *
 * @author Aria Lesmana
 * @version 1.6
 * @since 12-4-2018
 */
public class DatabasePesanan
{
    /*
     * Deklarasi variable
     */
    private static ArrayList<Pesanan> PESANAN_DATABASE = new ArrayList<Pesanan>();
    private static int LAST_PESANAN_ID = 0;
    private static String[] list_pesanan;

    public static ArrayList<Pesanan> getPesananDatabase(){
        return PESANAN_DATABASE;
    }

    public static int getLastPesananID(){
        return LAST_PESANAN_ID;
    }

    /**
     * Metode untuk menambah pesanan
     *
     * @param baru pesanan baru
     *
     */
    public static boolean addPesanan(Pesanan baru) throws PesananSudahAdaException
    {
        for(Pesanan pesanan : PESANAN_DATABASE)
        {
            if(pesanan.getID() == baru.getID())
            {
                if(pesanan.getStatusAktif() == true)
                {
                    throw new PesananSudahAdaException(pesanan);
                    //return false;
                }
                else
                {
                    LAST_PESANAN_ID = baru.getID();
                    PESANAN_DATABASE.add(baru);
                    return true;
                }
            }
        }
        LAST_PESANAN_ID = baru.getID();
        PESANAN_DATABASE.add(baru);
        return true;
    }

    /**
     * Metode untuk menghapus pesanan
     *
     * @param pesan pesanan
     *
     */
    public static boolean removePesanan(Customer pesan) throws PesananTidakDitemukanException
    {
        for (int i = 0; i < PESANAN_DATABASE.size(); i++) {
            Pesanan tes = PESANAN_DATABASE.get(i);
            if (tes.getPelanggan().equals(pesan)){
                if(tes.getRoom() != null)
                {
                    Administrasi.pesananDibatalkan(tes);
                }
                else
                {
                    if(tes.getStatusAktif())
                    {
                        tes.setStatusAktif(false);
                    }
                }

                if(PESANAN_DATABASE.remove(tes))
                {
                    return true;
                }
            }
        }
        throw new PesananTidakDitemukanException(pesan);
    }

    /**
     * Metode untuk mengambil pesanan
     *
     * @param id data customer
     *
     */
    public static Pesanan getPesanan(int id)
    {
        for (int i = 0; i < PESANAN_DATABASE.size(); i++) {
            Pesanan tes = PESANAN_DATABASE.get(i);
            if (tes.getID()==id){
                return tes;
            }
        }
        return null;
    }

    public static Pesanan getPesananAktif(Room kamar)
    {
        for(Pesanan pesanan : PESANAN_DATABASE)
        {
            if(pesanan.getRoom().equals(kamar) && pesanan.getStatusAktif())
            {
                return pesanan;
            }
        }

        return null;
    }

    public static Pesanan getPesananAktif(Customer pelanggan)
    {
        for (int i = 0; i < PESANAN_DATABASE.size(); i++) {
            Pesanan tes = PESANAN_DATABASE.get(i);
            if (tes.getStatusAktif()==true&&tes.getPelanggan().equals(pelanggan)){
                return tes;
            }
        }
        return null;
    }

    /**
     * Metode untuk membatalkan pesanan
     *
     * @param pesan pesanan
     *
     */
    public static void pesananDibatalkan(Pesanan pesan)
    {

    }
}
