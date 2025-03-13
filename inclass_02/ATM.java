import java.util.*;
public class ATM {
    public static void main(String[] args) {
        //create 10 accounts 
        Account[] accounts=new Account[10];

        for(int i=0; i<accounts.length; i++){
            accounts[i]=new Account(i,100.0); 
        }
        Scanner keyboard=new Scanner(System.in);
        //Start ATM 
        while (true) {//keep ATM running
            //serving a customer 
            System.out.print("Enter an id:");
            int id=keyboard.nextInt();
            while (id<0|| id>9) {
                System.out.print("Invalid input");
                System.out.print("Enter an id:");
                id=keyboard.nextInt();
            }
            //user is legit, print the menu 
            while (true) {//keep serving the same customer 
                int choice=menu();
                while (choice<0|| choice>4) {
                    System.out.print("invalid option");
                    choice=menu();
                    
                }
                if (choice==4){
                    System.out.println("Bye!");
                    break; 

                }
                if (choice==1) {
                    System.out.println("The balance is: "+accounts[id].getBalance());
                    
                }
                if (choice==2) {
                    System.out.println("Enter the amount to widthraw ");
                    double amount=keyboard.nextDouble();
                    accounts[id].withdraw(amount);

                    
                }
                if (choice==3) {//deposit
                    System.out.println("Enter the amount to deposit ");
                    double amount=keyboard.nextDouble();
                    accounts[id].deposit(amount);

                    
                }
            }
        }

    }
    public static int menu(){
        System.out.println("\nMain Menu ");
        System.out.println("\n 1: check balance");
        System.out.println("\n 2: withdraw");
        System.out.println("\n 3:deposit ");
        System.out.println("\n 4:exit  ");
        System.out.print("enter a choice");
        Scanner keyboard=new Scanner(System.in);
        int choice=keyboard.nextInt();
        return choice;

    }
}
