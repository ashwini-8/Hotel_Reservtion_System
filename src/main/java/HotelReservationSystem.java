public class HotelReservationSystem {
    String hotelName;
    Integer hotelRegularPrice;

    public HotelReservationSystem(String hotelName, Integer hotelRegularPrice) {
        this.hotelName = hotelName;
        this.hotelRegularPrice = hotelRegularPrice;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation System");
        HotelReservationSystem lakewood = new HotelReservationSystem("Lakewood",110);
        HotelReservationServices hotelReservationServices= new HotelReservationServices();
        hotelReservationServices.addHotel(lakewood.hotelName);
        hotelReservationServices.showHotel();
    }
}
