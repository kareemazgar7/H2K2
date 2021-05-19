package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LaunchGoogle {

	WebDriver driver;
	
	@Given("^User is on the Homepage$")
	public void user_is_on_the_Homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karee\\OneDrive\\Desktop\\Chromedriver\\chromedriver.exe");
		
		  driver=new ChromeDriver();
		  driver.get("https://www.google.com/");
		  
	}

	@When("^The search bar is displayed$")
	public void the_search_bar_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).isDisplayed();
	}

	@Then("^Enter Inayat$")
	public void enter_Inayat() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys("Inayat");
	}

	@Then("^Enter \"([^\"]*)\"$")
	public void enter(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(arg1);
    }
}
