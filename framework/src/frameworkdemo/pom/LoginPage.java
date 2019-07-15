package frameworkdemo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id = "username")
	private WebElement UNTB;
	@FindBy(name = "password")
	private WebElement PWTB;
	@FindBy(id = "loginButton")
	private WebElement loginBTN;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void UserName(String UN) {
		UNTB.sendKeys(UN);
	}

	public void PassWord(String PW) {
		PWTB.sendKeys(PW);

	}

	public void loginButton() {
		loginBTN.click();

	}
}
