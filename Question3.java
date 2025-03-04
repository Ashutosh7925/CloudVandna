import java.util.ArrayList;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
	
	// Seting mannualy
	public void SetId(int id){
		this.id = id;
	}
	public void SetName(String name){
		this.name = name;
	}
	public void SetSalary(int salary){
		this.salary = salary;
	}
	
	//Get the data
	public int GetId(){
		return id;
	}
	public String GetName(){
		return name;
	}
	public double GetSalary(){
		return salary;
		
	}
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        
        employees.add(new Employee(1, "Modi", 50000));
        employees.add(new Employee(2, "Yogi", 60000.50));
        employees.add(new Employee(3, "Amit", 55000));
        
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
