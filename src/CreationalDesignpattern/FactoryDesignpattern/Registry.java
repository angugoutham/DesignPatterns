package CreationalDesignpattern.FactoryDesignpattern;

import java.util.HashMap;
import java.util.Map;

import CreationalDesignpattern.prototypedesignPattern.Books;
import CreationalDesignpattern.prototypedesignPattern.Item;
import CreationalDesignpattern.prototypedesignPattern.Movie;

public class Registry {

	
	private Map<String, Item> items=new HashMap<String, Item>();
	  public Registry() {
		// TODO Auto-generated constructor stub
	
		  loadItems();
	  }
	  
	  
	  //core of prototyping 	
	public Item createItem(String type)
	{
		Item item=null;
		
		try{
			
			item=(Item)(items.get(type)).clone();
		}
		catch(CloneNotSupportedException c){
			c.printStackTrace();
		}
		return item;
	}
	public void loadItems(){
		
		Movie m=new Movie();
		m.setTitle("horror");
		m.setPrice(23.09);
		m.setRunTime("2.3 hours");
		items.put("movies", m);
		Books b=new Books();
		b.setTitle("grammar");
		b.setPrice(12.09);
		b.setNumberOfPages(121212);
		items.put("books", b);
	}
}
