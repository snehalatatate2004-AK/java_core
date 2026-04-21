class Account {
    void withdraw(int amount) {
        System.out.println("Withdraw from Account");
    }
}

class SavingsAccount extends Account {
    void withdraw(int amount) {
        System.out.println("Withdraw from Savings Account: " + amount);
    }
}

class CurrentAccount extends Account {
    void withdraw(int amount) {
        System.out.println("Withdraw from Current Account with overdraft: " + amount);
    }
}

class FixedDeposit extends Account {
    void withdraw(int amount) {
        System.out.println("Withdrawal not allowed in Fixed Deposit");
    }
}

public class Main {
    public static void main(String[] args) {

        Account acc;

        acc = new SavingsAccount();
        acc.withdraw(2000);

        acc = new CurrentAccount();
        acc.withdraw(5000);

        acc = new FixedDeposit();
        acc.withdraw(1000);
    }
}















// Method overriding means redefining a parent class method in a child class to give it a new behavior.

//  Same method name + same parameters → different implementation

//  Real-Life Example

// Think of animals making sounds:

// Parent class → Animal → sound()
// Dog → barks
// Cat → meows

// Same method → different behavior

// Advantages
// Supports runtime polymorphism
// Allows dynamic behavior
// Helps in code reusability
// Makes system flexible and scalable
// ⚠️ Disadvantages
// Slightly complex to understand
// Debugging is harder
// Requires inheritance (not always needed)
// 📌 When to Use
// When child class needs different behavior
// When working with inheritance
// Example: payment systems, notifications, UI rendering

// When NOT to Use
// When behavior is same → no need to override
// When no inheritance is involved