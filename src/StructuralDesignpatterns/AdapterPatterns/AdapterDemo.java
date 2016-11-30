package StructuralDesignpatterns.AdapterPatterns;


import java.util.List;

public class AdapterDemo {

	public static void main(String[] args) {
		
		
		EmployeeClient client=new EmployeeClient();
		
		List<Employee> employess=client.getEmployeeList();
		
	System.out.println(employess);
	//System.out.println(Arrays.toString(employess.toArray()));
	}
	
}
