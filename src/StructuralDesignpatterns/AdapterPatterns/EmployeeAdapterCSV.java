package StructuralDesignpatterns.AdapterPatterns;

public class EmployeeAdapterCSV implements Employee {

	//adapter class to communicate with EmpoyeeCSV class and implemets Employee interface
	private EmpoyeeCSV instance;
	public  EmployeeAdapterCSV(EmpoyeeCSV instance ) {
		this.instance=instance;
	
	}

	public String getId() {
		// TODO Auto-generated method stub
		return instance.getId();
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return instance.getFirstname();
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return instance.getLastname();
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return instance.getEmailaddress();
	}

}
