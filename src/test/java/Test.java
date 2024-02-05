import com.pattern.learn.*;

import static org.junit.jupiter.api.Assertions.*;

public class Test {
    @org.junit.jupiter.api.Test
    public void create_sport_car() {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();

        director.makeSportsCar(carBuilder);
        Car car = carBuilder.getResult();

        assertNotNull(car);
        assertEquals(2, car.getSeat());
        assertEquals("sports", car.getEngine());
        assertEquals("true", car.getGPS());
    }

    @org.junit.jupiter.api.Test
    public void create_car_manual() {
        Director director = new Director();
        CarManualBuilder carManualBuilder = new CarManualBuilder();

        director.makeSUV(carManualBuilder);
        CarManual carManual = carManualBuilder.getResult();

        assertNotNull(carManual);
        assertEquals(2, carManual.getSeat());
        assertEquals("v8", carManual.getEngine());
        assertEquals("true", carManual.getGPS());
    }
}