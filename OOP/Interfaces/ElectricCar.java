package OOP.Interfaces;

public class ElectricCar implements CarInterface {

    private String name;

    public ElectricCar(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println(this);
       System.out.println("Car is moving");
    }

    @Override
    public void speed(int speed) {
        System.out.println(this.getName() + " is moving with " + speed + " rpm");
        
    }

}
