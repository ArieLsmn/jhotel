package jhotel.controller;

import jhotel.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
public class RoomController {

    @RequestMapping(value="/vacantrooms", method=RequestMethod.GET)
    public ArrayList<Room> vacantRooms(){
        return DatabaseRoom.getVacantRooms();
    }

    @RequestMapping(value="/room/{id_hotel}/{nomor_kamar}", method=RequestMethod.GET)
    public Room getRoom(@PathVariable int id_hotel,@PathVariable String nomor_kamar){
        Room room = DatabaseRoom.getRoom(DatabaseHotel.getHotel(id_hotel),nomor_kamar);
        return room;
    }

    @RequestMapping(value="/databaserooms", method=RequestMethod.GET)
    public ArrayList<Room> databaseRooms() {
        ArrayList<Room> kamar = DatabaseRoom.getRoomDatabase();
        return kamar;
    }

}
