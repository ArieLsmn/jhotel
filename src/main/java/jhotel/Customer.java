package jhotel;
import java.util.*;
import java.util.regex.*;
import java.text.*;
/**
 * Kelas untuk membuat data Customer
 *
 * @author Aria Lesmana
 * @version 1.7
 * @since 19-4-2018
 * 
 * 
 */
public class Customer
{
    private int id=0;
    private String nama;
    private String email;
    private Date dob;
    private String password;

    /**
     * Konstruktor Customer
     * @param nama
     * @param tanggal
     * @param bulan
     * @param tahun
     * @param email
     */
    public Customer(String nama, int tanggal, int bulan, int tahun, String email,String password){
       this.id = DatabaseCustomer.getLastCustomerID() + 1;
       this.nama=nama;
       this.dob = new GregorianCalendar(tahun,bulan-1,tanggal).getTime();
       this.email=email;
       this.password=password;
    }
    /**
     * Konstruktor Customer
     * @param nama
     * @param dob
     * @param email
     */
    public Customer( String nama, Date dob,String email,String password){
       this.id = DatabaseCustomer.getLastCustomerID() + 1;
       this.nama=nama;
       this.dob=dob;
       this.email=email;
       this.password=password;
    }
    
    /**
     * @return int id, Nomor id dari customer
    */
    public int getID()
    {

        return id;
    }
    /**
     * @return String nama, Nama dari customer
    */
    public String getNama(){

        return nama;
    }

    /**
     * @return String email, Alamat email milik customer
     */
    public String getEmail(){

        return email;
    }

    /**
     * @return Date dob, Tanggal lahir dari customer
     */
    public Date getDOB(){
        DateFormat dateFormatter = new SimpleDateFormat("'DOB: 'dd MMMM yyyy");
        String dobString = dateFormatter.format(this.dob);
        System.out.println(dobString);
        return dob;
        
    }

    public String getPassword(){
        return password;

    }

    /**
     *
     * @param id ID yang akan diset pada customer
     */
    public void setID(int id){

        this.id=id;
    }

    /**
     *
     * @param nama Nama yang akan diset pada customer
     */
    public void setNama(String nama){

        this.nama=nama;
    }

    /**
     *
     * @param email Alamat email yang akan diset pada customer
     */
    public void setEmail(String email){
        Pattern p;
        Matcher m;
        String emailPattern="^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        p=Pattern.compile(emailPattern);
        m=p.matcher(email);
        
        if(m.matches()){
        this.email=email;
        System.out.println("Berhasil = "+this.email);
    }
        else 
        System.out.println("Salah");
    }
    
    public void setDOB(Date dob){
        this.dob=dob;
    }

    public void setPassword(String password){
     this.password=password;
    }
    /**
     *
     * @return String Data dari Customer dalam bentuk string
     */
    public String toString(){
        String custID = "ID : "+this.id+"\n";
        String custName = "Name : "+this.nama+"\n";
        String custEmail = "E-mail : "+this.email+"\n";
        String custDOB = "DOB : "+this.dob+"\n";

        if(DatabasePesanan.getPesananAktif(this)!=null)
        return custID+custName+custEmail+custDOB+"Booking order is in Progress\n";

        else 
        return custID+custName+custEmail+custDOB;
    }
    /*public void printData(){// berfungsi melakukan
        System.out.println("Customer");
        System.out.println("ID = "+id);
        System.out.println("Nama = "+nama);
    }*/
}
