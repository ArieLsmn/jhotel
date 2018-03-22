import java.util.*;
import java.text.*;
/**
 * Pemroses pesanan
 *
 * @author Aria Lesmana
 * @version 22-3-2018
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
   private Date tanggalPesan;
    /**
     * Constructor for objects of class Pesanan
     */
   public Pesanan(double jumlahHari,Customer pelanggan,Room kamar,int tanggal, int bulan, int tahun){ //constructor Pesanan
       this.jumlahHari=jumlahHari;
       this.pelanggan=pelanggan;
       this.kamar=kamar;
       this.biaya=(kamar.getDailyTariff())*jumlahHari;
       this.tanggalPesan = new GregorianCalendar(tahun,bulan,tanggal).getTime();
   }
   
   public Pesanan(double jumlahHari,Customer pelanggan,Room kamar,Date tanggalPesan){ //constructor Pesanan
       this.jumlahHari=jumlahHari;
       this.pelanggan=pelanggan;
       this.kamar=kamar;
       this.biaya=(kamar.getDailyTariff())*jumlahHari;
       this.tanggalPesan=tanggalPesan;
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
   
   public Date getTanggalPesan(){
       DateFormat dateFormatter = new SimpleDateFormat("'Tanggal Pesan: 'dd MMMM yyyy");
       String dateString = dateFormatter.format(this.tanggalPesan);
       System.out.println(dateString);
       return tanggalPesan;
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
   
   public void setTanggalPesan(Date tanggalPesan){
       this.tanggalPesan=tanggalPesan;
   }
   
   public String toString(){
       String pesanCust = "Dibuat oleh "+pelanggan.getNama()+"\n";
       String pesanHotel = "Booking untuk "+kamar.getHotel().getNama()+"\n";
       String pesanNoKamar = "Kamar nomor "+kamar.getNomorKamar()+"\n";
       String pesanTipeKamar = "Tipe Kamar "+kamar.getTipeKamar()+"\n";
       String final_status="KOSONG";
       
       if(getStatusDiproses()==true && getStatusSelesai()==false)
       final_status="DIPROSES";
       
       else if(getStatusDiproses()==false && getStatusSelesai()==true)
       final_status="SELESAI";
       
       else if(getStatusDiproses()==false && getStatusSelesai()==false)
       final_status="KOSONG";
       
       String pesanStatus = "Status : "+final_status+"\n";
       return pesanCust+pesanHotel+pesanNoKamar+pesanTipeKamar+pesanStatus;
   }
   /*public void printData(){    //fungsi print nilai biaya     
        System.out.println("Pesanan");
        System.out.println("Nama = "+pelanggan.getNama());
        System.out.println("Jumlah Hari = "+jumlahHari);
        System.out.println("Biaya = "+biaya);
        System.out.println("Status diproses = "+IsDiproses);
        System.out.println("Status selesai = "+IsSelesai);
   }*/
}
