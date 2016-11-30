package CreationalDesignpattern.FactoryDesignpattern;

public class Blog extends Website {

	@Override
	public void createWebsite() {
		// TODO Auto-generated method stub
		pages.add(new Postpage());
		pages.add(new AboutPage());
		pages.add(new CommentPage());

		pages.add(new contactPage());


		
		
	}

}
