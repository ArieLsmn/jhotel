import java.util.*;
import java.util.regex.*;
import java.text.*;
/**
 * Pendata Customer
 *
 * @author Aria Lesmana
 * @version 1.5
 * @since 22-3-2018
 * 
 * 
 */
public class Customer
{
    protected int id;
    protected String nama;
    protected String email;
    protected Date dob;
    static Calendar cal;
    /** 
     * @param id 
     * @param nama
     */
    public Customer(int id, String nama, int tanggal, int bulan, int tahun){
       this.id=id;
       this.nama=nama;
       this.dob = new GregorianCalendar(tahun,bulan,tanggal).getTime();
    }
    
    public Customer(int id, String nama, Date dob){
       this.id=id;
       this.nama=nama;
       this.dob=dob;
    }
    
    /**
     * @return id, nomor id dari customer
    */
    public int getID()
    {

        return id;
    }
    /**
     * @return nama, nama dari customer
    */
    public String getNama(){

        return nama;
    }
    
    public String getEmail(){

        return email;
    }
    
    public Date getDOB(){
        DateFormat dateFormatter = new SimpleDateFormat("'DOB: 'dd MMMM yyyy");
        String dobString = dateFormatter.format(this.dob);
        System.out.println(dobString);
        return dob;
        
    }
    
    public void setID(int id){

        this.id=id;
    }
    
    public void setNama(String nama){

        this.nama=nama;
    }
    
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
    
    public String toString(){
        String custID = "ID : "+this.id+"\n";
        String custName = "Name : "+this.nama+"\n";
        String custEmail = "E-mail : "+this.email+"\n";
        String custDOB = "DOB : "+this.dob+"\n";
        String bookingProgress = "Booking order is in Progress\n";
        //if(DatabasePesanan.getPesanan(this)!=null)
        return custID+custName+custEmail+custDOB;

        //else 
        //return custID+custName+custEmail+custDOB+bookingProgress;
    }
    /*public void printData(){// berfungsi melakukan
        System.out.println("Customer");
        System.out.println("ID = "+id);
        System.out.println("Nama = "+nama);
    }*/
}
