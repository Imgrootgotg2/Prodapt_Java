package javaCodingAssignment;

import java.util.ArrayList;
import java.util.List;

public class AddEmployee {

			List<Employee> list = new ArrayList();// this is to store the empoyees

			void addEmployee(Employee emp) {
				list.add(emp);
				// this method will add a new employee
			}

			Employee getEmployee(int id) {     // will return the employee based on the id if 
				for(Employee e: list) {		   // the employee is available else returns null.
					if(e.getId()==id) {
						return e;
					}
				}
				return null;
			}
					

}
