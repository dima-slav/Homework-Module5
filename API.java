package Module_5;

/**
 * Created by Dima on 13.01.2017.
 */
public interface API {
    Room[]findRooms (int price, int persons,String city, String hotel);
    Room[] getAll();
}
