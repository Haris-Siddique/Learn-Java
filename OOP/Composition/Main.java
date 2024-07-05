package OOP.Composition;

public class Main {

    public static void main(){

        // Engine engine = new Engine("CAT", 8000);
        // Car c1= new Car("Toyota",2,"Black",engine);   first method by passing object name

        Car c1= new Car("Toyota",2,"Black",new Engine("Renault", 8000));   // second method by creating the new objet in a parameter

        System.out.println(c1.getName());
        System.out.println("Engine Model = " + c1.getEngine().getModel());


        // null in objects

        // Engine engine2 = null;  // it show the methods which define in the class but when we run it it gives us run time error

        // if(engine2!=null){

        //     System.out.println(engine2.getModel());

        // }
        // else{

        //     System.out.println("Engin is null");

        // }

        // final int a=0;
        // a=5;   // it is giving error because we set the variable final so we can not chant his value

        final Engine engine = new Engine("BMW",8000);

        // engine=new Engine("Toyota", 50000); // it gives error because we can not assign new object to the engine variable

        engine.setModel("Toyota");// but we can change the properties of it

        




    }
    
}
