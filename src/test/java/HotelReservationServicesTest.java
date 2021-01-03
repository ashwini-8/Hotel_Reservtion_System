import org.junit.Test;

import static org.junit.Assert.*;

public class HotelReservationServicesTest {
    @Test
    public void whenGivenHotel_WhenCalledAddHotel_ShouldBeAbleToAdd() {
        HotelReservationServices hotelReservationServices = new HotelReservationServices();
        HotelReservationSystem lakewood = new HotelReservationSystem("Lakewood",110);
        assertTrue(hotelReservationServices.addHotel("Lakewood"));
    }
}