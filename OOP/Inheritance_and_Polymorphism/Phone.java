package OOP.Inheritance_and_Polymorphism;

public class Phone {

   private String name;
   private int screenSize;
   private int memoryRam;
   private int camera;


   public Phone(String name, int screenSize, int memoryRam, int camera){
       this.name=name;
       this.screenSize = screenSize;
       this.memoryRam = memoryRam;
       this.camera= camera;
   }


    public void playMusic(String trackName){
        System.out.print("Playing = " + trackName);
    }


    public void setName(String name){
        this.name=name;
    }

    public void setScreenSize(int screenSize){
        this.screenSize=screenSize;
    }


    public void setMemoryRam(int memoryRam){
        this.memoryRam = memoryRam;
    }

    public void setCamera( int camera){
        this.camera=camera;
    }

    public String getName(){
        return this.name;
    }

    public int getScreenSize(){
        return this.screenSize;
    }

    public int getMemoryRam(){
        return this.memoryRam;
    }

    public int getCamera(){
        return this.camera;
    }

}
