package src.home_work.LEC11_Inheritance;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Minivan");
        Vehicle truck = new Truck("Refrigirator", 15);
        Vehicle vehicle = new Vehicle();

        System.out.println(car.getType());
        System.out.println(truck.getType());

        System.out.println(vehicle.getType());
    }
}
