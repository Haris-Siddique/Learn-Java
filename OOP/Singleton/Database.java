package OOP.Singleton;

public class Database {

    private String name;



    private static Database instance;

    public static synchronized Database getInstance(String name){ //we use synchronized becasue no thrads can creat an instance of class at a same time

        if(instance==null){

            instance = new Database(name);
            return instance;
        }
        else{
            return instance;
        }
       
    }

  


    private Database(String name){

        this.name=name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        String txt="DataBase class\n" + "Name = " + this.getName();
        return txt;
    }



}
