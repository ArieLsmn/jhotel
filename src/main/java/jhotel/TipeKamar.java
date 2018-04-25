package jhotel;
/**
 * Enumeration class TipeKamar - write a description of the enum class here
 *
 * @author Aria Lesmana
 * @version 1.7
 * @since 19-4-2018
 */
public enum TipeKamar
{
    Single("Single"), 
    Double("Double"), 
    Premium("Premium");
    
    //private String tipe;
    private String deskripsi;

    /**
     *
     * @param deskripsi
     */
    TipeKamar(String deskripsi){
        this.deskripsi= deskripsi;
    }

    /**
     *
     * @return
     */
    public String toString(){ 
        return this.deskripsi;
    } 
}
