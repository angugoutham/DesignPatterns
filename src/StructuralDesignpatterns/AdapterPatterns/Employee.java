package StructuralDesignpatterns.AdapterPatterns;

public interface Employee {

	//interface which is implemented by all adapter for communicating with legacy classes and new classes also implements these interface and implement this methods 
	public String  getId();
	public String  getFirstName();
	public String  getLastName();
	public String  getEmail();
}
