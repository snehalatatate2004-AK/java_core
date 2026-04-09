public class if_example {

    public static void main(String[] args) {
    //     int age = 12;
    //     if(age >=18){
    //         System.out.println("You are eligible for voting");
    //     }else{
    //         System.out.println("Not eligible");
    //     }
    // }

    //ternary 
   // String result = (age>=18) ? "You are eligible for voting" : "You are not eligible for voting";



    // else if 

    // int mark = 85;
    // if(mark >=90){
    // System.out.println("A");
    // }
    // else if(mark >= 70){
    //     System.out.println("B");
    // }
    // else if(mark>=50)
    //     System.out.println("C");
    // }
    // else{
    // System.out.println("Fail");
    // }
    // String result = (mark>=90) ? "A" : (mark>=70) ? "B" : (mark>=50) ?"C": "Fail";

        
// nested if 
// int age = 22;
// boolean hasLicense =true;
// if(age >= 18){
//     if(hasLicense){
//         System.out.println("You can drive");
//     }else{
//         System.out.println("You need license");
//     }

// }else{
//     System.out.println("You are Underage");



// leap year using ternary operator 
int year = 2000;
String result = ((year % 4 == 0 && year % 100 != 0 ) || (year % 400 ==0))?"Leap year" : "Not leap year";
System.out.println(result);
    }
}