package jhotel;
import java.util.*;
import java.text.*;
import java.time.*;
/**
 * Pemroses pesanan
 *
 * @author Aria Lesmana
 * @version 1.5
 * @since 22-3-2018
 *
 *
 */
public class Pesanan
{
   private int id;
   private double biaya;
   private double jumlahHari;
   private Customer pelanggan;
   private boolean isAktif;
   private boolean IsDiproses;
   private boolean IsSelesai;
   private Room kamar;
   private Date tanggalPesan;
   /**
    * Constructor for objects of class Pesanan
    */
   public Pesanan(double jumlahHari,Customer pelanggan){ //constructor Pesanan
       this.jumlahHari=jumlahHari;
       this.pelanggan=pelanggan;
       //this.kamar=kamar;
       //this.biaya=(kamar.getDailyTariff())*jumlahHari;
       tanggalPesan = new Date();
       isAktif=true;
       id=DatabasePesanan.getLastPesananID()+1;
   }
   
   /*public Pesanan(double jumlahHari,Customer pelanggan,Date tanggalPesan){ //constructor Pesanan
       this.jumlahHari=jumlahHari;
       this.pelanggan=pelanggan;
       //this.kamar=kamar;
       this.biaya=(kamar.getDailyTariff())*jumlahHari;
       this.tanggalPesan=tanggalPesan;
      
   }*/
   public int getID(){
       return id; 
   }
   /**
    * @return biaya
    */
   public double getBiaya(){           //accessor untuk memanggil nilai variabel biaya
       return biaya;                   
   }

    /**
     *
     * @return jumlahHari
     */
   public double getJumlahHari(){
       return jumlahHari;
   }

    /**
     *
     * @return pelanggan
     */
   public Customer getPelanggan(){     //accessor untuk memanggil nilai variabel pelanggan
       return pelanggan;
   }

    /**
     *
     * @return
     */
   public boolean getStatusAktif(){
       return isAktif;
   }

    /**
     *
     * @return
     */
   public boolean getStatusDiproses(){ //accessor untuk memanggil nilai variabel boolean IsDiproses
       return IsDiproses;    
   }

    /**
     *
     * @return
     */
   public boolean getStatusSelesai(){  //accessor untuk memanggil nilai variabel boolean IsSelesai
       return IsSelesai;    
   }

    /**
     *
     * @return
     */
   public Room getRoom(){
       return kamar;
   }

    /**
     *
     * @return
     */
   public Date getTanggalPesan(){
       DateFormat dateFormatter = new SimpleDateFormat("'Tanggal Pesan: 'dd MMMM yyyy");
       String dateString = dateFormatter.format(this.tanggalPesan);
       System.out.println(dateString);
       return tanggalPesan;
   }

    /**
     *
     *
     */
   public void setBiaya(){ //mutator untuk memasukkan nilai variabel biaya
       this.biaya=(kamar.getDailyTariff())*jumlahHari;
   }

    /**
     *
     * @param jumlahHari
     */
   public void setJumlahHari(double jumlahHari){
       this.jumlahHari=jumlahHari;
   }

    /**
     *
     *
     * @param pelanggan
     */
   public void setPelanggan(Customer pelanggan){    //mutator untuk memasukkan nilai variabel Pelanggan
       this.pelanggan=pelanggan;
   }

    /**
     *
     * @param aktif
     */
   public void setStatusAktif(boolean aktif){
       isAktif=aktif;
   }

    /**
     *
     * @param diproses
     */
   public void setStatusDiproses(boolean diproses){    //mutator untuk memasukkan nilai variabel IsDiproses
       IsDiproses=diproses;
   }

    /**
     *
     * @param diproses
     */
   public void setStatusSelesai(boolean diproses){ //mutator untuk memasukkan nilai variabel IsSelesai
       IsSelesai=diproses;
   }

    /**
     *
     * @param kamar
     */
   public void setRoom(Room kamar){
       this.kamar=kamar;
   }

    /**
     *
     * @param tanggalPesan
     */
   public void setTanggalPesan(Date tanggalPesan){
       this.tanggalPesan=tanggalPesan;
   }

    /**
     *
     * @return
     */
   public String toString(){
        String pesanCust = "Dibuat oleh "+pelanggan.getNama()+"\n";
        String final_status="KOSONG";
       
        if(getStatusDiproses()==true && getStatusSelesai()==false)
        final_status="DIPROSES";
       
        else if(getStatusDiproses()==false && getStatusSelesai()==true)
        final_status="SELESAI";
       
        else if(getStatusDiproses()==false && getStatusSelesai()==false)
        final_status="KOSONG";
       
        String pesanStatus = "Status : "+final_status+"\n";
        if(kamar == null)
        return pesanCust+pesanStatus;
        else
        {   
            String pesanHotel = "Booking untuk "+kamar.getHotel().getNama()+"\n";
            String pesanNoKamar = "Kamar nomor "+kamar.getNomorKamar()+"\n";
            String pesanTipeKamar = "Tipe Kamar "+kamar.getTipeKamar()+"\n";
            return pesanCust+pesanHotel+pesanNoKamar+pesanTipeKamar+pesanStatus;
        }
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
