package src.home_work.LEC11_Inheritance;

/*  1. Створити клас автомобіль та 2 його потомки: легковий та вантажний

    2. У кожному класі повинен бути перевизначений метод, який повертає тип автомобіля*/

public class Vehicle {

    public String color;
    public String manufacturer;
    public String fuelType;
    public String yearOfMade;

    public String type;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getYearOfMade() {
        return yearOfMade;
    }

    public void setYearOfMade(String yearOfMade) {
        this.yearOfMade = yearOfMade;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.yearOfMade = type;
    }

}
