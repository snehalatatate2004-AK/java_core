public class Main{
    public static void main(String[] args){
        Employee sneha = new Employee();
        Employee vaishu = new Employee();

        // System.out.println(sneha.id);
        //  System.out.println(sneha.name);
        //   System.out.println(sneha.salary); 

          sneha.id = 1;
          sneha.name= "Sneha";
          sneha.salary = 45000.89f;

        // System.out.println(sneha.id);
        //  System.out.println(sneha.name);
        //   System.out.println(sneha.salary); 

          vaishu.id = 2;
          vaishu.name="Vaishnavi";
          vaishu.salary= 50000.34f;

        // System.out.println(vaishu.id);
        //  System.out.println(vaishu.name);
        //   System.out.println(vaishu.salary); 

          sneha.printDetails();
          vaishu.printDetails();
          

        
    }
    
}
class Employee{
        int id;
        String name; 
        float salary;

        public void printDetails(){

        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);

        }

        
    }

    // An object can not access without class but class can access without any object
    // why...> Because class is compile time concept and stored in meta data