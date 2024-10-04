package week1.day2;

public class LearnMethodObjects {

	public String launchBrowser (String browserName) {
		System.out.println("Browser Launched Successfully:"+browserName);
		return browserName;
	}
	public void loadUrl() {
		System.out.println("Application URL loaded successfully");
	}
	public static void main(String[] args) {
	LearnMethodObjects ns = new LearnMethodObjects();
	ns.launchBrowser("Chrome");
	ns.loadUrl();
	
}

	
		
	

	}


