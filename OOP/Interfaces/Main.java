package OOP.Interfaces;

public class Main {

    public static void main() {
        CarInterface ecar = new ElectricCar("Tesla");
        CarInterface fcar = new FuleCar("Toyota");


        ecar.start();
        ecar.speed(100);

        fcar.start();
        fcar.speed(500);
        
    }

}
