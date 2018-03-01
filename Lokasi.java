
/**
 * Penyimpan lokasi disertai koordinat
 *
 * @author Aria Lesmana
 * @version 3-1-2018
 * 
 * 
 */
public class Lokasi
{
    // instance variables - replace the example below with your own
    private float x_coord;
    private float y_coord;
    private String deskripsiLokasi;
    /**
     * Constructor for objects of class Lokasi
     */
    public Lokasi(float x_coord,float y_coord,String deskripsiLokasi)
    {
        this.x_coord=x_coord;
        this.y_coord=y_coord;
        this.deskripsiLokasi=deskripsiLokasi;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public float getX()
    {
        return x_coord;
    }
    
    public float getY()
    {
        return y_coord;
    }
    
    public String getDeskripsi()
    {
        return deskripsiLokasi;
    }
    public void setX(float x_coord)
    {
        this.x_coord=x_coord;
    }
    
    public void setY(float y_coord)
    {
        this.y_coord=y_coord;
    }
    public void setDeskripsi(String deskripsi){
        deskripsiLokasi=deskripsi;
    }
    public void printData(){
        System.out.println(deskripsiLokasi);
    }
}
