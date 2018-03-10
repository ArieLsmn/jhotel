/**
 * Pemroses pesanan
 *
 * @author Aria Lesmana
 * @version 3-1-2018
 *
 *
 */
public class Pesanan
{
    private double biaya;   //instance variable
    private Customer pelanggan;
    private String nama_pelanggan;
    private TipeKamar tipe_kamar;
    private boolean IsDiproses;
    private boolean IsSelesai;
    private Room kamar;
    /**
     * Constructor for objects of class Pesanan
     */
    public Pesanan(double biaya,Customer pelanggan){ //constructor Pesanan
    this.biaya=biaya;
    this.pelanggan=pelanggan;
    nama_pelanggan=pelanggan.nama;
   }
   /**
     *
     * @return    variable biaya
     */
    public double getBiaya(){           //accessor untuk memanggil nilai variabel biaya
    return biaya;
   }
    public Customer getPelanggan(){     //accessor untuk memanggil nilai variabel pelanggan
    return pelanggan;
   }
   public String getNamaPelanggan(){
   return nama_pelanggan; 
   }
   public TipeKamar getTipeKamar(){
   return tipe_kamar;
    }
    public boolean getStatusDiproses(){ //accessor untuk memanggil nilai variabel boolean IsDiproses
    return IsDiproses;    
   }   
    public boolean getStatusSelesai(){  //accessor untuk memanggil nilai variabel boolean IsSelesai
    return IsSelesai;    
   }
   public Room getRoom(){
    return kamar;
   }
    public void setBiaya(double biaya){ //mutator untuk memasukkan nilai variabel biaya 
    this.biaya=biaya;
   }
    public void setPelanggan(Customer pelanggan){    //mutator untuk memasukkan nilai variabel Pelanggan
    this.pelanggan=pelanggan;
   }
   public void setNamaPelanggan(String nama_pelanggan){
    this.nama_pelanggan=nama_pelanggan;
   }
   public void setTipeKamar(TipeKamar tipe_kamar){
    this.tipe_kamar=tipe_kamar;
   }
    public void setStatusDiproses(boolean diproses){    //mutator untuk memasukkan nilai variabel IsDiproses
    IsDiproses=diproses;
   }
    public void setStatusSelesai(boolean diproses){ //mutator untuk memasukkan nilai variabel IsSelesai
    IsSelesai=diproses;
   }
   public void setRoom(Room kamar){
    this.kamar=kamar;
   }
    public void printData(){    //fungsi print nilai biaya
        
        System.out.println(nama_pelanggan);
        System.out.println(tipe_kamar);
        System.out.println(IsDiproses);
        System.out.println(IsSelesai);
        //System.out.println(biaya);
   }
}
