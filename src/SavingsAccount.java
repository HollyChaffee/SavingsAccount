public class SavingsAccount {
    int balance;

  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }

  public void checkBalance() {
    System.out.println("Hello! Your balance is " + balance + ".");
  }

  public void deposit(int amountToDeposit) {
    int newBalance = balance + amountToDeposit;
    balance = newBalance;
    System.out.println("You just deposited " + amountToDeposit + ".");
  }

  public int withdraw(int amountToWithdraw) {
    int newBalance = balance - amountToWithdraw;
   balance = newBalance;
    System.out.println("You just withdrew " + amountToWithdraw + ".");
    return amountToWithdraw;
  }

  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);

    //Check balance:
    savings.checkBalance();

    //Withdrawing:
    savings.withdraw(250);

    //Check balance:
    savings.checkBalance();

    //Deposit:
    savings.deposit(600);

    //Check balance:
    savings.checkBalance();
    //Deposit:
    savings.deposit(700);

    //Check balance:
   savings.checkBalance();

  }

}
