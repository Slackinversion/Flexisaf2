// Outer class representing a Bank Account
class BankAccount {
    private double balance; // Private variable

    // Constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Inner Class that Handles transactions (Deposit, Withdraw)
    class Transaction {
        void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: NGN" + amount);
            BankLogger.log("Deposited NGN" + amount + ". New Balance:NGN" + balance);
        }

        void withdraw(double amount) {
            if (amount > balance) {
                System.out.println("Insufficient funds!");
                BankLogger.log("Failed Withdrawal of NGN" + amount);
            } else {
                balance -= amount;
                System.out.println("Withdrawn: NGN" + amount);
                BankLogger.log("Withdrawn NGN" + amount + ". New Balance: NGN" + balance);
            }
        }
    }

    // Static Nested Class Logs transactions
    static class BankLogger {
        static void log(String message) {
            System.out.println("[LOG]: " + message);
        }
    }

    //  Anonymous Class for a delayed deposit
    void delayedDeposit(double amount, int seconds) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(seconds * 1000);
                    new Transaction().deposit(amount);
                    System.out.println("Delayed deposit of ₦" + amount + " completed.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        new Thread(task).start();
    }
}

// test the  system
public class BankDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100); // initialise account with ₦100

        //inner class object for transactions
        BankAccount.Transaction transaction = account.new Transaction();

        transaction.deposit(50);  // Deposit ₦50
        transaction.withdraw(30); // Withdraw ₦30
        transaction.withdraw(150); // Attempt to withdraw ₦150 (should fail if im correct)

        // Schedule a delayed deposit
        account.delayedDeposit(200, 3); // Deposit ₦200 after 3 seconds
    }
}