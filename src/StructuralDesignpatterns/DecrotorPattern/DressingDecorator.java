package StructuralDesignpatterns.DecrotorPattern;

public class DressingDecorator  extends SandwichDecroator{

	public DressingDecorator(Sandwich customSandwich) {
		super(customSandwich);
		// TODO Auto-generated constructor stub
	}
	
	public String make()
	{
		
		return customSandwich.make()+addDressing();
	}
	private String addDressing(){
		
		return "+mustard";
				
	}

}
