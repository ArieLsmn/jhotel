import java.util.ArrayList;
/**
 * Write a description of class DatabaseRoom here.
 *
 * @author Aria Lesmana
 * @version 1.6
 * @since 12-3-2018
 */
public class DatabaseRoom
{
    // instance variables - replace the example below with your own
    private static ArrayList<Room> ROOM_DATABASE=new ArrayList<Room>();

    /**
     * Constructor for objects of class DatabaseRoom
     */
    public DatabaseRoom()
    {
        // initialise instance variables
    
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param
     * @return    the sum of x and y
     */
    public static ArrayList<Room> getRoomDatabase()
    {
        return ROOM_DATABASE;
    }
    
    public static boolean addRoom(Room baru) throws RoomSudahAdaException {
        for(Room kamar : ROOM_DATABASE)
        {
            if(!((kamar.getHotel()).equals(baru.getHotel())) &&
                    !((kamar.getNomorKamar()).equals(baru.getNomorKamar())))
            {
                ROOM_DATABASE.add(baru);
                return true;
            }
        }
        throw new RoomSudahAdaException(baru);
        //return false;
    }
    
    public static Room getRoom(Hotel hotel, String nomor_kamar)
    {
        for(Room kamar : ROOM_DATABASE)
        {
            if(kamar.getHotel().equals(hotel) &&
                    kamar.getNomorKamar().equals(nomor_kamar))
            {
                return kamar;
            }
        }
        return null;
    }
    
    public static ArrayList<Room> getRoomsFromHotel(Hotel hotel)
    {
        ArrayList<Room> tempRoom = new ArrayList<Room>();
        for(Room kamar : ROOM_DATABASE)
        {
            if(kamar.getHotel().equals(hotel))
            {
                tempRoom.add(kamar);
            }
        }
        return tempRoom;
    }
    
    public static ArrayList<Room> getVacantRooms()
    {
        ArrayList<Room> tempRoom = new ArrayList<Room>();
        for(Room kamar : ROOM_DATABASE)
        {
            if(kamar.getStatusKamar().equals(StatusKamar.Vacant))
            {
                tempRoom.add(kamar);
            }
        }
        return tempRoom;    
    }
    public static boolean removeRoom(Hotel hotel, String nomor_kamar) throws RoomTidakDitemukanException {
        for(Room kamar : ROOM_DATABASE)
        {
            if(kamar.getHotel().equals(hotel) &&
                    kamar.getNomorKamar().equals(nomor_kamar))
            {
                Administrasi.pesananDibatalkan(kamar);
                if(ROOM_DATABASE.remove(kamar))
                {
                    return true;
                }
            }
        }
        throw new RoomTidakDitemukanException(hotel,nomor_kamar);
        //return false;
    }
}
