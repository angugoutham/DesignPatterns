package StructuralDesignpatterns.DecrotorPattern;

public class MeatDecorator extends SandwichDecroator {

	public MeatDecorator(Sandwich customSandwich) {
		super(customSandwich);
		// TODO Auto-generated constructor stub
	}
	
	public String make()
	{
		
		return customSandwich.make()+addMeat();
	}
	private String addMeat(){
		
		return "+turkey";
				
	}

}
