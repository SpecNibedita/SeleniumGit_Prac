import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {

	
	public static void main(String[] args) {
		// Inside this box the written code will get executed
		//Below are the steps we need to follow
		//Invoke the browser
		//ChromeBrowser- ChromeDriver->Call the methods close get (to automate in ChromeBrowser)
		//FirefoxBrowser- FirefoxDriver - method close get
		//SafariBrowser-SafariDriver-Method close get
		//on top over these classes there is an interface called web driver
		//web driver close get
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nibed\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.kohls.com/");
		 System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//close causes closing of current tab/windows that has been given 
		driver.quit();
		//closes the given tab and the tab or window associated with it
		
		
		//for Firefox launch
				//geco driver is used for Firefox browser
				
        /* System.setProperty("webdriver.gecko.driver","C:\\Users\\nibed\\Downloads\\geckodriver-v0.32.2-win64\\geckodriver.exe");
				
		 WebDriver driver = new FirefoxDriver(); 
		 
		 driver.get("https://www.kohls.com/");
		 System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		 */
		 
		//For Microsoft Edge
		
		/*System.setProperty("webdriver.edge.driver","C:\\Users\\nibed\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		
		 WebDriver driver = new EdgeDriver(); 
		 
		 driver.get("https://www.kohls.com/");
		 System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();*/
		
		
		

	}

}
