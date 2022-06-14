package ksrtcpk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ksrtcclass {

	public static void main(String[] args) {
	

	//	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		
		//WebDriver driver=new FirefoxDriver();
		//driver.get("https://ksrtc.in/");
		//driver.get("https://www.amazon.com/");
		//String url="https://www.tutorialspoint.com/index.html";
		//driver.get(url);
	   // driver.getCurrentUrl();
	    //driver.getPageSource();
		
		  // Set the driver path
	     System.setProperty("webdriver.edge.driver","C:\\edgedriver\\msedgedriver.exe");

	     WebDriver driver  = new EdgeDriver();
		driver.get("https://www.amazon.com/");
		//driver.navigate().refresh();
		//driver.close();
		//driver.get("https://Ksrtc.in//");
		//driver.findElement(By.xpath("//a[contains(text(),'PNR Enquiry')]")).click();
		
		//driver.findElement(By.xpath("//a[contains(text(),'Amazon Basics')]")).click();
		
		//driver.findElement(By.cssSelector(".style__navList__Igck2 >.style__navItem__3rEc7:nth-child(3) > a")).click();//Office
		
		//driver.findElement(By.xpath("//a[contains(text(),'New Releases')]")).click();
		
		// driver.findElement(By.linkText("Apps & Games")).click();	
		// System.out.println("A and games");
		 
		 //driver.findElement(By.linkText("Business")).click();	
 		 
		// System.out.println("business");
 		 
		 
		
	//driver.findElement(By.xpath("//a[contains(text(),'Amazon Outlet')]")).click();
		
		//System.out.println("Amazon Outlet");
		//driver.findElement(By.xpath("//a[contains(text(),'Best Sellers')]")).click();

		//System.out.println("Best Sellers");
		//driver.findElement(By.xpath("//a[contains(text(),'Customer Service')]")).click();

		//driver.findElement(By.linkText("Today's Deals")).click();			
		// System.out.println("TD");
		// driver.findElement(By.linkText("Amazon Outlet")).click();	
		 
		 		// System.out.println("AO");
		 		 
		 		
			
				 
				 
		//driver.findElement(By.xpath("//a[contains(text(),'Today's Deals')]")).click();
		//System.out.println("td");
	//	driver.findElement(By.xpath("//a[contains(text(),'Returns')]")).click();
		//System.out.println("re");

	//	driver.findElement(By.xpath("//a[contains(text(),'Prime')]")).click();
		
	//	System.out.println("pr");
		//driver.findElement(By.xpath("//a[contains(text(),'Cart')]")).click();
	//	System.out.println("cart");
		
	//driver.findElement(By.cssSelector("#nav-xshop > .nav-a:nth-child(4)")).click();//amazon basics
	//System.out.println("amazon basics");
		
	driver.findElement(By.cssSelector(".nav-a:nth-child(5)")).click();//newreleases
	System.out.println("newreleases");
		
		//driver.findElement(By.cssSelector("#nav-xshop > .nav-a:nth-child(4)")).click();//basics
	//	System.out.println("amazon basics");
		
		//driver.findElement(By.cssSelector(".style__navList__Igck2>.style__navItem__3rEc7:nth-child(2) > a")).click();
		//newarrival
	//	System.out.println("newarrival");
		
	//	driver.findElement(By.cssSelector(".style__navItem__3rEc7:nth-child(1) > a")).click();//home
		//System.out.println("home");
		//driver.findElement(By.cssSelector(".nav-a:nth-child(4)")).click();//cart
		//System.out.println("cart");
		//driver.findElement(By.cssSelector(".nav-a:nth-child(3)")).click();//returns
		//System.out.println("returns");
		//driver.findElement(By.cssSelector(".nav-a:nth-child(2)")).click();
		//System.out.println("   ");
		 
		 driver.findElement(By.cssSelector(".nav-a:nth-child(8)")).click();//Today,s deals
			System.out.println("  TD ");
		
			 driver.findElement(By.cssSelector(".nav-a:nth-child(6)")).click();//new releases
			 System.out.println(" newreleases");
			
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit .SECONDS);
		
	//	String Windowhandle =driver.getWindowHandle();
		//System.out.println("windowhandle."+ Windowhandle);
		//driver.get("https://www.tutorialspoint.com/index.htm");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit .SECONDS);
		//driver.get("https://development.talentturbo.com/");
		//driver.get(url);
		//String URL=driver.getCurrentUrl();
		//System.out.println("Current Url is."+URL);
		
		
		//driver.getCurrentUrl();
		//String ps= driver.getPageSource();
		//System.out.println("Current Url is."+ps);
		String title=driver.getTitle();
		System.out.println("title="+title);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit .SECONDS);
		
		
		
		//WebElement BestSellers = driver.findElement(By.id("https://www.amazon.com/")).click();
		//WebElement signinLink = driver.findElement(By.linkText("signin")).click();
		//driver.findElement(By.id("Hello, Sign in")).click();
		//WebElement loginLink = driver.findElement(By.linkText("login")).click();
		
		//driver.getTitle();
		




		
	}

}
