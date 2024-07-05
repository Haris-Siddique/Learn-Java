import java.util.Random;
import java.util.Scanner;

public class Loops {

    public static void main(){

        int a=5;


        // for ( int i=0; i<a; i++){
        //     System.out.println("Hello Haris " + (i+1) + " Time");
        // }

        // while(a<10){

        //     a++;

        //     if(a==8){
        //         continue;
        //     }
        //     System.out.println("Hello");
           
            
        // }


        // do{
        //     System.out.println("Hello");
        // }while(a<5);



       // input from user
        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Plz enter the number = ");
        // int ans = scanner.nextInt();
        // System.out.println("Answer is = " + ans);

        // System.out.print("Plz enter your Name = ");
        // String name= scanner.next();

        // System.out.println("My name is "+ name);


    // generate random number

    Random rand = new Random();
    int number=rand.nextInt(20);
    System.out.println("number is =  " + number);


    }
    
}
