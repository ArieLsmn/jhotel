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
    private String jenis_kamar;
    private boolean IsDiproses;
    private boolean IsSelesai;
   
    /**
     * Constructor for objects of class Pesanan
     */
    public Pesanan(double biaya,Customer pelanggan){ //constructor Pesanan
    this.biaya=biaya;
    this.pelanggan=pelanggan;
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
    public boolean getStatusDiproses(){ //accessor untuk memanggil nilai variabel boolean IsDiproses
    return IsDiproses;    
   }   
    public boolean getStatusSelesai(){  //accessor untuk memanggil nilai variabel boolean IsSelesai
    return IsSelesai;    
   }
    public void setBiaya(double biaya){ //mutator untuk memasukkan nilai variabel biaya 
    this.biaya=biaya;
   }
    public void setPelanggan(Customer baru){    //mutator untuk memasukkan nilai variabel Pelanggan
    pelanggan=baru;
   }
    public void setStatusDiproses(boolean diproses){    //mutator untuk memasukkan nilai variabel IsDiproses
    IsDiproses=diproses;
   }
    public void setStatusSelesai(boolean diproses){ //mutator untuk memasukkan nilai variabel IsSelesai
    IsSelesai=diproses;
   }
    public void printData(){    //fungsi print nilai biaya
        System.out.println(biaya);
   }
}
