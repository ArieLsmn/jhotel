
/**
 * Enumeration class StatusKamar - write a description of the enum class here
 *
 * @author Aria Lesmana
 * @version 22-3-2018
 */
public enum StatusKamar
{
    Booked("Booked"), 
    Processed("Processed"),
    Vacant("Vacant");
    
    //private String status;
    private String deskripsi;
    StatusKamar(String deskripsi){
        this.deskripsi=deskripsi;
    }
    
    public String toString(){ 
        return deskripsi; 
    } 
}

