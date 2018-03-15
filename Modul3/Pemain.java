package Modul3;


/**
 * Write a description of class Pemain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pemain
{
    // instance variables - replace the example below with your own
    private String nama;
    private StatusPemain status;
    private String posisi;
    /**
     * Constructor for objects of class Pemain
     */
    public Pemain(String nama, StatusPemain status, String posisi)
    {   this.nama=nama;
        this.status=status;
        this.posisi=posisi;
        
    }

    public void setStatus(StatusPemain status){
    this.status=status;
    }
    public StatusPemain getStatus()
    {
        // put your code here
        return status;
        
    }
    public String toString(){
        String digabung= "Nama="+nama+",Status="+getStatus()+",Posisi="+posisi; 
        return digabung;
    }
    
}
