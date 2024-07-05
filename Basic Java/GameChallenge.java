import java.util.Random;
import java.util.Scanner;

public class GameChallenge {

    public static void main(){

        Scanner sin = new Scanner(System.in);
        Random rand = new Random();

        int start = 0, rnumber=0 ,unumber=0 , turns=5;
        String name = null;



        System.out.println("**********Welcome to the number finding Game*************");
        System.out.print("Plz Enter your name = ");
        name = sin.next();

        System.out.print("Do you want to start the game ? (Enter 1 for start -1 for exit) ");
        start = sin.nextInt();

        if(start>0){
            rnumber= rand.nextInt(20)+1;
            System.out.print("The Game is begin \nplz guess the numbe = ");
            unumber = sin.nextInt();
            
            while(turns>1){

                 --turns;

               
                if(rnumber==unumber){
                    System.out.println("WOW You Won The Game " + name + " ***********");
                    break;
                }
                else if (rnumber!=unumber){
                    System.out.println("Opps you guess the wrong number******");

                    if(unumber>rnumber){
                        System.out.print("PLz guess the Smaller number = ");
                        unumber = sin.nextInt();
                    }
                    else if (unumber<rnumber){
                        System.out.print("PLz guess the Larger number = ");
                        unumber = sin.nextInt();
                    }
                }
               

            }

            System.out.println("Game Over you have "+ turns + " turns left");
            System.out.println("The number was = " + rnumber);

        }
        else{
            System.out.println("***********BY BY************");
        }






    }
    
}
