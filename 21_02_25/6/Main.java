abstract class BankAccount {
    double balance;

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Savings Account Deposited: " + amount);
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount >= 100) {
            balance -= amount;
            System.out.println("Savings Account Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds! Maintain minimum balance.");
        }
    }
}

class CurrentAccount extends BankAccount {
    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Current Account Deposited: " + amount);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Current Account Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft limit reached.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.deposit(500);
        sa.withdraw(450);
        sa.withdraw(50);
    }
}
