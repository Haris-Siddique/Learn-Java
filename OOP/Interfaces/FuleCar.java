package OOP.Interfaces;

public class FuleCar implements CarInterface{

    private String name;

    public FuleCar(String name) {
        this.name=name;
    }

    @Override
    public void start() {
       System.out.println("Fule car is Starting");
       
    }
    @Override
    public void speed(int speed) {
      
        System.out.println(this.getName() + " is moving with " + speed + " rpm");
        
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
