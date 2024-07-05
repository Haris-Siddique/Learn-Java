package Threads;

public class Main {

    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
               for (int i=0;i<5;i++){
                System.out.println("Printing "+ i + " in a worker Thread");
                try{
                Thread.sleep(1000);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
               }
            }
            
        });

        thread.start();



        for (int i=0;i<5;i++){
            System.out.println("Printing "+ i + " in a main Thread");
            try{
            Thread.sleep(1000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
           }
        
    }
    
}
