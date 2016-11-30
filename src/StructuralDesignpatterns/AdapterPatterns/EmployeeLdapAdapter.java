package StructuralDesignpatterns.AdapterPatterns;

public class EmployeeLdapAdapter implements Employee {
//adapter to invoke EmployeeLdap class instance 
	
	private EmployeeLdap instance;
	
	 public EmployeeLdapAdapter(EmployeeLdap instance) {
		this.instance=instance;
	}
	@Override
	public String getId() {
		
		return instance.getCn();
	}

	@Override
	public String getFirstName() {
	
		return instance.getGivenName();
	}

	@Override
	public String getLastName() {
		
		return instance.getSurName();
	}

	@Override
	public String getEmail() {
	
		return instance.getSurName();
	}
	public String toString() {
		
		return "ID:"+instance.getCn();
	}

}
