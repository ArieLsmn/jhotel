package jhotel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * Class program utama JHotel
 *
 * @author Aria Lesmana
 * @version 1.7
 * @since 19-4-2018
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
    public static void main (String args[]) throws PelangganSudahAdaException, HotelSudahAdaException, RoomSudahAdaException, PesananSudahAdaException , PelangganTidakDitemukanException, PesananTidakDitemukanException
    {
        SpringApplication.run(JHotel.class,args);
        /*System.out.println("---TES EXCEPTION---\n");
        System.out.println("\nPelanggan sudah ada\n");
        Customer A = new Customer("A", 5, 1, 1998, "aaa@gmail.com");
        try
        {
            DatabaseCustomer.addCustomer(A);
        }
        catch (PelangganSudahAdaException e){
            System.out.println(e.getPesan());
        }
        Customer B = new Customer("B", 17, 8, 1945, "bbb@yahoo.com");
        try
        {
            DatabaseCustomer.addCustomer(B);
            DatabaseCustomer.addCustomer(B);
        }
        catch (PelangganSudahAdaException e){
            System.out.println(e.getPesan());
        }
        Customer C = new Customer("C", 6, 6, 1996, "ccc@rocketmail.com");
        try
        {
            DatabaseCustomer.addCustomer(C);
            DatabaseCustomer.addCustomer(A);
        }
        catch (PelangganSudahAdaException e){
            System.out.println(e.getPesan());
        }
        //System.out.println(DatabaseCustomer.getCustomerDatabase());

        /*for (int i=0;i<DatabaseCustomer.getCustomerDatabase().size();i++){
            System.out.println(DatabaseCustomer.getCustomerDatabase().get(i).toString());
        }*/
        /*System.out.println("\nHotel sudah ada\n");
        Hotel D = new Hotel("D",new Lokasi(1,1,"Depok"),5);
        try {
            DatabaseHotel.addHotel(D);
        }
        catch(HotelSudahAdaException e){
            System.out.println(e.getPesan());
        }
        Hotel E = new Hotel("E",new Lokasi(2,2,"Empang"),5);
        try {
            DatabaseHotel.addHotel(E);
            DatabaseHotel.addHotel(E);
        }
        catch(HotelSudahAdaException e){
            System.out.println(e.getPesan());
        }
        Hotel F = new Hotel("F",new Lokasi(3,3,"Blok F"),5);
        try {
            DatabaseHotel.addHotel(F);
        }
        catch(HotelSudahAdaException e){
            System.out.println(e.getPesan());
        }
        Hotel G = new Hotel("G",new Lokasi(4,4,"Garut"),5);
        try {
            DatabaseHotel.addHotel(G);
            DatabaseHotel.addHotel(F);
        }
        catch(HotelSudahAdaException e){
            System.out.println(e.getPesan());
        }
        //System.out.println(DatabaseHotel.getHotelDatabase());
        /*for (int i=0;i<DatabaseHotel.getHotelDatabase().size();i++){
            System.out.println(DatabaseHotel.getHotelDatabase().get(i).toString());
        }*/

        /*System.out.println("\nKamar sudah ada\n");
        Room D1 = new SingleRoom(D,"A101");
        try {
            DatabaseRoom.addRoom(D1);
        }
        catch(RoomSudahAdaException e){
            System.out.println(e.getPesan());
        }
        Room D2 = new PremiumRoom(D,"D404");
        try {
            DatabaseRoom.addRoom(D2);
            DatabaseRoom.addRoom(D1);
        }
        catch(RoomSudahAdaException e){
            System.out.println(e.getPesan());
        }
        Room E1 = new DoubleRoom(E,"B202");
        try {
            DatabaseRoom.addRoom(E1);
            DatabaseRoom.addRoom(E1);
        }
        catch(RoomSudahAdaException e){
            System.out.println(e.getPesan());
        }
        Room F1 = new PremiumRoom(F,"C303");
        try {
            DatabaseRoom.addRoom(F1);
        }
        catch(RoomSudahAdaException e){
            System.out.println(e.getPesan());
        }
        /*for (int i=0;i<DatabaseRoom.getRoomDatabase().size();i++){
            System.out.println(DatabaseRoom.getRoomDatabase().get(i).toString());
        }*/
        /*System.out.println("\nPesanan sudah ada\n");
        Pesanan pesanA = new Pesanan(3,A);
        try {
            DatabasePesanan.addPesanan(pesanA);
        }
        catch(PesananSudahAdaException e){
            System.out.println(e.getPesan());
        }
        Pesanan pesanB = new Pesanan(5,B);
        try {
            DatabasePesanan.addPesanan(pesanB);
            DatabasePesanan.addPesanan(pesanB);
        }
        catch(PesananSudahAdaException e){
            System.out.println(e.getPesan());
        }
        Pesanan pesanC = new Pesanan(1,C);
        try {
            DatabasePesanan.addPesanan(pesanC);
            DatabasePesanan.addPesanan(pesanB);
        }
        catch(PesananSudahAdaException e){
            System.out.println(e.getPesan());
        }
        System.out.println("\nPelanggan tidak ditemukan\n");
        try
        {
            DatabaseCustomer.removeCustomer(2);
            DatabaseCustomer.removeCustomer(2);
        }
        catch (PelangganTidakDitemukanException e){
            System.out.println(e.getPesan());
        }
        System.out.println("\nHotel tidak ditemukan\n");
        try
        {
            DatabaseHotel.removeHotel(2);
//            DatabaseHotel.removeHotel(2);
        }
        catch (HotelTidakDitemukanException e){
            System.out.println(e.getPesan());
        }
/*        System.out.println("\nKamar tidak ditemukan\n");
        try
        {
            DatabaseRoom.removeRoom(D,"A101");
            DatabaseRoom.removeRoom(D,"A101");
        }
        catch (RoomTidakDitemukanException e){
            System.out.println(e.getPesan());
        }
        System.out.println("\nPesanan tidak ditemukan\n");
        try
        {
            DatabasePesanan.removePesanan(pesanC);
            DatabasePesanan.removePesanan(pesanC);
        }
        catch (PesananTidakDitemukanException e){
            System.out.println(e.getPesan());
        }
        /*
        for (int i=0;i<DatabasePesanan.getPesananDatabase().size();i++){
            System.out.println(DatabasePesanan.getPesananDatabase().get(i).toString());
        }*/
        /*System.out.println("\nHASIL AKHIR");
        System.out.println("\nPelanggan\n");
        for (int i=0;i<DatabaseCustomer.getCustomerDatabase().size();i++){
            System.out.println(DatabaseCustomer.getCustomerDatabase().get(i).toString());
        }
        System.out.println("\nHotel\n");
        for (int i=0;i<DatabaseHotel.getHotelDatabase().size();i++){
            System.out.println(DatabaseHotel.getHotelDatabase().get(i).toString());
        }
        System.out.println("\nKamar\n");
        for (int i=0;i<DatabaseRoom.getRoomDatabase().size();i++){
            System.out.println(DatabaseRoom.getRoomDatabase().get(i).toString());
        }
        System.out.println("\nPesanan\n");
        for (int i=0;i<DatabasePesanan.getPesananDatabase().size();i++){
            System.out.println(DatabasePesanan.getPesananDatabase().get(i).toString());
        }


        /*
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
        }*/
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
