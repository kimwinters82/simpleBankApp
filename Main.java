

class Main {
  public static void main(String[] args) {
    
    Bank user1 = new Bank("Kim", "Deposit", 500);
    Bank user2 = new Bank("Paddy", "Current", 2000);
    Bank user3 = new Bank("Eileen", "Savings", 4000);
    
    user1.withdraw();
    user2.deposit();
    user3.checkBalance();
  }
}
