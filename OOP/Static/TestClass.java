package OOP.Static;

public class TestClass {

    public static String name;
    public int age;


    public TestClass(int age){
        // this.name=name;
        this.age=age;
    }

    public void print(){
        System.out.println(name);
    }

    public static void printSomthing(){
        System.out.println("Printing......");
        // print();  // we can not use simple method in static method
        System.out.println(name);
        
    }
    
    public static void setName(String name){
        
       // System.out.println(age);  can not use non static variable in static function;
        System.out.println(name);
        TestClass.name=name;

    }
    public void setAge(int age){
       
        this.age=age;
    }

    public static String getName(){
        return TestClass.name;
    }
    public int getAge(){
        return this.age;
    }
    
}
