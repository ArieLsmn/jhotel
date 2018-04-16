import java.util.ArrayList;
/**
 * Database customer
 *
 * @author Aria Lesmana
 * @version 1.6
 * @since 12-4-2018
 */
public class DatabaseCustomer
{
    private static ArrayList<Customer> CUSTOMER_DATABASE= new ArrayList<Customer>();
    private static int LAST_CUSTOMER_ID=0;// instance variables - replace the example below with your own
    
    public static ArrayList<Customer> getCustomerDatabase(){
        return CUSTOMER_DATABASE;
    }
    public static int getLastCustomerID(){
        return LAST_CUSTOMER_ID;
    }
    public static boolean addCustomer(Customer baru){
        if(CUSTOMER_DATABASE.contains(baru.getID()))
        {
            return false;
        }
        else 
        {   CUSTOMER_DATABASE.add(baru);
            LAST_CUSTOMER_ID=baru.getID();
            return true;   
        }
    }
    public static Customer getCustomer(int id){
        for(Customer findCustomer : CUSTOMER_DATABASE)
        {
            if(findCustomer.getID() == id)
            {
                return findCustomer;
            }           
            else
            return null;
        }
        return null; 
    }
    public static boolean removeCustomer(int id){
        for(Customer findCustomer : CUSTOMER_DATABASE){
            if(findCustomer.getID() == id){
                for(Pesanan pesan : DatabasePesanan.getPesananDatabase()){
                    if(pesan.getPelanggan() == findCustomer){
                        DatabasePesanan.removePesanan(pesan);
                    }
                }

                CUSTOMER_DATABASE.remove(findCustomer);
                return true;
            }
        }

        return false;
    }
}
