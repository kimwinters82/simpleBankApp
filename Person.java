import java.util.*;

public class Person{
String firstName;
String surName;
//static boolean currentAcc;
//static boolean savingsAcc;
static Bank accNum;

Person(String firstName, String surName){
  this.firstName = firstName;
  this.surName = surName;
  
}

//create person account ???
public static void createAccount(){
  Scanner input5 = new Scanner(System.in);
  System.out.println("Would you like to set up a current account? Y or N? ");
  String current = input5.nextLine();
  if (current.equalsIgnoreCase("Y")){
    //currentAcc = true;

  //generate a random 5 digit number which will act as the account number 
  
   Random userName = new Random(); // same as scanner
   int number;      // introduce variable
   int user[] = new int[5]; //create array to store num

   for(int i=0; i<5; i++){ //generate 5 random numbers
    number = userName.nextInt(9); //nums between 0 & 9
    user[i] = number; //add number to array in order
  }

  System.out.println(user[0]); //return 5 digit array
  
  
  
  
  /**Scanner input6 = new Scanner(System.in);
  System.out.println("Would you like to set up a savings account? Y or N? ");
  String savings = input6.nextLine();
  if (current.equalsIgnoreCase("Y")){
  savingsAcc = true;
  }else{
    savingsAcc = false;
  }
**/
  
}
}

}