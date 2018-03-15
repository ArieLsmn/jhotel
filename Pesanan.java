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
   private double biaya;
   private double jumlahHari;
   private Customer pelanggan;
   private boolean IsDiproses;
   private boolean IsSelesai;
   private Room kamar;
    /**
     * Constructor for objects of class Pesanan
     */
   public Pesanan(double jumlahHari,Customer pelanggan,Room kamar){ //constructor Pesanan
       this.jumlahHari=jumlahHari;
       this.pelanggan=pelanggan;
       this.kamar=kamar;
       this.biaya=(kamar.getDailyTariff())*jumlahHari;
   }
   
   public double getBiaya(){           //accessor untuk memanggil nilai variabel biaya
       return biaya;                   //@return biaya
   }
   
   public double getJumlahHari(){
       return jumlahHari;
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
   
   public Room getRoom(){
       return kamar;
   }
   
   public void setBiaya(double biaya){ //mutator untuk memasukkan nilai variabel biaya 
       this.biaya=(kamar.getDailyTariff())*jumlahHari;
   }
   
   public void setJumlahHari(double jumlahHari){
       this.jumlahHari=jumlahHari;
   }
   
   public void setPelanggan(Customer pelanggan){    //mutator untuk memasukkan nilai variabel Pelanggan
       this.pelanggan=pelanggan;
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
        System.out.println("Pesanan");
        System.out.println("Nama = "+pelanggan.getNama());
        System.out.println("Jumlah Hari = "+jumlahHari);
        System.out.println("Biaya = "+biaya);
        System.out.println("Status diproses = "+IsDiproses);
        System.out.println("Status selesai = "+IsSelesai);
   }
}
