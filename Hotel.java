
/**
 * Pendata Hotel
 *
 * @author Aria Lesmana
 * @version 3-1-2018
 * 
 * 
 */
public class Hotel
    {
    private String nama;
    private Lokasi lokasi;// instance variables - replace the example below with your own
    private int bintang;
    
    public Hotel(String nama,Lokasi lokasi,int bintang)
    {
        this.nama=nama;
        this.lokasi=lokasi;
        this.bintang=bintang;
    }
    
    public int getBintang()
    {
        return bintang;
    }
    
    public String getNama(){
        return nama;
    }
    
    public Lokasi getLokasi(){
        return lokasi;
    }

    public void setNama(String nama){
        this.nama=nama;
    }
    
    public void setLokasi(Lokasi lokasi){
        this.lokasi=lokasi;
    }
        
    public void setBintang(int bintang)
    {
        this.bintang=bintang;
    }
    
    public void printData(){
        System.out.println("Hotel");
        System.out.println("Nama = "+nama);
        System.out.println("Lokasi = "+lokasi.getDeskripsi());
        System.out.println("Bintang = "+bintang);
    }
}
