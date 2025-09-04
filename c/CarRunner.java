package c;

public class CarRunner {
    public static void main(String[] args){
        HybridVehicle car = new HybridVehicle();

        car.setMilesfromGas(120);
        car.setGallonsfromGas(6);

        car.setElectricMiles(300);
        car.setTotalkWh(70);

        System.out.println("MPG (gas) = " + car.calcGasMPG());
        System.out.println("MPGe (Electric) = " + car.calcMPGe());
        System.out.println("Hybrid avg MPG = " + car.calcHybridAverageMPG());    
    }
}
