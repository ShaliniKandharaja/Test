package javapractice;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	String name;
	String dept;
	int salary;
	
	public Employee(String name, String dept, int salary){
		this.name=name;
		this.dept=dept;
		this.salary=salary;
		
	}
	
	public static void main(String[] args) {
		
		List<Employee> empList=new ArrayList<>();
		
		//Employee e1=new Employee("Ravi","IT",60000);
		//empList.add(e1);
		empList.add(new Employee("Ravi","IT",60000));
		empList.add(new Employee("Meena","HR",70000));
		empList.add(new Employee("Arjun","IT",80000));
		
		//Print IT department Employees
		for(Employee e: empList) {
			if(e.dept.equals("IT")) {
				System.out.println(e.name+" "+e.salary);
			}
		}
		
	}

}
