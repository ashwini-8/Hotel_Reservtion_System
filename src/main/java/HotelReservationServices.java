import java.util.LinkedList;

public class HotelReservationServices {
    static LinkedList<String> hotelInfo = new LinkedList<String>();
    public static boolean addHotel(String name){
        if( hotelInfo.add(name)) {
            return true;
        }
        return false;
    }
    public static void showHotel(){
        System.out.println(hotelInfo.get(0));

    }



}
