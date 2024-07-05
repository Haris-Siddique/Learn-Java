package OOP.Singleton;

public class Main {

    public static void main(String[] args) {

        Database DB = Database.getInstance("DB_Name");
        // Database DB2= new Database("haris");

        System.out.println(DB.getName());
        System.out.println(DB.toString());
        // System.out.println(DB2.getName());
        
        
    }

    

}
