package CreationalDesignpattern.SingletonPattern;

public class Daytodayexample {

	
public static void main(String[] args) {
	

		// TODO Auto-generated method stub

		Runtime singletonRuntime=Runtime.getRuntime();

		
		System.out.println(singletonRuntime);
	Runtime anotherinstance=Runtime.getRuntime();
	System.out.println(anotherinstance);
			if(singletonRuntime==anotherinstance)
			{
				
				System.out.println("both are same ");
			}
	}
	
	
}
