import java.util.*;

// create public class 
public class Bank{
  String user;
  String accType;
  double balance;
  int accNum;
  
// create constructor for creating new users
Bank(String u, String a, double s, int ac){
  user = u;
  accType = a;
  balance = s;
  accNum = ac;
}
// methods
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

public String toString(){
  return (user + " " + accType + " " + balance + " " + accNum);
}


}
