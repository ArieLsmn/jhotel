
/**
 * Write a description of class Room here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Room
{
    // instance variables - replace the example below with your own
    private Hotel hotel;
    private int id;
    private String nomor_kamar;
    private boolean isAvailable;
    private Customer customer;
    private double dailyTariff;
    private StatusKamar status_kamar;
    private Pesanan pesan;

    /**
     * Constructor for objects of class Room
     */
    public Room(Hotel hotel,String nomor_kamar,boolean isAvailable,Customer customer,double dailyTariff,StatusKamar status_kamar){
        this.hotel=hotel;
        this.nomor_kamar=nomor_kamar;
        this.isAvailable=isAvailable;
        this.customer=customer;
        this.dailyTariff=dailyTariff;
        this.status_kamar=status_kamar;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Hotel getHotel(){
        // put your code here
    return hotel;    
    }
    
    public int getID(){
    
        return id;
    }
    
    public String getNomorKamar(){
    return nomor_kamar;
    }
    
    public boolean getStatusAvailable(){
    return isAvailable;
    }
    
    public Customer getCustomer(){
    return customer;
   
    }
    
    public double getDailyTariff(){
    return dailyTariff;
    }
    
    public StatusKamar getStatusKamar(){
    return status_kamar;
    }
    
    public Pesanan getPesanan(){
    return pesan;
    }
    
        public void setHotel(Hotel hotel)
    {
        this.hotel=hotel;    
    }
    
    public void setID(int id){
    this.id=id;
   
    }
    
    public void setNomorKamar(String nomor_kamar){
    this.nomor_kamar=nomor_kamar;
    }
    
    public void setStatusAvailable(boolean isAvailable){
    this.isAvailable=isAvailable;
    }
    
    public void setCustomer(Customer customer){
    this.customer=customer;
   
    }
    
    public void setDailyTariff(double dailyTariff){
    this.dailyTariff=dailyTariff;
    }
    
    public void setStatusKamar(StatusKamar status_kamar){
    this.status_kamar=status_kamar;
    }
    
    public void setPesanan(Pesanan pesan){
    this.pesan=pesan;
    }
    
    public void printData(){
    System.out.print("Room");
    System.out.print("Hotel=");
    System.out.println(hotel.getNama());
    System.out.print("Nomor=");
    System.out.println(nomor_kamar);
    System.out.print("Tersedia=");
    System.out.println(isAvailable);
    System.out.print("Pelanggan=");
    System.out.println(customer.getNama());
    System.out.print("Harga=");
    System.out.println(dailyTariff);
    System.out.print("Status=");
    System.out.println(status_kamar);
    System.out.print("Pesanan");
    System.out.print("Nama=");
    System.out.println(customer.getNama());
    System.out.print("Tipe=");
    System.out.println(pesan.getTipeKamar());
    System.out.print("Status Layanan Diproses=");
    System.out.println(pesan.getStatusDiproses());
    System.out.print("Status Layanan Selesai=");
    System.out.println(pesan.getStatusSelesai());
    }
}
