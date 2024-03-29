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
    /*
     * Deklarasi variable
     */
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<Customer>();
    private static int LAST_CUSTOMER_ID = 0;

    /**
     * Metode untuk mengambil id terakhir
     *
     * @return LAST_CUSTOMER_ID ID
     *
     */
    public static int getLastCustomerID(){
        return LAST_CUSTOMER_ID;
    }

    /**
     * Metode untuk menambah Customer
     *
     * @param baru customer baru
     * @throws PelangganSudahAdaException
     *
     */
    public static boolean addCustomer(Customer baru) throws PelangganSudahAdaException
    {
        for (int i = 0; i < CUSTOMER_DATABASE.size(); i++) {
            Customer tes = CUSTOMER_DATABASE.get(i);
            if (tes.getID()== baru.getID()||tes.getEmail().equals(baru.getEmail())){
                throw new PelangganSudahAdaException(baru);
            }
        }
        LAST_CUSTOMER_ID=baru.getID();
        CUSTOMER_DATABASE.add(baru);
        return true;
    }

    /**
     * Metode untuk mendapat customer bedasarkan id
     *
     * @param id id
     * @return customer yang dicari
     *
     */
    public static Customer getCustomer(int id)
    {
        for (int i = 0; i < CUSTOMER_DATABASE.size(); i++) {
            Customer cust = CUSTOMER_DATABASE.get(i);
            if (cust.getID()==id){
                return cust;
            }
        }
        return null;
    }

    /**
     * Metode untuk login customer
     *
     * @param email email
     * @param password password
     * @return customer yang diambil berdasar login
     *
     */
    public static Customer getCustomerLogin(String email, String password)
    {
        for (int i = 0; i < CUSTOMER_DATABASE.size(); i++) {
            Customer cust = CUSTOMER_DATABASE.get(i);
            if (cust.getEmail().equals(email)&&cust.getPassword().equals(password)){
                return cust;
            }
        }
        return null;
    }

    /**
     * Metode untuk menghapus customer
     *
     * @param id id customer
     * @throws PelangganTidakDitemukanException
     *
     */
    public static boolean removeCustomer(int id) throws PelangganTidakDitemukanException
    {
        for (int i = 0; i < CUSTOMER_DATABASE.size(); i++) {
            Customer tes = CUSTOMER_DATABASE.get(i);
            if (tes.getID()==id){
                Pesanan pesan = DatabasePesanan.getPesananAktif(tes);
                try {
                    DatabasePesanan.removePesanan(tes);
                } catch (PesananTidakDitemukanException test){
                    System.out.println(test.getPesan());
                }
                if(CUSTOMER_DATABASE.remove(tes))
                {
                    return true;
                }
            }
        }
        throw new PelangganTidakDitemukanException(id);
    }

    /**
     * Metode untuk mengambil data di database
     *
     * @return CUSTOMER_DATABASE
     *
     */
    public static ArrayList<Customer> getCustomerDatabase()
    {
        return CUSTOMER_DATABASE;
    }

}