package runnerClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.Base_class;
import pageobjectmodel.Payment;
import pageobjectmodel.Printed;
import pageobjectmodel.Proceed;
import pageobjectmodel.Proceed_1;
import pageobjectmodel.Proceed_2;
import pageobjectmodel.Proceed_3;
import pageobjectmodel.SignIn;
import pageobjectmodel.SignIn_btn;
import pageobjectmodel.Women;

public class Runner_class extends Base_class{

	public static void main(String[] args) throws Throwable {
		launchBrowser("chrome");
		getUrl("http://automationpractice.com/index.php");
		implicitlyWait();
		
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		isEnabled(signin);
		
		
		
		SignIn si = new SignIn(driver);
		clickOnElement(si.getSignBtn());
		
		SignIn_btn sibtn = new SignIn_btn(driver);
		inputValueOfElement(sibtn.getEmail(), "maneesh300@gmail.com");
		inputValueOfElement(sibtn.getPass(), "maneesh");
		clickOnElement(sibtn.getSubmit_btn());
				
		Women wo = new Women(driver);
		actions(wo.getWomen(), "move");
		clickOnElement(wo.getCasualDress());
		
		Printed pr = new Printed(driver);
		clickOnElement(pr.getDress());
		
		inputValueOfElement(pr.getQuantity(), "2");
		inputValueOfElement(pr.getSize(), "M");
		clickOnElement(pr.getAddTOCart());
		
		Proceed pro = new Proceed(driver);
		clickOnElement(pro.getCheckout());
		
		Proceed_1 pro_1 = new Proceed_1(driver);
		actions(pro_1.getProceed(), "move");
		clickOnElement(pro_1.getProceed());
		
		Proceed_2 pro_2 = new Proceed_2(driver);
		actions(pro_2.getProceed1(), "move");
		clickOnElement(pro_2.getProceed1());
		
		Proceed_3 pro_3= new Proceed_3(driver);
		clickOnElement(pro_3.getRadio());
		clickOnElement(pro_3.getProceed2());
		
		Payment pay = new Payment(driver);
		clickOnElement(pay.getPay());
		clickOnElement(pay.getConfirm());
		actions(pay.gettext(), "move");
		
		screenShot("Complete");
		
		
		
		
		
		
	
	
	}
}
