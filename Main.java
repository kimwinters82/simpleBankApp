import java.util.*;

class Main {
  public static void main(String[] args) {
    //create arraylist to store all users information 
    ArrayList<Bank> users = new ArrayList();
    //create some users
    Bank user1 = new Bank("Kim", "Deposit Account", 500, 2345);
    Bank user2 = new Bank("Paddy", "Current Account", 2000, 1234);
    Bank user3 = new Bank("Eileen", "Savings Account", 4000, 1456);
    //add users to arraylist
    users.add(user1);
    users.add(user2);
    users.add(user3);

    //to check what in stored in users
  System.out.println(users.toString());

  //either access their account or ask them to make a new one
  Scanner input1 = new Scanner(System.in);
  System.out.println("Hello! Do you already have an account? Y or N");
  String accHolder = input1.next();
  
  if(accHolder.equalsIgnoreCase("Y")){
    Scanner input2 = new Scanner(System.in); 
    System.out.println("Please enter your Account Number: ");
   int num = input2.nextInt(); 

  if(num == user1.accNum){
    System.out.println("yay");
  }else{
    System.out.println("Please enter a valid account number: ");
  
  }
  }else{
    System.out.println("Please create an account");
  }
  
}
   
  
  
  
  
}
