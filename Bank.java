import java.util.*;

// create public class 
public class Bank{
  String accType; //current or savings for now
  double balance;
  double minValue; //balance cannot go under this amount
  
// create constructor for creating new users
Bank(String accType, double balance, double minValue){
  this.accType = accType;
  this.balance = balance;
  this.minValue = minValue;
}

//create arraylist to store all users information 
/**ArrayList<Bank> users = new ArrayList();    //create some users
 Bank user1 = new Bank("Deposit Account", 500, 1234);
   
    //add users to arraylist
 users.add(user1);
**/

// methods
void withdraw(){
 Scanner input = new Scanner(System.in);
 System.out.println("How much would you like to withdraw?");
 double amount = input.nextDouble();
 balance = (balance - amount);
 System.out.println("Thank you. Your new balance is " + balance);
}

void deposit(){
 Scanner input = new Scanner(System.in);
 System.out.println("How much would you like to deposit?");
 double amount = input.nextDouble();
 balance = (balance + amount);
 System.out.println("Thank you. Your new balance is " + balance);
}

void checkBalance(){
  System.out.println("Your balance is " + balance);
}

public String toString(){
  return ("this is hard");
}

//generate a random 5 digit number which will act as the account number 
public int createAccNum(){ //need to return an int
  Random userName = new Random(); // same as scanner
  int number;      // introduce variable
  int user[] = new int[5]; //create array to store num

  for(int i=0; i<5; i++){ //generate 5 random numbers
    number = userName.nextInt(9); //nums between 0 & 9
    user[i] = number; //add number to array in order
    return user[1]; //return 5 digit array

  }
}
}
