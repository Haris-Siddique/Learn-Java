package OOP.Inheritance_and_Polymorphism;
public class Main {

    public static void main(){


    //   Phone p1 = new Phone("Samsung" ,5 , 8 , 8);
    //   p1.setName("Samsung");
    //   System.out.println(p1.getName());
    //   System.out.println(p1.getScreenSize());
    //   System.out.println(p1.getMemoryRam());
    //   System.out.println(p1.getCamera());
    // //   System.out.println(p1.name);
    //   p1.playMusic("WOw Music 1\n");
    //   p1.playMusic("WOw Music 2\n");
        
        Bird b1 = new Bird("pip","green",2,true,2);

        System.out.println(b1.getColor());
        System.out.println(b1.getWings());
        
        b1.eat("meat");
        b1.fly();


    }
    
}
