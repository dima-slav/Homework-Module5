package Module_5;

import java.util.Date;

/**
 * Created by Dima on 13.01.2017.
 */
public class BookingComAPI implements API {
    public Room[] rooms;

public BookingComAPI() {
    Date date = new Date();
    rooms = new Room[5];
    rooms[0] = new Room(1234567890, 150, 1, date, "Hilton", "Киев");
    rooms[1] = new Room(1345678902, 250, 2, date, "Senator", "Киев");
    rooms[2] = new Room(1456789023, 150, 2, date, "KharkivPalace", "Харьков");
    rooms[3] = new Room(1567890234, 150, 2, date, "Nemo", "Одесса");
    rooms[4] = new Room(1678902345, 150, 2, date, "Leopolis", "Львов");

}

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] booking = new Room[0];
        Date date=new Date();
        Room compareRoom= new Room(1234567890, price, persons, date, city, hotel);
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].equals(compareRoom)){
                Room[] Same1 = new Room[booking.length + 1];
                System.arraycopy(booking, 0, Same1, 0, booking.length);
                booking = Same1;
                booking[booking.length - 1] = rooms[i];
            }
        }
        return booking;
    }

    @Override
    public Room[] getAll() {
        return this.rooms;
    }
}



