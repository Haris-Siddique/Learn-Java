package OOP.Composition;

public class Engine {

    private String model;
    private int rpm;

    public Engine(String model, int rpm){
        this.model=model;
        this.rpm=rpm;
    }

    public void setModel(String model){
        this.model=model;
    }
    public void setRpm(int rpm){
        this.rpm=rpm;
    }

    
    public String getModel(){
        return model;
    }
    public int getRpm(){
        return rpm;
    }



}
