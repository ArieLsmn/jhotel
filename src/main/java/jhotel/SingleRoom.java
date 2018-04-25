package jhotel;
/**
 * Write a description of class SingleRoom here.
 *
 * @author Aria Lesmana
 * @version 1.7
 * @since 19-4-2018
 */
public class SingleRoom extends Room
{
    // instance variables - replace the example below with your own
    private static TipeKamar TIPE_KAMAR=TipeKamar.Single;

    /**
     * Constructor for objects of class SingleRoom
     */
    public SingleRoom(Hotel hotel,String nomor_kamar)
    {   super(hotel,nomor_kamar);

    }

    /**
     *
     * @return
     */
    public TipeKamar getTipeKamar()
    {
        // put your code here
        return TIPE_KAMAR;
    }
}
