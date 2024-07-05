package OOP.OOP_Challange_01;

public class Stomach extends Organ {

    private boolean isEmpty;

    public Stomach(String name, String medicalCondition, boolean isEmpty){
        super(name,medicalCondition);
        this.isEmpty=isEmpty;
    }


    @Override
    public void getDetails(){
        super.getDetails();

        if(this.getIsEmpty()){
            System.out.println("Need to be feed......");
        }
        else{
            System.out.println("Stomach is full......");
        }
    }

    public void digest(){
        System.out.println("Digesting food ......");
    }


    public void setIsEmpty(boolean isEmpty){
        this.isEmpty=isEmpty;
    }


    public boolean getIsEmpty(){
        return this.isEmpty;
    }

}
