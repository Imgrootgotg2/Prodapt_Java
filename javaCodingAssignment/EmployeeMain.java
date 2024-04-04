package javaCodingAssignment;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee emp1= new Employee(1,"Troye","New York");
		Employee emp2= new Employee(2,"Selena","Los Angeles");
		Employee emp3= new Employee(3,"Conan","Venice");
		Employee emp4= new Employee(4,"Shawn","Sydney");
		Employee emp5= new Employee(5,"Taylor","London");
		
		AddEmployee add = new AddEmployee();
		add.addEmployee(emp1);
		add.addEmployee(emp2);
		add.addEmployee(emp3);
		add.addEmployee(emp4);
		add.addEmployee(emp5);
		
		for (Employee e: add.list)
		{
			System.out.println(e);
		}
		System.out.println("\n***********************************************************\n");
		System.out.println(add.getEmployee(4));
	}
}
