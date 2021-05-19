package Testcase;

import org.base.h2k.BaseSetUP;
import org.openqa.selenium.WebDriver;
import org.page.h2k.Electronics;
import org.page.h2k.HomePage;
import org.page.h2k.SubMenu;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase1 extends BaseSetUP{

	WebDriver driver;  //driver from base class in order to execute all the program
	HomePage homeobj=null;
	SubMenu subobj=null;
	Electronics elecobj=null;
	
	@BeforeClass
	public void setup()
	{
		driver=getDriver(); //calling to launch the browser
		homeobj=new HomePage(driver); //this is the driver from constructor 
		subobj=new SubMenu(driver);
		elecobj=new Electronics(driver);
    }
	
	@Test
	public void TC1()
	{
		homeobj.SignINDisplayed();
		subobj.InitialSubMenustep();
		elecobj.accessoriespagevisibility();
	}
}
