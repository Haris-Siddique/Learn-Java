package OOP.Inheritance_and_Polymorphism;

public class Bird extends Animal {

    private int wings;

 public Bird(String name, String color, int legs, boolean hasTale, int wings){

    super(name, color, legs, hasTale);

    this.wings=wings;

 }



 public void fly(){
    System.out.println(this.getName() + " is Flying");
 }

 @Override
 public void eat(String food){
    // super.eat(food);
    System.out.println("Finish Eating");
 }

 public void setWings(int wings){
    this.wings=wings;
 }

 public int getWings(){
    return this.wings;
 }




}
