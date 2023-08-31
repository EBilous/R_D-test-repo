package src.home_work.LEC27.patterns;

class CarFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return new Car();
    }
}