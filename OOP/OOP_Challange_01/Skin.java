package OOP.OOP_Challange_01;

public class Skin extends Organ{

    private String color;
    private int softness;


    public Skin(String name, String medicalCondition, String color, int softness){
        super(name,medicalCondition);
        this.color=color;
        this.softness=softness;
    }

    @Override
    public void getDetails(){
        super.getDetails();
        System.out.println("Skin Color = " + this.getColor());
    }


    public void setColor(String color){
        this.color=color;
    }

    public void setSoftness(int softness){
        this.softness=softness;
    }

    public String getColor(){
        return this.color;
    }

    public int getSoftness(){
        return this.softness;
    }

}
