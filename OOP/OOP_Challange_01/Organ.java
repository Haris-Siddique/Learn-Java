package OOP.OOP_Challange_01;

public class Organ {

    private String name;
    private String medicalCondition;


    public Organ(String name, String medicalCondition){
        this.name=name;
        this.medicalCondition=medicalCondition;
    }


    public void getDetails(){
        System.out.println("Organ Name = " + this.name);
        System.out.println("Medical Condition = " + this.medicalCondition);
    }


    public void setName(String name){
        this.name=name;
    }

    public void setMedicalCondition(String medicalCondition){
        this.medicalCondition=medicalCondition;
    }

    public String getName(){
        return this.name;
    }

    public String getMedicalCondition(){
        return this.medicalCondition;
    }



}
