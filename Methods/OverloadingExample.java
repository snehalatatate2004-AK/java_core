public class OverloadingExample {
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    double add(double a, double b){
        return a+b;
    }
     public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();
        System.out.println(obj.add(10,20));
        System.out.println(obj.add(10,20,30));
        System.out.println(obj.add(5.5,4.5));
       
    }
}




                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   



















































 // void deposit(int amount) {
    //     System.out.println("Deposited cash: " + amount);
    // }

    // void deposit(int amount, String method) {
    //     System.out.println("Deposited " + amount + " via " + method);
    // }

    // void deposit(double amount) {
    //     System.out.println("Deposited amount with decimals: " + amount);
    // }

      // OverloadingExample acc = new OverloadingExample();

        // acc.deposit(5000);
        // acc.deposit(3000, "Cheque");
        // acc.deposit(2500.75);

// Method overloading means using the same method name for different tasks by changing its parameters.

//  Same name, but different input types or number of inputs
// Think of a calculator:

// add(2,3) → adds two numbers
// add(2,3,4) → adds three numbers
// add(2.5, 3.5) → adds decimals

// Same function name → different behavior based on input

// Advantages
// Improves code readability
// No need to remember different method names
// Makes code clean and organized
// Saves time in development
// ⚠️ Disadvantages
// Can confuse beginners
// Too many overloaded methods → hard to maintain
// Wrong parameter → wrong method may be called
// 📌 When to Use
// When the task is same but inputs differ
// Example: printing, calculations, validations