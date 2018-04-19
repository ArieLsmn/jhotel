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
    // instance variables - replace the example below with your own
    private static ArrayList<Pesanan> PESANAN_DATABASE=new ArrayList<Pesanan>();
    private static int LAST_PESANAN_ID=0;

    public static ArrayList<Pesanan> getPesananDatabase(){
        return PESANAN_DATABASE;
    }
    
    public static int getLastPesananID(){
        return LAST_PESANAN_ID;
    }
    
    public static boolean addPesanan(Pesanan baru) throws PesananSudahAdaException {
        if(PESANAN_DATABASE.contains(baru))
        {
            if(baru.getStatusAktif())
            {
                throw new PesananSudahAdaException(baru);
                //return false;

            }
            else 
            {   PESANAN_DATABASE.add(baru);
                LAST_PESANAN_ID=baru.getID();
                return true;   
            }
        }
        else
        {
        PESANAN_DATABASE.add(baru);
        LAST_PESANAN_ID=baru.getID();
        return true;       
        }
    }
    
    public static Pesanan getPesanan(int id)
    {
        for(Pesanan findPesanan : PESANAN_DATABASE)
        {
            if(findPesanan.getID() == id)
            {
                return findPesanan;
            }
        }

        return null;
    }
    
    
    public static Pesanan getPesanan(Room kamar)
    {
        for(Pesanan findPesanan : PESANAN_DATABASE){
            if(findPesanan.getRoom() == kamar){
                return findPesanan;
            }
        }
        return null;
    }


    public static Pesanan getPesananAktif(Customer pelanggan)
    {
        for(Pesanan pesanan : PESANAN_DATABASE)
        {
            if(pesanan.getPelanggan().equals(pelanggan))
            {
                if(pesanan.getStatusAktif())
                {
                    return pesanan;
                }
            }
        }
        return null;
    }
    public static boolean removePesanan(Pesanan pesan) throws PesananTidakDitemukanException {
            for(Pesanan findPesanan : PESANAN_DATABASE){
                if(findPesanan.equals(pesan)){
                    if(findPesanan.getRoom() != null){
                        Administrasi.pesananDibatalkan(pesan);
                    }
                    else{
                        if(findPesanan.getStatusAktif() == true){
                            findPesanan.setStatusAktif(false);
                        }
                    }

                    PESANAN_DATABASE.remove(pesan);
                    return true;
                }
            }
            throw new PesananTidakDitemukanException(pesan.getPelanggan());
            //return false;
        }
    }

