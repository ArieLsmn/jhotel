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
    // instance variables - replace the example below with your own
    protected int id;
    protected String nama;

    /**
     * Constructor for objects of class Customer
     */
    public Customer(int id, String nama){
       this.id=id;
       this.nama=nama;
    }

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
        public void printData(){
        System.out.println(id);
        System.out.println(nama);
    }
}
