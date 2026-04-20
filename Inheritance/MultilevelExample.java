//base class
class Account {
    int accNo;
    double balance;

    void setData(int a, double b) {
        accNo = a;
        balance = b;
    }

    void display() {
        System.out.println("Account No: " + accNo);
        System.out.println("Balance: " + balance);
    }
}

//Intermidiate class
class SavingsAccount extends Account {
    double interestRate = 5;

    void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest Added: " + interest);
    }
}

//child class
class PremiumSavings extends SavingsAccount {
    void bonus() {
        balance += 1000;
        System.out.println("Bonus Added: 1000");
    }
}

//Main class
public class MultilevelExample {
    public static void main(String[] args) {
        PremiumSavings p = new PremiumSavings();

        p.setData(101, 2000);
        p.addInterest();
        p.bonus();
        p.display();
        
    }
}
