package CreationalDesignpattern.prototypedesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ProtypeDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		String sql="select * from movies where title=?";
		List<String> parameters=new ArrayList<String>();
		parameters.add("star wars");
		Record record=new Record();
		Statement first=new Statement(sql, parameters, record);
		System.out.println(first.getSql());
		System.out.println(first.getParameters());
		System.out.println(first.getRecord());
		
		//object cloned through protoyping and this is example of shallow copy
	Statement second=first.clone();
	System.out.println(second.getSql());
	System.out.println(second.getParameters());
	System.out.println(second.getRecord());
	}
}
