package jhotel;
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
    
    public static ArrayList<Customer> getCustomerDatabase()
    {
        return CUSTOMER_DATABASE;
    }

    public static int getLastCustomerID()
    {
        return LAST_CUSTOMER_ID;
    }

    public static boolean addCustomer(Customer baru) throws PelangganSudahAdaException {
        //if (CUSTOMER_DATABASE.contains(baru.getID()))
            for (int i = 0; i < CUSTOMER_DATABASE.size(); i++) {
                Customer findCustomer = CUSTOMER_DATABASE.get(i);
                if ( (findCustomer.getID()==baru.getID())||(findCustomer.getEmail()==baru.getEmail()) )
                {
                    throw new PelangganSudahAdaException(baru);
                    //return false;
                }
            }
            LAST_CUSTOMER_ID = baru.getID();
            CUSTOMER_DATABASE.add(baru);
            return true;
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
    public static boolean removeCustomer(int id) throws PelangganTidakDitemukanException, PesananTidakDitemukanException {
        for (int i = 0; i < CUSTOMER_DATABASE.size(); i++) {
            Customer findCustomer = CUSTOMER_DATABASE.get(i);
            if(findCustomer.getID() == id){
                Pesanan pesan = DatabasePesanan.getPesananAktif(findCustomer);

                    //if(pesan.getPelanggan() == findCustomer){
                try{
                        DatabasePesanan.removePesanan(pesan);
                    }
                    catch (PesananTidakDitemukanException e){
                    System.out.println(e.getPesan());
                }
                CUSTOMER_DATABASE.remove(findCustomer);
                return true;
            }
        }
        throw new PelangganTidakDitemukanException(id);
        //return false;
    }
}
