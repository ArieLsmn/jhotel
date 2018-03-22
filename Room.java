
/**
 * Write a description of class Room here.
 *
 * @author Aria Lesmana
 * @version 15-3-2018
 */
public abstract class Room
{
    // instance variables - replace the example below with your own
    private Hotel hotel;
    private String nomor_kamar;
    private boolean isAvailable;
    private StatusKamar status_kamar;
    private Pesanan pesan;
    protected double dailyTariff;

    /**
     * Constructor for objects of class Room
     */
    public Room(Hotel hotel,String nomor_kamar,boolean isAvailable,
                StatusKamar status_kamar){
        this.hotel=hotel;
        this.nomor_kamar=nomor_kamar;
        this.isAvailable=isAvailable;
        this.pesan=pesan;
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
        return hotel;    
    }
    
    public String getNomorKamar(){
        return nomor_kamar;
    }
    
    public boolean getStatusAvailable(){
        return isAvailable;
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
    abstract public TipeKamar getTipeKamar();
    
    public void setHotel(Hotel hotel)
    {
        this.hotel=hotel;    
    }
    
    public void setNomorKamar(String nomor_kamar){
        this.nomor_kamar=nomor_kamar;
    }
    
    public void setStatusAvailable(boolean isAvailable){
        this.isAvailable=isAvailable;
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
    
    public String toString(){
        String roomHotel = "Hotel : "+hotel.getNama()+"\n";
        String roomTipe = "Tipe : "+getTipeKamar()+"\n";
        String roomHarga = "Harga : "+dailyTariff+"\n";
        String roomStatus = "Status : "+status_kamar+"\n";
        String roomCust = "Pelanggan : "+pesan.getPelanggan().getNama()+"\n";
        if(pesan.getPelanggan()!= null)
        return roomHotel+roomTipe+roomHarga+roomStatus+roomCust;
        
        else
        return roomHotel+roomTipe+roomHarga+roomStatus;
    }
    /*public void printData(){
        System.out.println("Room");
        System.out.println("Hotel = "+hotel.getNama());
        System.out.println("Nomor = "+nomor_kamar);
        System.out.println("Tipe = "+getTipeKamar());
        System.out.println("Tersedia = "+isAvailable); 
        System.out.println("Status = "+status_kamar);
        System.out.println("Harga = "+dailyTariff);
    }*/
    
}
