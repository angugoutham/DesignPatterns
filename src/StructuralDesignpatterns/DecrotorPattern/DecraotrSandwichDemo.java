package StructuralDesignpatterns.DecrotorPattern;

public class DecraotrSandwichDemo {
public static void main(String[] args) {
	Sandwich sandwich=new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
	
	System.out.println(sandwich.make());
			
}
}
