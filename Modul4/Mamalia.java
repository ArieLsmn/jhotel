package Modul4;


/**
 * Write a description of class Mamalia here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mamalia extends Binatang implements Kelinci
{
    // instance variables - replace the example below with your own
    public int banyakKaki=2;
    public void jenisSpesies(){
    
    }
    
    /**
     * Constructor for objects of class Mamalia
     */
    public Mamalia()
    {
        
        //this.banyakKaki=2;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void habitat()
    {
        System.out.println("Tinggal di Darat");
        
    }
    
    public void jenisMakanan(){
        
        System.out.println("Terserah");
    }
    
}
