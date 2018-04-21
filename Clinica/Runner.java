package Clinica;
import java.util.*;

public class Runner {



    public static void main(String[] args) {
	// write your code here
        Clinic clinic = new Clinic();
        String action = "";
        String clientName;
        String newname;
        String petType;
        String petName;
        Scanner reader = new Scanner(System.in);
        menu();
        try{
                while (!action.equals("6")){
                   action = reader.next();
                   switch (action){
                       case "1":
                           clinic.Show();
                           break;
                       case "2":
                           System.out.println("Input the name of the client:");
                           clientName = reader.next();
                           System.out.println("Input type of the pet:");
                           petType = reader.next();
                           System.out.println("Input the name of the pet:");
                           petName = reader.next();
                           clinic.addNewClient(clientName,petType,petName);
                           break;
                       case "3":
                           System.out.println("Input the name of a client to delete:");
                           clientName  = reader.next();
                           clinic.deleteClient(clientName);
                           break;
                       case "4":
                           System.out.println("Input old name of the client:");
                           clientName = reader.next();
                           System.out.println("Input new name of the client:");
                           newname = reader.next();
                           clinic.renameClient(clientName,newname);
                           break;
                       case "5":
                           System.out.println("Input name of the client:");
                           clientName = reader.next();
                           clinic.findClient(clientName);

                   }
                }
        }
        finally {
            reader.close();
        }


    }

    /**
     * Выводит на экран возможное меню.
     */
    public static void menu(){
        System.out.println("To show clients list please enter:1");
        System.out.println("To add a new client enter:2");
        System.out.println("To delete client from the list enter:3");
        System.out.println("To rename a client enter:4");
        System.out.println("To find client please enter:5");
        System.out.println("Enter:6 to exit");
    }
}
