package jhotel;
import java.util.ArrayList;
/**
 * Write a description of class DatabaseHotel here.
 *
 * @author Aria Lesmana
 * @version 1.7
 * @since 19-4-2018
 */
public class DatabaseHotel
{
    // instance variables - replace the example below with your own
    private static ArrayList<Hotel> HOTEL_DATABASE=new ArrayList<Hotel>();;
    private static int LAST_HOTEL_ID=0;



    /**
     * Untuk memperoleh ArrayList DatabaseHotel
     * @return HOTEL_DATABASE Database hotel berbentuk ArrayList
     */
    

    public static ArrayList<Hotel> getHotelDatabase(){
        return HOTEL_DATABASE;
    }

    /**
     *
     * @return LAST_HOTEL_ID Nomor ID terakhir hotel yang ditambahkan
     */
    public static int getLastHotelID(){
        return LAST_HOTEL_ID;
    }

    public static boolean addHotel(Hotel baru) throws HotelSudahAdaException {
        //if(HOTEL_DATABASE.contains(baru.getID()))
        for (int i = 0; i < HOTEL_DATABASE.size(); i++) {
            Hotel findHotel = HOTEL_DATABASE.get(i);
            if ( findHotel.getID()==baru.getID()||((findHotel.getNama()== baru.getNama()) && (findHotel.getLokasi()==baru.getLokasi())) )
            {
                throw new HotelSudahAdaException(baru);
                //return false;
            }
        else break;
        }

        LAST_HOTEL_ID=baru.getID();
        HOTEL_DATABASE.add(baru);
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
        //for(Hotel findHotel : HOTEL_DATABASE)
        for (int i = 0; i < HOTEL_DATABASE.size(); i++) {
            Hotel findHotel = HOTEL_DATABASE.get(i);
            if(findHotel.getID() == id)
            {
                    for (Room findRoom : DatabaseRoom.getRoomsFromHotel(findHotel)) {
                        try {
                            DatabaseRoom.removeRoom(findHotel, findRoom.getNomorKamar());
                        }
                        catch (RoomTidakDitemukanException e) {
                            System.out.println(e.getPesan());
                        }
                    }
                }

                HOTEL_DATABASE.remove(findHotel); 
                return true;
        }
        throw new HotelTidakDitemukanException(id);
        //return false;
    }
}
