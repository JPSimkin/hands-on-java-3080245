package bank;

public class Account {
  private int id;
  private String type;
  private double balance;

  public Account(int id, String type, double balance) {
    setId(id);
    setType(type);
    setBalance(balance);

  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public double getBalance() {
    return this.balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void deposit(double amount) {
    this.balance = this.balance + amount;

  }

  public void withdraw(double amount) {
    if (amount < this.balance) {
      this.balance = this.balance - amount;
    } else if (amount == this.balance) {
      this.balance = 0;
    } else {
      System.out.println("You have less than " + amount + " in your account.");
      System.out.println("Your withdrawl cannot be made.");
    }
    

  }

}
