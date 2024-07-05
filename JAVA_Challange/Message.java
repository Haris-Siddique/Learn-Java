package JAVA_Challange;

public class Message {
    private static int lastId=0;
    private int id;
    private String text;
    private String recipient;

    public Message(String recipient, String text){
        this.id=++lastId;
        this.recipient=recipient;
        this.text=text;
    }

    public void getDetails(){
        System.out.println("Contact Name = "+ this.recipient + "\nMessage = "+ this.text + "\nID = "+ this.id);
    }

    // public void setId(int id) {
    //     this.id = id;
    // }

    public void setText(String text) {
        this.text = text;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    // public int getId() {
    //     return this.id;
    // }

    public String getText() {
        return this.text;
    }

    public String getRecipient() {
        return this.recipient;
    }



}
