package StructuralDesignpatterns.AdapterPatterns;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

	
	public List<Employee> getEmployeeList(){
		
		List<Employee> employees=new ArrayList<>();
		//call to the new class 
		EmployeeDB employeeFromDB=new EmployeeDB("1234","angu","goutham","angu@njit.edu");
		
		employees.add(employeeFromDB);
		//call to the legacy class
		
		EmployeeLdap employeeLdap=new EmployeeLdap("chewie", "solo", "han", "han@gmail.com");
				employees.add(new EmployeeLdapAdapter(employeeLdap));
				//call to csv class	
				EmpoyeeCSV employeeFromCSV=new EmpoyeeCSV("a,sramant,verma,S2njit.edu");
				employees.add(new EmployeeAdapterCSV(employeeFromCSV));
		return    employees;
	}
}
