import java.util.ArrayList;
import java.util.Scanner;
class Employee 
 {
    private int id;
    private String name;
    private double salary;
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    public void displayDetails()
    {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("----------------------");
    }
   }

     public class EmployeeManagementSystem 
	{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= numEmployees; i++)
        {
            System.out.println("Enter details for Employee " + i + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); 
            
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();
            
            Employee emp = new Employee(id, name, salary);
            employees.add(emp);
            System.out.println();
        }

        System.out.println("\nEmployee Details:");
        System.out.println("=================");
        for (Employee emp : employees) {
            emp.displayDetails();
        }

        scanner.close();
    }
  }
