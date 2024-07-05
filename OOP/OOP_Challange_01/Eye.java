package OOP.OOP_Challange_01;

public class Eye extends Organ{

    private String color;
    private boolean isOpen;


    public Eye(String name, String medicalCondition, String color, boolean isOpen){
        super(name,medicalCondition);
        this.color=color;
        this.isOpen = isOpen;
    }


    @Override

    public void getDetails(){
        super.getDetails();
        System.out.println("Color = " + this.getColor());

    }

    public void open(){
        this.setIsOpen(true);
        System.out.println(this.getName() + " is Opened");
    }


    public void close(){
        this.setIsOpen(false);
        System.out.println(this.getName() + " is Closed");
    }


    public void setColor(String color){
        this.color = color;
    }

    public void setIsOpen(boolean isOpen){
        this.isOpen = isOpen;
    }

    public String getColor(){
        return this.color;
    }

    public boolean getIsOpen(){
        return this.isOpen;
    }




}
