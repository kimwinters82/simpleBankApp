import java.util.*;

public class Person{
String firstName;
String surName;
static boolean currentAcc;
static boolean savingsAcc;
static Bank accNum;

Person(String firstName, String surName, boolean currentAcc, boolean savingsAcc){
  this.firstName = firstName;
  this.surName = surName;
  this.currentAcc = currentAcc;
  this.savingsAcc = savingsAcc;
}

public static void createAccount(){
  Scanner input3 = new Scanner(System.in);
  System.out.println("Please enter your first name: ");
  String firstName = input3.nextLine();
  
  Scanner input4 = new Scanner(System.in);
  System.out.println("Please enter your last name: ");
  String surName = input4.nextLine();
  
  Scanner input5 = new Scanner(System.in);
  System.out.println("Would you like to set up a current account? Y or N? ");
  String current = input5.nextLine();
  if (current.equalsIgnoreCase("Y")){
    currentAcc = true;
  accNum.createAccNum();
  System.out.println(accNum);
  }
  
  Scanner input6 = new Scanner(System.in);
  System.out.println("Would you like to set up a savings account? Y or N? ");
  String savings = input6.nextLine();
  if (current.equalsIgnoreCase("Y")){
  savingsAcc = true;
  }else{
    savingsAcc = false;
  }

  
}





}