package u;

import c.HybridVehicle;
import org.junit.Test;
import static org.junit.Assert.*;

public class HybridVehicleTest {
    @Test
    public void testGasMPG() {
        HybridVehicle car = new HybridVehicle();
        car.setMilesfromGas(120);
        car.setGallonsfromGas(6);
        assertEquals(20.0, car.calcGasMPG(), 0.001);
    }

    @Test
    public void testMPGe() {
        HybridVehicle car = new HybridVehicle();
        car.setElectricMiles(300);
        car.setTotalkWh(70);
        assertEquals(144.43, car.calcMPGe(), 0.01);
    }

    @Test
    public void testHybridAverage() {
        HybridVehicle car = new HybridVehicle();
        car.setMilesfromGas(120);
        car.setGallonsfromGas(6);
        car.setElectricMiles(300);
        car.setTotalkWh(70);
        assertEquals(82.2143, car.calcHybridAverageMPG(), 0.001);
    }
}