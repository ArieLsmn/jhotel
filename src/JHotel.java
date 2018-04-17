/**
 * Class program utama
 *
 * @author Aria Lesmana
 * @version 1.6
 * @since 12-4-2018
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
        Customer A = new Customer("A",5,1,1998);
        DatabaseCustomer.addCustomer(A);
        Customer B = new Customer("B",17,8,1945);
        DatabaseCustomer.addCustomer(B);
        Customer C = new Customer("C",6,6,1996);
        DatabaseCustomer.addCustomer(C);
        //System.out.println(DatabaseCustomer.getCustomerDatabase());

        for (int i=0;i<DatabaseCustomer.getCustomerDatabase().size();i++){
            System.out.println(DatabaseCustomer.getCustomerDatabase().get(i).toString());
        }
        /*Customer getA = DatabaseCustomer.getCustomer(A.getID());
        Customer getB = DatabaseCustomer.getCustomer(B.getID());
        Customer getC = DatabaseCustomer.getCustomer(C.getID());
        System.out.println(getA.toString());
        System.out.println(getB.toString());
        System.out.println(getC.toString());*/

        Hotel D = new Hotel("D",new Lokasi(1,1,"D"),5);
        DatabaseHotel.addHotel(D);
        Hotel E = new Hotel("E",new Lokasi(2,2,"E"),5);
        DatabaseHotel.addHotel(E);
        Hotel F = new Hotel("F",new Lokasi(3,3,"F"),5);
        DatabaseHotel.addHotel(F);
        //System.out.println(DatabaseHotel.getHotelDatabase());
        for (int i=0;i<DatabaseHotel.getHotelDatabase().size();i++){
            System.out.println(DatabaseHotel.getHotelDatabase().get(i).toString());
        }
        /*
        Hotel getD = DatabaseHotel.getHotel(D.getID());
        Hotel getE = DatabaseHotel.getHotel(E.getID());
        Hotel getF = DatabaseHotel.getHotel(F.getID());
        System.out.println(getD.toString());
        System.out.println(getE.toString());
        System.out.println(getF.toString());*/
        
        Room D1 = new SingleRoom(D,"A101",true,StatusKamar.Vacant);
        DatabaseRoom.addRoom(D1);
        Room D2 = new PremiumRoom(D,"D404",true,StatusKamar.Booked);
        DatabaseRoom.addRoom(D2);
        Room E1 = new DoubleRoom(E,"B202",true,StatusKamar.Vacant);
        DatabaseRoom.addRoom(E1);
        Room F1 = new PremiumRoom(F,"C303",true,StatusKamar.Vacant);
        DatabaseRoom.addRoom(F1);
        for (int i=0;i<DatabaseRoom.getRoomDatabase().size();i++){
            System.out.println(DatabaseRoom.getRoomDatabase().get(i).toString());
        }
        /*
        Room getD1 = DatabaseRoom.getRoom(D1.getHotel(),D1.getNomorKamar());
        Room getD2 = DatabaseRoom.getRoom(D2.getHotel(),D2.getNomorKamar());
        Room getE1 = DatabaseRoom.getRoom(E1.getHotel(),E1.getNomorKamar());
        Room getF1 = DatabaseRoom.getRoom(F1.getHotel(),F1.getNomorKamar());
        System.out.println(getD1.toString());
        System.out.println(getD2.toString());
        System.out.println(getE1.toString());
        System.out.println(getF1.toString());*/
        Pesanan pesanA = new Pesanan(3,A);
        DatabasePesanan.addPesanan(pesanA);
        Pesanan pesanB = new Pesanan(5,B);
        DatabasePesanan.addPesanan(pesanB);
        Pesanan pesanC = new Pesanan(1,C);
        DatabasePesanan.addPesanan(pesanC);

        for (int i=0;i<DatabasePesanan.getPesananDatabase().size();i++){
            System.out.println(DatabasePesanan.getPesananDatabase().get(i).toString());
        }
        Administrasi.pesananDitugaskan(pesanA,D1);
        Administrasi.pesananDitugaskan(pesanA,D2);
        Administrasi.pesananDitugaskan(pesanB,E1);
        Administrasi.pesananDitugaskan(pesanC,F1);
        System.out.println("Pesanan ditugaskan");
        for (int i=0;i<DatabasePesanan.getPesananDatabase().size();i++){
            System.out.println(DatabasePesanan.getPesananDatabase().get(i).toString());
        }
        Administrasi.pesananSelesai(pesanA);
        Administrasi.pesananSelesai(pesanB);
        Administrasi.pesananDibatalkan(pesanC);
        System.out.println("Pesanan Selesai dan Dibatalkan");
        for (int i=0;i<DatabasePesanan.getPesananDatabase().size();i++){
            System.out.println(DatabasePesanan.getPesananDatabase().get(i).toString());
        }
        /*
       Lokasi lokasi1 = new Lokasi(100,100,"Indonesia");
       Hotel hotel1 = new Hotel("Prodeo",lokasi1,5);
       Room sroom1= new SingleRoom(hotel1,"101",true,StatusKamar.Booked);
       sroom1.setDailyTariff(100000.0);
       //Customer customer1 = new Customer(1,"Aria L");
       //Pesanan pesanan1 = new Pesanan(3.0,customer1,sroom1);
       //lokasi1.printData();
       //customer1.printData();
       //hotel1.printData();
       
       System.out.println("\n-----Method 1-----");
       Administrasi.pesananDitugaskan(pesanan1,sroom1);
       //sroom1.printData();
       //pesanan1.printData();
       if(sroom1 instanceof DoubleRoom)
       {
       System.out.println("Benar, Double Room");
       }
       else System.out.println("Salah, bukan Double Room");
       
       System.out.println("\n-----Method 2-----");
       Room droom1= new DoubleRoom(hotel1,"301",true,StatusKamar.Booked);
       droom1.setDailyTariff(200000.0);
       //Pesanan pesanan2 = new Pesanan(3.0,customer1,droom1);
       //Administrasi.pesananDitugaskan(pesanan2,droom1);
       //droom1.printData();
       //pesanan2.printData();
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
