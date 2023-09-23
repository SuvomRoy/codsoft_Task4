import java.util.Scanner;
class atm{
    static Scanner sc=new Scanner(System.in);
    static void display(){
        System.out.println("Select Menu");
        System.out.println("1.Check Balance");
        System.out.println("2.Deposite Amount");
        System.out.println("3.Widthdraw Amount");
        System.out.println("4.Exit");
    }
    static void start(){
        int acc,pin,amt,choice,deposite,widthdraw,checkac,checkpass;
        System.out.println("Enter Your Name:");
        String s=sc.nextLine();
        System.out.println("Set Account Number:");
        acc=sc.nextInt();
        System.out.println("set PIN For Your Account: ");
        pin=sc.nextInt();
        System.out.println("Please Deposite Minimum Rs.1000");
        amt=sc.nextInt();
    System.out.println("WelCome To Your Bank");
    System.out.println("Enter Your Account Number:");
  checkac=sc.nextInt();
  System.out.println("Enter Password:");
  checkpass=sc.nextInt();
  if(checkac==acc && checkpass==pin){
    System.out.println("****WELCOME "+s+" *****");
    int i=2;
    while(i>0){
        display();
        System.out.println("Enter Your Choice:");
     choice=sc.nextInt();
     switch(choice){
        case 1:
        System.out.println("Current Account Blance: "+amt);
        break;
        case 2:
        System.out.println("Enter Deposite Amount: ");
       deposite=sc.nextInt();
       amt=amt+deposite;
       System.out.println("Amount Deposited succesfully");
       break;
       case 3:
       System.out.println("Enter Amount to Widthdraw");
      widthdraw=sc.nextInt();
       if(widthdraw>amt){
      System.out.println("Transaction Failed.");
      }
       else{
      amt=amt-widthdraw;
      System.out.println("Transaction SuccessFully Completed");
     }
     break;
     }
     if(choice>3){
        System.out.println("Transaction Completed Visit Again");
     break;
     }
     i++;
    }
    }
else
System.out.println("Please Enter Valid Account Number and Password");
}
}	
class AtmInterface {
public static void main(String args[])
{
    atm.start();
}
}