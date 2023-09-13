 class BankAccount {

    private int accountNumber;
    private String accountHolder;
    public double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
   this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {

        balance += amount;
        System.out.println("The amount deposited is : " + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance-=amount;
            System.out.println("The amount withdrawed is : " + amount);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }


     public int getAccountNumber() {
         return accountNumber;
     }

     public String getAccountHolder() {
         return accountHolder;
     }

    public double getBalance() {
        return balance;
    }
}

 class SavingsAccount extends BankAccount {
private double interestRate;
        public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
            super(accountNumber, accountHolder, balance);
            this.interestRate= interestRate;
        }

        public void addInterest(){
           double interest = getBalance() * interestRate / 100;
            System.out.println("The interest rate is :" + interest);
        }

    }

public class Bank {

    public static void main(String[] args) {

        BankAccount s1 = new BankAccount(777, "Sai", 1000.00);
        System.out.println("Details of accountHolder 1 : " + s1.getAccountHolder() + ", " + s1.getAccountNumber());
        System.out.println(s1.getBalance());
        s1.deposit(1000);
        System.out.println(s1.getBalance());
        s1.withdraw(500);
        System.out.println(s1.getBalance());

        SavingsAccount s2 = new SavingsAccount(111, "Swaroop", 2000.00, 10);
        System.out.println(s2.getBalance());
        s2.deposit(1000);
        System.out.println(s2.getBalance());
        s2.withdraw(500);
        System.out.println(s2.getBalance());
        s2.addInterest();
        System.out.println(s2.getBalance());

    }
}
