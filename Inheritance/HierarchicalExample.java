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

//child class 1 
class SavingsAccount extends Account {
    void addInterest() {
        double interest = balance * 5 / 100;
        balance += interest;
        System.out.println("Savings Interest Added: " + interest);
    }
}

//child class 2 
class CurrentAccount extends Account {
    
    void overdraftLimit() {
        if(balance<4000){
           balance -= 500;
           System.out.println("Overdraft Used: 500");
        }else{
            System.out.println("Overdraft not allowed(Balance is sufficient");
        }
        
        
    }
}

//Main class
public class HierarchicalExample {
    public static void main(String[] args) {
    // two objects should be create for two classes
    
        SavingsAccount s = new SavingsAccount();
        s.setData(101, 2000);
        s.addInterest();
        s.display();
        

        CurrentAccount c = new CurrentAccount();
        c.setData(102, 3000);
        c.overdraftLimit();
        c.display();
    }
}

