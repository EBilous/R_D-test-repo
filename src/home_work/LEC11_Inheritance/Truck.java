package src.home_work.LEC11_Inheritance;

public class Truck extends Vehicle {
    public Truck(String truckType, int maxLoad) {
        this.truckType = truckType;
        this.maxLoad = maxLoad;
    }

    private String truckType;

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    int maxLoad;

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    @Override public String getType() {
        return truckType;
    }
}
