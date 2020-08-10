import java.util.Scanner;


public class Bank{
  String user;
  String accType;
  double balance;
  


Bank(String u, String a, double s){
  user = u;
  accType = a;
  balance = s;

}



void withdraw(){
 Scanner input = new Scanner(System.in);
 System.out.println(user + ", how much would you like to withdraw?");
 double amount = input.nextDouble();
 balance = (balance - amount);
 System.out.println("Thank you. Your new balance is " + balance);
}

void deposit(){
 Scanner input = new Scanner(System.in);
 System.out.println(user + ", how much would you like to deposit?");
 double amount = input.nextDouble();
 balance = (balance + amount);
 System.out.println("Thank you. Your new balance is " + balance);
}

void checkBalance(){
  System.out.println(user + ", your balance is " + balance);
}
}