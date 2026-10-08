package week3;

public class Week3 {

    public static void main(String[] args) {

        Car car1 = new Car("38 abc 255", "toyota", 0, 20, 40);

        car1.checkStatus();
        System.out.println("");
        car1.drive(100);
        car1.checkStatus();
        car1.drive(150);
        System.out.println("");
        car1.checkStatus();
        System.out.println("");
        car1.refuel(20);
        System.out.println("");
        car1.checkStatus();
        car1.refuel(50);
        System.out.println("");
        car1.checkStatus();
        car1.drive(360);
        System.out.println("");
        car1.checkStatus();
    }
}