package com.cg.eis.pl;
import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceInterface;

import Exception.NotFoundException;

public class Main 
{
	public static void main(String[] args) 
	{ 
		 EmployeeServiceInterface empService=new EmployeeServiceInterface();
		 
		 Employee emp1=new Employee(10,"Sanket",25000,null,null);
		 Employee emp2=new Employee(5,"Harsha",30000,null,null);
		 Employee emp3=new Employee(15,"Akash",20000,null,null);
		 Employee emp4=new Employee(12,"Pallavi",42000,null,null);
		 
		 try {
			 
			empService.addDetails(1, emp1);
			empService.addDetails(2, emp2);
			empService.addDetails(3, emp3);
			empService.addDetails(4, emp4);
		} 
		 catch (NotFoundException e) {
			 
			e.printStackTrace();
		}
		  
		empService.printDetails();
	}
}
