package Modul4;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    // instance variables - replace the example below with your own
    static Binatang binatang1;
    static Binatang binatang2;
    static Mamalia binatang3;
    /**
     * Constructor for objects of class Main
     */
    public Main()
    {

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String args[])
    {  
       binatang1=new Binatang();
       binatang2=new Mamalia();
       binatang3=new Mamalia();  
       System.out.println(binatang1.banyakKaki);
       System.out.println(binatang2.banyakKaki);
       System.out.println(binatang3.banyakKaki);
       binatang1.habitat();
       binatang2.habitat();
       binatang3.habitat();
       //binatang1.jenisSpesies();
       //binatang2.jenisSpesies();
       binatang3.jenisSpesies();
    }
}
