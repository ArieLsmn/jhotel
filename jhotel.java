/**
 * Class program utama
 *
 * @author Aria Lesmana
 * @version 3-1-2018
 */
public class JHotel
{
    protected static Lokasi lokasi1;
    protected static Customer customer1;
    protected static Hotel hotel1;
    protected static SingleRoom sroom1;
    protected static Pesanan pesanan1;
    public JHotel()
    {

    }
    public static void main (String args[])
    { 
       Lokasi lokasi1 = new Lokasi(100,100,"Indonesia");
       Hotel hotel1 = new Hotel("Prodeo",lokasi1,5);
       Room sroom1= new SingleRoom(hotel1,"101",true,StatusKamar.Booked);
       sroom1.setDailyTariff(100000.0);
       Customer customer1 = new Customer(1,"Aria L");
       Pesanan pesanan1 = new Pesanan(3.0,customer1,sroom1);
       lokasi1.printData();
       customer1.printData();
       hotel1.printData();
       
       System.out.println("\n-----Method 1-----");
       Administrasi.pesananDitugaskan(pesanan1,sroom1);
       sroom1.printData();
       pesanan1.printData();
       if(sroom1 instanceof DoubleRoom)
       {
       System.out.println("Benar, Double Room");
       }
       else System.out.println("Salah, bukan Double Room");
       
       Room droom1= new DoubleRoom(hotel1,"301",true,StatusKamar.Booked);
       Pesanan pesanan2 = new Pesanan(3.0,customer1,droom1);
       droom1.setDailyTariff(200000.0);
       Administrasi.pesananDitugaskan(pesanan2,droom1);
       droom1.printData();
       pesanan2.printData();
       if(droom1 instanceof DoubleRoom)
       {
       System.out.println("Benar, Double Room");
       }
       else System.out.println("Salah, bukan Double Room");
       /*System.out.println("\n-----Method 2-----");
       Administrasi.pesananDibatalkan(room1);
       room1.printData();
       pesanan1.printData();
       System.out.println("\n-----Method 3-----");
       Administrasi.pesananSelesai(room1);
       room1.printData();
       pesanan1.printData();
       System.out.println("\n-----Method 4-----");
       Administrasi.pesananDibatalkan(pesanan1);
       room1.printData();
       pesanan1.printData();
       System.out.println("\n-----Method 5-----");
       Administrasi.pesananSelesai(pesanan1);
       room1.printData();
       pesanan1.printData();*/
    }
}
