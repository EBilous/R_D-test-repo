package src.home_work.LEC11_Inheritance;

public class Car extends Vehicle{
    public Car(String carType) {
        this.carType = carType;
    }

    String carType;
    String capacity;

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }



    @Override public String getType() {
        return getCarType();
    }
}
