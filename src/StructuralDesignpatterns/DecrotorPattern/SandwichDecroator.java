package StructuralDesignpatterns.DecrotorPattern;

public abstract class SandwichDecroator implements Sandwich{
//this implementation instance can be a concrete class or instance of other decrotaor class 
	
	protected Sandwich customSandwich;
	public SandwichDecroator(Sandwich customSandwich){
		this.customSandwich=customSandwich;
	}
	public String make(){
		return customSandwich.make();
		
		
	}
}
