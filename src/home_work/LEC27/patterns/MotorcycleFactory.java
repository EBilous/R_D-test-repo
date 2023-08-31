package src.home_work.LEC27.patterns;

public class MotorcycleFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return new Motorcycle();
    }
}
