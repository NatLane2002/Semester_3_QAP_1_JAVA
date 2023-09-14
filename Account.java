public class Account {

  // Attributes

  private String id;
  private String name;
  private int balance = 0;

  // Constructor

  // Parameterized Constructor
  public Account(String id, String name) {
    this.id = id;
    this.name = name;
  }

  // Parameterized Constructor
  public Account(String id, String name, int balance) {
    this.id = id;
    this.name = name;
    this.balance = balance;
  }

  // Methods

  // Gets the id
  public String getId() {
    return this.id;
  }

  // Gets the name
  public String getName() {
    return this.name;
  }

  // Gets the balance
  public int getBalance() {
    return this.balance;
  }

  // Gets the credit
  public int credit(int amount) {
    int balance = amount += this.balance;
    return balance;
  }

  // Gets the debit
  public int debit(int amount) {
    int balance;
    if (amount <= this.balance) {
      balance = this.balance - amount;
    } else {
      System.out.println("Amount exceeded balance");
      balance = this.balance;
    }
    return balance;
  }

  // Transfers the amount to another account
  public int transferTo(Account another, int amount) {
    if (amount <= this.balance) {
      this.balance -= amount;
      another.balance += amount;
    } else {
      System.out.println("Amount exceeded balance");
    }
    return this.balance; // Return the updated balance of the current account
  }

  // toString method to print the account details
  public String toString() {
    return (
      "Account[id = " +
      this.id +
      ", name = " +
      this.name +
      ", balance = " +
      this.balance +
      "]"
    );
  }
}
