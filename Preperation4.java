import java.util.Set;

class Employee{
    private String name;
    private int salary;
    private int age;
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

}
public class Preperation4{
  public static void main(String [] args) {
    Employee employee = new Employee();
    
    employee.setAge(20);
    employee.setName("Vinisha");
    employee.setSalary(50000);
    int age = employee.getAge();
    int salary = employee.getSalary();
    String name = employee.getName();
    System.out.println(age);
    System.out.println(salary);
    System.out.println(name);

  }

}
