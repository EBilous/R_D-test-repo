package src.home_work.LEC11_Inheritance;

public class Truck extends Vehicle {
    private String truckType;
    int maxLoad;

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    @Override public String getType() {
        return truckType;
    }
}
