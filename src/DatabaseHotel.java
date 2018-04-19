import java.util.ArrayList;
/**
 * Write a description of class DatabaseHotel here.
 *
 * @author Aria Lesmana
 * @version 1.6
 * @since 12-3-2018
 */
public class DatabaseHotel
{
    // instance variables - replace the example below with your own
    private static ArrayList<Hotel> HOTEL_DATABASE=new ArrayList<Hotel>();;
    private static int LAST_HOTEL_ID=0;



    /**
     * An example of a method - replace this comment with your own
     *
     * @param
     * @return    the sum of x and y
     */
    

    public static ArrayList<Hotel> getHotelDatabase(){
        return HOTEL_DATABASE;
    }
    public static int getLastHotelID(){
        return LAST_HOTEL_ID;
    }
    public static boolean addHotel(Hotel baru) throws HotelSudahAdaException {
        //if(HOTEL_DATABASE.contains(baru.getID()))
        for (int i = 0; i < HOTEL_DATABASE.size(); i++) {
            Hotel findHotel = HOTEL_DATABASE.get(i);
            if ( (findHotel.getID()==baru.getID())||(findHotel.getNama()==baru.getNama() && findHotel.getLokasi()==baru.getLokasi()) )
            {
                throw new HotelSudahAdaException(baru);
                //return false;
            }
        }
        HOTEL_DATABASE.add(baru);
        LAST_HOTEL_ID=baru.getID();
        return true;
    }
    public static Hotel getHotel(int id){
        for(Hotel findHotel : HOTEL_DATABASE)
        {
            if(findHotel.getID() == id)
            {
                return findHotel;
            }           
            else
            return null;
        }
        return null;
    }
    public static boolean removeHotel(int id) throws HotelTidakDitemukanException /*, RoomTidakDitemukanException*/ {
        for(Hotel findHotel : HOTEL_DATABASE)
        {
            if(findHotel.getID() == id)
            {
                try {
                for(Room findRoom : DatabaseRoom.getRoomsFromHotel(findHotel)) {

                        DatabaseRoom.removeRoom(findHotel, findRoom.getNomorKamar());
                    }
                    }
                catch (RoomTidakDitemukanException e){
                    return false;
                }
                HOTEL_DATABASE.remove(findHotel); 
                return true;
            }
            
        }
        throw new HotelTidakDitemukanException(id);
        //return false;
    }
}
