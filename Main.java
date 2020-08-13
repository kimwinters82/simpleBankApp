import java.util.*;

class Main {
  public static void main(String[] args) {
  
  //either access their account or ask them to make a new one
  Scanner input1 = new Scanner(System.in);
  System.out.println("Hello! Do you already have an acocunt number? Y or N");
  String a = input1.next();
  
  if(a.equalsIgnoreCase("Y")){
    Scanner input2 = new Scanner(System.in); 
    System.out.println("Please enter your Account Number: ");
   int accNum = input2.nextInt(); 

  while(accNum != 1234){
    System.out.println("Please enter a valid account number: ");}
  System.out.println("Welcome. What would you like to do today? Deposit, Withdraw or Check Balance");
  }
  else{
  Scanner input3 = new Scanner(System.in);
  System.out.println("Please enter your first name: ");
  String firstName1 = input3.nextLine();
  
  Scanner input4 = new Scanner(System.in);
  System.out.println("Please enter your last name: ");
  String surName1 = input4.nextLine();

  Person newAcc = new Person(firstName1, surName1);
  newAcc.createAccount();

  }
  
}
   
  
  
  
  
}
