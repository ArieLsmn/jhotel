package jhotel;
/**
 * Enumeration class StatusKamar - write a description of the enum class here
 *
 * @author Aria Lesmana
 * @version 1.7
 * @since 19-4-2018
 */
public enum StatusKamar
{
    Booked("Booked"), 
    Processed("Processed"),
    Vacant("Vacant");
    
    //private String status;\
    private String deskripsi;

    /**
     *
     * @param deskripsi
     */
    StatusKamar(String deskripsi){ this.deskripsi=deskripsi; }

    /**
     *
     * @return
     */
    public String toString(){ 
        return this.deskripsi;
    } 
}

