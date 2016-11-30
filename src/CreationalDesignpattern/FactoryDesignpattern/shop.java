package CreationalDesignpattern.FactoryDesignpattern;

public class shop extends Website {

	@Override
	public void createWebsite() {
		// TODO Auto-generated method stub
		pages.add(new cartPage());
		pages.add(new ItemPage());
		
	}

}
