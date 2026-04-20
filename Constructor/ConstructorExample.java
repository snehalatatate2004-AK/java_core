// public class SetterMethod {
    class Employee {
  private int id;
  private String name;

  public Employee() {
    id = 0;
    name = "Default Value";
  }

  public Employee(int id, String name) {
    this.id = id;
    this.name = name;
  }

  Employee(Employee emp) {
    this.id = emp.id;
    this.name = emp.name;
    System.out.println("Copy constructor called");
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

}
//Main class
public class ConstructorExample {
  public static void main(String[] args){
    Employee sneha = new Employee();

    sneha.setId(1);
    sneha.setName("Sneha Tate");

    System.out.println("Id : " + sneha.getId());
    System.out.println("Name : " + sneha.getName());

    // Parameterized Constructor
    Employee vaishnavi = new Employee(2, "Vaishnavi");

    System.out.println("Id : " + vaishnavi.getId());
    System.out.println("Name : " + vaishnavi.getName());

    // Copy Constructor
    Employee CopyEmp = new Employee(vaishnavi);
    System.out.println("Copied Id : " + CopyEmp.getId());
    System.out.println("Copied Name : " + CopyEmp.getName());

  }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
    

