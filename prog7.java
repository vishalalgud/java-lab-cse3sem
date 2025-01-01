import java.util.Scanner;

class Account {
    static int curBalance = 1000; // Initial balance

    // Constructor no longer prompts for an amount
    public Account() {}

    void deposit(int amount) {
        curBalance += amount;
        System.out.println("Deposit successful.");
    }

    void withdraw(int amount) {
        try {
            if ((curBalance - amount) < 500)
                throw new LessBalanceException(amount);
curBalance -= amount;
System.out.println("Withdrawal successful.");
        } catch (LessBalanceException le) {
System.out.println(le);
        }
    }

    void checkBal() {
        System.out.println("\nBalance in your a/c: " + curBalance);
    }
}

class LessBalanceException extends Exception {
    int am;

    public LessBalanceException(int x) {
        am = x;
    }

    public String toString() {
        return ("You cannot withdraw the amount, less balance " + am + " now.");
    }
}

public class prog7 {
    public static void main(String[] args) {
        int ch;
        Scanner s = new Scanner(System.in);
        Account a = new Account(); // Constructor no longer needs to accept a Scanner

        while (true) {
            System.out.println("1: Deposit\t2: Withdraw\t3: Check Balance\t4: Exit");
            System.out.println("Enter your choice:");
            ch = s.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter deposit amount:");
                    int depositAmount = s.nextInt();
                    a.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter withdrawal amount:");
                    int withdrawAmount = s.nextInt();
                    a.withdraw(withdrawAmount);
                    break;
                case 3:
                    a.checkBal();
                    break;
                case 4:
                    s.close();  // Close the scanner to free resources
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
