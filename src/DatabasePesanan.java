import java.util.ArrayList;
/**
 * Database pesanan
 *
 * @author Aria Lesmana
 * @version 1.5
 * @since 22-3-2018
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
    
    public static boolean addPesanan(Pesanan baru)
    {
        if(PESANAN_DATABASE.contains(baru))
        {
            if(baru.getStatusAktif() == true)
            {   
                return false;
            }
            else 
            {   PESANAN_DATABASE.add(baru);
                return true;   
            }
        }
        else
        {
        
        PESANAN_DATABASE.add(baru);
        return true;   
            
        }
    }
    
    public static Pesanan getPesanan(int id)
    {
        for(Pesanan pesanan : PESANAN_DATABASE)
        {
            if(pesanan.getID() == id)
            {
                return pesanan;
            }
        }

        return null;
    }
    
    
    public static Pesanan getPesanan(Room kamar)
    {
        for(Pesanan pesanan : PESANAN_DATABASE)
        {
            if(pesanan.getRoom().equals(kamar))
            {
                return pesanan;
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
    public static boolean removePesanan(Pesanan pesan)
        {
        for(Pesanan pesanan : PESANAN_DATABASE)
        {
            if(pesanan.equals(pesan))
            {
                if(pesanan.getRoom() != null)
                {
                    Administrasi.pesananDibatalkan(pesanan);
                }
                else
                {
                    if(pesanan.getStatusAktif())
                    {
                        pesanan.setStatusAktif(false);
                    }
                }

                if(PESANAN_DATABASE.remove(pesanan))
                {
                    return true;
                }
            }
        }

        return false;
    }
}
