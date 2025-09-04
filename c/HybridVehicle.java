package c;
public class HybridVehicle implements GasolineInterface, ElectricInterface {
    private double milesFromGas;
    private double gallonsFromGas;

    private double electricMiles;
    private double totalKWh;

    private double costPerGallon;
    private double costPerKWh;  

    public void setMilesfromGas(double miles) {
        this.milesFromGas = miles;
    }

    public void setGallonsfromGas(double gallons) {
        this.gallonsFromGas = gallons;
    }

    public double calcGasMPG() {
        if (gallonsFromGas == 0.0) return 0.0;
        return milesFromGas / gallonsFromGas;
    }

    public void setElectricMiles(double totalElectricMiles) {
        this.electricMiles = totalElectricMiles;
    }

    public void setTotalkWh( double totalKWh) {
        this.totalKWh = totalKWh;
    }

    public double calcMPGe() {
        if (totalKWh == 0.0) return 0.0;
        return (electricMiles / totalKWh) * 33.7;
    }

    public void setCostPerGallon(double cost) { 
        this.costPerGallon = cost; 
    }
    public double getCostPerGallon() { 
        return costPerGallon; 
    }

    public void setCostPerKWh(double cost) { 
        this.costPerKWh = cost; 
    }
    public double getCostPerKWh() { 
        return costPerKWh; 
    }

    public double calcHybridAverageMPG() {
        return (calcGasMPG() + calcMPGe()) / 2.0;
    }
}
