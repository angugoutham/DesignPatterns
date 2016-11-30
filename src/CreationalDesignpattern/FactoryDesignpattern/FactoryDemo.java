package CreationalDesignpattern.FactoryDesignpattern;

public class FactoryDemo {
public static void main(String[] args) {
	Website site =WebsiteFactory.getWebsite(WebSiteType.BLOG);
	System.out.println(site.getPages());
	site=WebsiteFactory.getWebsite(WebSiteType.Shop);
	System.out.println(site.getPages());
}
}
