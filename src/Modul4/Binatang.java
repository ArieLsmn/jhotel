package Modul4;


/**
 * Write a description of class Binatang here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Binatang implements Kelinci
{
    // instance variables - replace the example below with your own
    public int banyakKaki=4;

    /**
     * Constructor for objects of class Binatang
     */
    public Binatang()
    {
        // initialise instance variables //this.banyakKaki = 4;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void habitat()
    {
        System.out.println("Tinggal di Kebon");
        
    }
    
    public void jenisMakanan()
    {   
        System.out.println("Rumput");
    }
    
    public void jenisSpesies(){}
}
