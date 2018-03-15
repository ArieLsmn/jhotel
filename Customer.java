/**
 * Pendata Customer
 *
 * @author Aria Lesmana
 * @version 3-1-2018
 * 
 * 
 */
public class Customer
{
    protected int id;
    protected String nama;
    /** 
     * @param id 
     * @param nama
     */
    public Customer(int id, String nama){
       this.id=id;
       this.nama=nama;
    }
    /**
     * @return id nomor id dari customer
    */
    public int getID()
    {
        return id;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setID(int id){
        this.id=id;
    }
    
    public void setNama(String nama){
        this.nama=nama;
    }
    
        public void printData(){// berfungsi melakukan
        System.out.println("Customer");
        System.out.println("ID = "+id);
        System.out.println("Nama = "+nama);
    }
}
