
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

    /*
     * Constructor for objects of class Hotel
     */
    public Hotel(String nama,Lokasi lokasi,int bintang)
    {
        this.nama=nama;
        this.lokasi=lokasi;
        this.bintang=bintang;
    }

    /*
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
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
        System.out.println(nama);
        System.out.println(lokasi);
        System.out.println(bintang);
    }
}
