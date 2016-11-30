package CreationalDesignpattern.prototypedesignPattern;

import CreationalDesignpattern.FactoryDesignpattern.Registry;

public class ProtoTypeDemo {
//lighter wieght way to instantiate object instantiation
	
	public static void main(String[] args) {
		Registry r=new Registry();
		
		//object coloned with created one 
		Movie movie=(Movie) r.createItem("movies");
		movie.setTitle("first object");
		
		System.out.println(movie);
		System.out.println(movie.getTitle());
		System.out.println(movie.getUrl());
		
		System.out.println(movie.getPrice());
		
		
		Movie Second_movie=(Movie) r.createItem("movies");
		Second_movie.setTitle("second object");
		
		System.out.println(Second_movie);
		System.out.println(Second_movie.getTitle());
		System.out.println(Second_movie.getUrl());
		
		System.out.println(Second_movie.getPrice());
		
	}
}
