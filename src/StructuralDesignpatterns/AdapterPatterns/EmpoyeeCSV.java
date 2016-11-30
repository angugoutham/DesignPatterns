package StructuralDesignpatterns.AdapterPatterns;

import java.util.StringTokenizer;

public class EmpoyeeCSV {

	private String id;
	private String firstname;
	private String lastname;
	private String emailaddress;

public EmpoyeeCSV(String values ) {
	//leagcy code to handle csv 
	
	StringTokenizer tokenizer =new StringTokenizer(values,",");
	if(tokenizer.hasMoreTokens()){
		id=tokenizer.nextToken();
	}
	if(tokenizer.hasMoreTokens()){
		firstname=tokenizer.nextToken();
	}
	if(tokenizer.hasMoreTokens()){
		lastname=tokenizer.nextToken();
	}
	if(tokenizer.hasMoreTokens()){
		emailaddress=tokenizer.nextToken();
	}
}

public String getId() {
	return id;
}

public String getFirstname() {
	return firstname;
}

public String getLastname() {
	return lastname;
}

public String getEmailaddress() {
	return emailaddress;
}



}
