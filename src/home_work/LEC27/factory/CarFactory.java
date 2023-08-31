package src.home_work.LEC27.factory;

class CarFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return new Car();
    }
}