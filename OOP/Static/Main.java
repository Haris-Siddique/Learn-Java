package OOP.Static;

public class Main {

    public static void main(){

        TestClass.setName("Haris"); // for all object instense the name is same
        TestClass T = new TestClass(22);
        TestClass T1 = new TestClass(23);

        System.out.println(T.getName());
        System.out.println(T1.getName());
        TestClass.printSomthing();


       


    }
    
}
