
/**
 * Enumeration class TipeKamar - write a description of the enum class here
 *
 * @author Aria Lesmana
 * @version 22-3-2018
 */
public enum TipeKamar
{
    Single("Single"), 
    Double("Double"), 
    Premium("Premium");
    
    //private String tipe;
    private String deskripsi;
    TipeKamar(String deksripsi){
        this.deskripsi=deskripsi;
    }
   
    public String toString(){ 
        return deskripsi; 
    } 
}
