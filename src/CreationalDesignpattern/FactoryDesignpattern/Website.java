package CreationalDesignpattern.FactoryDesignpattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

	
	protected List<page>pages=new ArrayList<>();
	
	public List<page> getPages(){
		
		return pages;
	}
	public Website(){
		this.createWebsite();
	}
	public abstract void createWebsite();
}
