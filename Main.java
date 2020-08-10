class Bank{
  String user;
  String accType;
  double startBalance;
  double currentBalance;
}

Bank(String u, String a, double s){
  user = u;
  accType = a;
  startBalance = s;

}

Bank user1 = new Bank("Kim", "Deposit", 500);
Bank user2 = new Bank("Paddy", "Current", 2000);
Bank user3 = new Bank("Eileen", "Savings", 4000);

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}