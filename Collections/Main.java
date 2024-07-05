package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Main {

    public static void main(){

        //simpe array size was fixed we cant chan its size so we use collections.

        //1. ArayList.

        ArrayList<String> name = new ArrayList<>();

        name.add("Faisal");
        name.add("Siddique");
        name.add("Hammad");

        // System.out.println(name.size());  //return size start from 1
        // System.out.println(name.get(2));  //return value
        // System.out.println(name.contains("Siddique"));  //return true or false
        // System.out.println(name.indexOf("Siddique"));  //if not present it returns -1
        // name.remove("Hammad");  // remove value and shift other value to his place 
        // System.out.println(name);

        // name.clear();  // clear all the Array list.
        // System.out.println(name);

        // for(int i=0;i<name.size();i++){
        //     System.out.println(name.get(i));
        // }


        // 2. Maps.

        Map<String, String> emailList = new HashMap<>();

        emailList.put("Haris","haris@gmail.com");
        emailList.put("Siddique","siddique@gmail.com");
        emailList.put("Hammad", "hammad@gmail.com");

        System.out.println(emailList.get("Hammad"));
        System.out.println(emailList.size());
        emailList.remove("Hammad");
        System.out.println(emailList.get("Hammad"));
        System.out.println(emailList);
        System.out.println(emailList.containsKey("Haris"));
        

        // Array list of objects 


        ArrayList<Students> student = new ArrayList<>();

        student.add(new Students("Haris", 23));
        student.add(new Students("Ali", 20));

        for (Students s : student) {

            System.out.println(s.getName());
            
        }
        






    }
    
}
