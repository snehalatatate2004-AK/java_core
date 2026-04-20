class BankAccount {
    private int balance; // hidden data

    // Setter
    public void deposit(int amount) {
        balance = balance + amount;
    }

    // Getter
    public int getBalance() {
        return balance;
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        b.deposit(1000);
        System.out.println(b.getBalance());
        
    }
}


// Abstraction means hiding the unnecessary complexity and showing only what is important to the user.
// Car Example

// When you drive a car:

// You use steering, brake, accelerator
// But you don’t know:
// How engine combustion works
// How fuel injects
// How gears rotate internally

// You only see the interface (controls), not the internal implementation.

// That’s abstraction.

// When to Use Abstraction

//  When:

// You want to hide complex logic
// You want to provide only essential features
// You are designing large systems (like apps, APIs)

//  Avoid when:

// Logic is simple and no need to hide anything
// Overusing it makes code harder to understand
// 🔹 Advantages

// ✔ Reduces complexity
// ✔ Improves security (hides internal details)
// ✔ Increases code reusability
// ✔ Makes code easier to maintain

// Disadvantages

//  Can make code more complex initially
//  Requires proper design planning
//  Debugging can be slightly harder