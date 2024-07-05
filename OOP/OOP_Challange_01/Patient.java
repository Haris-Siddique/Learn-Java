package OOP.OOP_Challange_01;

public class Patient {

    private String name;
    private Eye leftEye;
    private Eye rightEye;
    private Heart heart;
    private Stomach stomach;
    private Skin skin;
    
    
    public Patient(String name, Eye leftEye, Eye rightEye, Heart heart, Stomach stomach, Skin skin){
        this.name=name;
        this.leftEye=leftEye;
        this.rightEye=rightEye;
        this.heart=heart;
        this.stomach=stomach;
        this.skin=skin;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setLeftEye(Eye leftEye){
        this.leftEye=leftEye;
    }

    public void setRightEye(Eye rightEye){
        this.rightEye=rightEye;
    }

    public void setHeart(Heart heart){
        this.heart=heart;
    }

    public void setStomach(Stomach stomach){
        this.stomach=stomach;
    }

    public void setSkin(Skin skin){
        this.skin=skin;
    }

    public String getName(){
        return this.name;
    }

    public Eye getLeftEye(){
        return this.leftEye;
    }


    public Eye getRightEye(){
        return this.rightEye;
    }

    public Heart getHeart(){
        return this.heart;
    }

    public Stomach getStomach(){
        return this.stomach;
    }

    public Skin getSkin(){
        return this.skin;
    }



}
