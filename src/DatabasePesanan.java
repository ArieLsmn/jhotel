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
        if(baru.getStatusAktif() == true){
        PESANAN_DATABASE.add(baru);
        return true;
    }
    else return false;
    }

    public static Pesanan getPesanan(int id)
    {int n=0;
    Pesanan pesan= PESANAN_DATABASE.get(n);    //for(Pesanan pesan : PESANAN_DATABASE){
        for(n=0;n<PESANAN_DATABASE.size();n++){
            
        if(pesan.getID() == id)
        return pesan;
        
        else 
        return null;
        
        
    }
    return pesan;
    }
    public static Pesanan getPesanan(Room kamar)
    {
        for(Pesanan pesan : PESANAN_DATABASE){
        if(pesan.getRoom() == kamar)
        return pesan;
        
        else 
        return null;
        }
        return null;
    }
    
    public static Pesanan getPesananAktif(Customer pelanggan)
    {
        for(Pesanan pesan : PESANAN_DATABASE){
        if((pesan.getStatusAktif() == true)&& (pesan.getPelanggan()==pelanggan))
        return pesan;
        
        else 
        return null;
        }
        return null;
    }   
    
    public static boolean removePesanan(Pesanan pesan)
    {
        return false;
    }
}
