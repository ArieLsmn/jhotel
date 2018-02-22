
public class Pesanan
{
    private double biaya;
    private Customer pelanggan;
    private String nama_pelanggan;
    private String jenis_kamar;
    private boolean IsDiproses;
    private boolean IsSelesai;
   
    /**
     * Constructor for objects of class Pesanan
     */
    public Pesanan()
    {

    }
    public double getBiaya(){
        return biaya;
    }
    public Customer getPelanggan(){
        return pelanggan;
    }
    public boolean getStatusDiproses(){
    return false;    
    }
    
    public boolean getStatusSelesai(){
return false;    
}
public void setBiaya(double biaya){

}
public void setPelanggan(Customer baru){

}

public void setStatusDiproses(boolean diproses){

}
public void setStatusSelesai(boolean diproses){

}

}
