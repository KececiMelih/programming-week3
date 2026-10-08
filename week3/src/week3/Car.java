package week3;

public class Car {

    private String plateNumber;
    private String model;
    private double mileage;
    private double fuelLevel;
    private double tankCapacity;

    public Car(String plateNumber, String model, double mileage, double fuelLevel, double tankCapacity) {
        this.plateNumber = plateNumber;
        this.model = model;
        this.mileage = mileage;
        this.fuelLevel = fuelLevel;
        this.tankCapacity = tankCapacity;
    }

    public double drive(double km) {
        double drivefuel = km / 10;
        if (fuelLevel >= drivefuel) {
            mileage += km;
            fuelLevel -= drivefuel;
            System.out.println("driving: " + km + "km");
            System.out.println("succesfully drove: " + km + "km");
        } else {
            mileage += fuelLevel * 10;
            System.out.println("");
            System.out.println("car went amount of fuel");
            System.out.println("your fuelLevel is not enough");
            fuelLevel = 0;
        }
        return km;
    }

    public double refuel(double amount) {
        if (amount + fuelLevel <= tankCapacity) {
            fuelLevel += amount;
            System.out.println("added: " + fuelLevel);
        } else {
            double artiklitre = (fuelLevel + amount) - tankCapacity;
            double eklenen = amount - artiklitre;
            fuelLevel = tankCapacity;
            System.out.println("");
            System.out.println("added: " + eklenen);
            System.out.println("these liters is not refueling: " + artiklitre + " litters");
            System.out.println("tank capacity is full");
        }
        return 0;
    }

    public void checkStatus() {
        System.out.println(plateNumber + " - " + model);
        System.out.println("this car went " + mileage + "km");
        System.out.println("this cars fuellevel: " + fuelLevel + "/" + tankCapacity + " Liters");

        if (fuelLevel <= (tankCapacity / 10)) {
            System.out.println("low fuel warning");
        }
    }
}