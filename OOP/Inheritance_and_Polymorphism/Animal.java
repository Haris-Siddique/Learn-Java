package OOP.Inheritance_and_Polymorphism;

public class Animal {

    
    private String name;
    private String color;
    private int legs;
    private boolean hasTale;


    public Animal(String name, String color, int legs, boolean hasTale){
        this.name=name;
        this.color=color;
        this.legs=legs;
        this.hasTale=hasTale;
    }

    
    public void eat(String food){

        System.out.println("Eating " + food);

    }

    public void setName(String name){
        this.name=name;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setLegs(int legs){
        this.legs=legs;
    }
    public void setHasTale(boolean hasTale){
        this.hasTale=hasTale;
    }


    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public int getLegs(){
        return legs;
    }
    public boolean getHasTale(){
        return hasTale;
    }

}
