package CreationalDesignpattern.FactoryDesignpattern;

public class WebsiteFactory {
public static Website getWebsite(WebSiteType siteType){
	
	
	switch (siteType) {
	case BLOG:
			return new Blog();
	case Shop:
		return new shop();

	default:
		return null;
	}
}
}
