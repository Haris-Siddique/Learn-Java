import java.util.Scanner;

public class array {

    public static void main(){

        // String[] students = new String[5];

        // students[0]="Haris";
        // students[1]="Mujtaba";
        // students[2]="Hammad";
        // students[3]="Noman";
        // students[4]="Ali";

        // for(int i=0;i<students.length;i++){
        //     System.out.println(students[i]);
        // }

        // String[] employes = {"ali", "Haris", "Noman" };
        // int[] num={1,2,3,4,5,6};

        // for(int i=0;i<num.length;i++){
        //     System.out.println(num[i]);
        // }

        // creating a simple call log

        String[] names={"haris","ali","hammad"};
        int[] number={12345,67890,13579};

        for(int i=0;i<names.length;i++){
            System.out.print(names+ " " );
        }

        System.out.print("Please enter the namem = ");
        Scanner sin = new Scanner(System.in);
        String name = sin.next();

        for(int i = 0; i< names.length;i++ ){
            if(name.equals(names[i])){
                System.out.println( name + " = " + number[i]);
            }
        }






 
    }
    
}
