import java.util.*;

public class Account{

    //data fields
    private int id;
    private double balance=0.0;
    private double annualInterstRate=0.0;
    private Date dateCreated; //this is not premitive data type and it is a pre-defined class

    //methods 
    public Account(){ // Default Constructor 
        id=0;
        balance=0.0;
        annualInterstRate=0.0;
        dateCreated= new Date();

    }
    public Account(int newId, double newBalance){//non-default constructor 
        id=newId;// connect data field to the parameter 
        balance=newBalance;

    }
    //mutator =changing or setter 
    public void set_Id(int id){
        this.id=id;
    }
    public void setBalance(double balance ){
        this.balance=balance;
    }

    public void setannualInterstRate(double annualInterstRate){
        this.annualInterstRate=annualInterstRate;
    }
    //accessor=getter= never void 
    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public double getannualInterstRate(){
        return annualInterstRate;
    }
    public Date getDateCreated(){
        return dateCreated;
    }

    //general or utility method '
    public double getMonthlyInterstRate(){
        return annualInterstRate/12;
    }

    public double getMonthlyInterst(){
        return balance*getMonthlyInterstRate();
    }

    public void withdraw(double amount){
        balance=balance-amount;
    }
    public void deposit(double amount){
        balance=balance+amount;
    }
    

}