package Modul3;


/**
 * Enumeration class StatusPemain - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum StatusPemain
{
    FIT("Sehat"),INJURY("Cedera"),DOUBT("Diragukan");
    private String deskripsi;

    StatusPemain(String deskripsi){
    this.deskripsi=deskripsi;
    }
    
    public String toString(){
    return deskripsi;
    }
}

