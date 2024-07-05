package JAVA_Challange;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Contact> contacts;
    private static Scanner sin;

    private static void showOptions(){
        
        sin = new Scanner(System.in);
        
        System.out.println("Please select the Options \n\t1. Manage Conatct.\n\t2. Messages.\n\t3. Quit.");
        int choise = sin.nextInt();

        switch(choise){
            case 1:
                manageConatcts();
                break;
            case 2:
                manageMessages();
                break;
            default:
                break;

        }

    }

    private static void manageConatcts(){

        System.out.println("Please select the Options.\n\t1. Show all contacts.\n\t2. Add a new contact.\n\t3. Serch for a contact\n\t4. Delete a contact.\n\t5. Go back to the previous menu.");
        int choise=sin.nextInt();

        switch(choise){
            case 1:
                showAllContacts();
                break;
            case 2:
                addNewContact();
                break;
            case 3:
                searchContact();
                break;
            case 4:
                deleteContact();
                break;
            default:
                showOptions();
                break;
        }     
    }

    private static void showAllContacts(){
        for (Contact c : contacts) {

            if(c.equals(null)){
                System.out.println("There is nothing in the contact list...");
                break;
            }
            c.getDetails();

            System.out.println("**********************");
        }
        showOptions();
    }

    private static void addNewContact(){
        System.out.println("Adding a new Contact...\nPlease enter the contact name = ");
        String name=sin.next();
        System.out.println("Please enter the contact number = ");
        String number=sin.next();
        System.out.println("Please enter the contact email = ");
        String email=sin.next();

        if(name.equals(null) || number.equals(null) || email.equals(null)){
            System.out.println("Please enter all information...");
            addNewContact();
        }
        else{

            boolean exist=false;

            for(Contact c: contacts){
                if(c.getName().equals(name)){
                    exist=true;
                }
            }

            if(exist){
                System.out.println("Contact with " + name + " is already exist .....");
            }
            else{
                Contact contact = new Contact(name,number,email);
                contacts.add(contact);
            }
            showOptions();
        }
    }
    
    private static void searchContact(){
        System.out.println("Please enter the name to find the contact = ");
        String name=sin.next();

        boolean exist=false;
        if(name.equals(null)){

            System.out.println("Please enter the name = ");
            searchContact();
        }
        else{
            for(Contact c: contacts){
                if( c.getName().equals(name)){
                exist=true;
                c.getDetails();
                }
            }
        }

        if(!exist){
            System.out.println("There is no such contact here....");
        }
    }

    private static void deleteContact(){
        System.out.println("Please enter the name of the contact which you want to delete = ");
        String name=sin.next();

        boolean exist=false;

        if(name.equals(null)){

            System.out.println("Please enter the name = ");
            deleteContact();
        }
        else{
            for(Contact c: contacts){
                if(c.getName().equals(name)){
                    exist=true;
                    contacts.remove(c);
                }
            }
        }

        if(!exist){
            System.out.println("There is no such contact.....");
        }

        showOptions();

    }
   
    private static void manageMessages(){  
        
        System.out.println("Please select one = \n\t1. Show messages.\n\t2. Send a new message.\n\t3. Go back");

        int choise=sin.nextInt();

        switch(choise){
            case 1:
                showMessage();
                break;
            case 2:
                sendNewMessage();
                break;
            default:
                showOptions();
                break;
        }



    } 


    private static void showMessage() {

       ArrayList<Message> messages=new ArrayList<>();
        for(Contact c: contacts){
            messages.addAll(c.getMessage());
        }

        if (messages.size()>0){
           for(Message m: messages){
            m.getDetails();
            System.out.println("***************");
           }
        }else{
            System.out.println("You don't have any messages");
        }

        showOptions();
    }
   
    private static void sendNewMessage() {

        System.out.println("Who are you going to send a message?");
        String name=sin.next();
       // boolean exist=false;
        if(name.equals(null)){
            System.out.println("Please enter the name");
            sendNewMessage();
        }
        else{
            boolean exist=false;
            for(Contact c: contacts){
                if(c.getName().equals(name)){

                    exist=true;

                    System.out.println("Enter a message");
                    String text=sin.next();
                    while(text.equals(null)){
                        System.out.println("Please enter the message");
                        text=sin.next();
                    }
                    Message newMessage = new Message(text, name);
                    c.getMessage().add(newMessage);
                    System.out.println("Message sent successfully.....");
                    break;
                }
               
            }
            if(!exist){
                System.out.println("This user is not present in contact list ");
                sendNewMessage();
            }
        }

        showOptions();
    }

   

    public static void main(){


        contacts = new ArrayList<>();
        System.out.println("**********Hello user welcome to our JAVA app**********");

        showOptions();



        
    }

    

}
