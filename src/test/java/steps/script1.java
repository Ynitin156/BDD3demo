package steps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class script1 
{
	WebDriver d2;
	
	@Given("open chrome browser and url of the applications")
	public void open_chrome_browser_and_url_of_the_applications() 
	{
		System.out.println("Given Start");
		
		
		System.setProperty("webdriver.chrome.driver","E:\\newautomation\\chromedriverr.exe");
		d2 = new ChromeDriver();
		d2.get("https://www.myhcl.com/bprhome/Home/Index");
		d2.manage().window().maximize();
	}

	@When("Enter valid login id and password nd click on login button & fill the itimesheet")
	public void enter_valid_login_id_and_password_nd_click_on_login_button_fill_the_itimesheet() throws InterruptedException, AWTException 
	{
		System.out.println("When Start");
		
		Thread.sleep(4000);
	     
		d2.findElement(By.id("i0116")).sendKeys("nitin.yadav@hcl.com");
		d2.findElement(By.id("idSIButton9")).click();
		
		Thread.sleep(4000);
		//d2.findElement(By.id("passwd")).clear();
		d2.findElement(By.name("passwd")).sendKeys("Quantum@26");
		d2.findElement(By.id("idSIButton9")).click();
		
		Thread.sleep(10000);
		d2.findElement(By.id("idSIButton9")).click();
		
		Thread.sleep(2000);
		d2.findElement(By.id("txtSearch")).sendKeys("itime");
		
		Robot r1 = new Robot();
		Thread.sleep(3000);
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_ENTER);
		
		
		//Thread.sleep(3000);
		//d2.findElement(By.xpath("/html/body/main/div/div[2]/section/div[4]/div[1]/div/div/div/div[2]/div/div[1]/span/div[2]/div/div/div[1]/div/div/div[6]/div/div/div/div/input")).sendKeys("9");
		
		//d2.findElement(By.id("le_apply")).click();
		
	}

	@Then("succesfully login & itimesheet fill succesfully")
	public void succesfully_login_itimesheet_fill_succesfully()
	{
		System.out.println("Then Start");
		
		System.out.println("successfully passed");
		
	}


}
