class Student {
    // Private data (hidden)
    private String name;
    private int age;

    // Setter method (to set value)
    public void setName(String name) {
        this.name = name;
    }

    // Getter method (to get value)
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age > 0) {   // control/validation
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Sneha");
        s.setAge(20);

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}

// Why Encapsulation is Used
// Protects data from unauthorized access
// Allows validation before setting values
// Improves security
// Makes code flexible & maintainable


// 🔹 Advantages

// ✔ Data hiding
// ✔ Better control
// ✔ Easy to modify code later
// ✔ Improves security

// 🔹 Disadvantages

// ✖ More code (getters/setters)
// ✖ Slightly complex for beginners

// When to Use Encapsulation

// When you want to protect sensitive data
// When you need validation (like age > 0)
// In almost every real-world application

// 🔹 When NOT to Use
// Very small/simple programs
// When no need for data protection