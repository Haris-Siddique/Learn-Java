package OOP.OOP_Challange_01;

import java.util.Scanner;

public class Main {

    public static void main(){

        Patient patient = new Patient("Ali",new Eye("Left Eye", "Normal", "Blue",true),
        new Eye("Right Eye", "Normal", "Blue",true),
        new Heart("Heart","Normal",65),
        new Stomach("Stomach","Normal",true),
        new Skin("Skin","Normal","LightBrown",50) );

        Scanner sin = new Scanner(System.in);

        int choice=0;

        boolean shouldFinish=false;

        while(!shouldFinish){
            System.out.println("Chose an Organ = " + 
            "\n\t1. Left Eye" + 
            "\n\t2. Right Eye" + 
            "\n\t3. Heart"+
            "\n\t4. Stomach"+
            "\n\t5. Skin" +
            "\n\t6. Quit");

            choice=sin.nextInt();

            switch (choice){
                case 1:
                    patient.getLeftEye().getDetails();

                    if(patient.getLeftEye().getIsOpen()){
                        System.out.println("\t\t1. Close the Eye");
                        if(sin.nextInt()==1){

                            patient.getLeftEye().close();
                         

                        }
                        else{
                            continue;
                        }
                    }
                    else{
                        System.out.println("\t\t1. Open the Eye");

                        if(sin.nextInt()==1){
                            patient.getLeftEye().open();
                           

                        }
                        else{
                            continue;
                        }

                    }

                    break;

                case 2:

                    patient.getRightEye().getDetails();

                    if(patient.getRightEye().getIsOpen()){

                        System.out.println("\t\t1. Close the Eye .....");

                        if(sin.nextInt()==1){
                        patient.getRightEye().close();
                       
                        }
                        else{
                            continue;
                        }

                    }
                    else{
                        System.out.println("\t\t1.Open the Eye .....");
                        if(sin.nextInt()==1){
                            patient.getRightEye().open();
        
                        }
                        else{
                            continue;
                        }
                    }

                    break;

                case 3:
                    
                    patient.getHeart().getDetails();
                    System.out.println("\t\t1. Change Heart Rate.....");
                    if(sin.nextInt()==1){
                        System.out.print("Enter the new Heart Rate = ");
                        patient.getHeart().setRate(sin.nextInt());
                        System.out.println("Heart Rate was Changed = " + patient.getHeart().getRate());
                    }
                    else{
                        continue;
                    }
                    break;

                case 4:
                    
                    patient.getStomach().getDetails();
                    System.out.println("\t\t1. Digest.....");
                    if(sin.nextInt()==1){
                        patient.getStomach().digest();

                    }
                    else{
                        continue;
                    }
                    break;

                case 5:
                    patient.getSkin().getDetails();
                    break;

                default:
                    shouldFinish=true;
                    break;






            }

            
        }






    }

}
