public class DoubleRoom extends Room
{
    // instance variables - replace the example below with your own
    private Customer customer2;
    private static TipeKamar TIPE_KAMAR=TipeKamar.Double;

    /**
     * Constructor for objects of class SingleRoom
     */
    public DoubleRoom(Hotel hotel,String nomor_kamar,boolean isAvailable,
    StatusKamar status_kamar)
    {
        super(hotel,nomor_kamar,isAvailable,status_kamar);
    }

    public Customer getCustomer2(){
    return customer2;
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public TipeKamar getTipeKamar()
    {
        // put your code here
        return TIPE_KAMAR;
    }
    
    public void setCustomer2(Customer customer2){
    this.customer2=customer2;
    }
}