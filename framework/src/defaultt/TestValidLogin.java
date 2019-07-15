package defaultt;

import org.testng.annotations.Test;

import frameworkdemo.genericmethod.XL;
import frameworkdemo.pom.EnterTimeTrackSheet;
import frameworkdemo.pom.LoginPage;

public class TestValidLogin extends frameworkdemo.genericmethod.BaseTest {
	@Test
	public void TestValidLogin() {
		String UN = XL.getdata(XL_PATH, "validlogin", 1, 0);
		String PW = XL.getdata(XL_PATH, "validlogin", 1, 1);
		String title = XL.getdata(XL_PATH, "validlogin", 1, 2);
		LoginPage Lp = new LoginPage(driver);
		Lp.UserName(UN);
		Lp.PassWord(PW);
		Lp.loginButton();
		EnterTimeTrackSheet ets = new EnterTimeTrackSheet(driver);
		ets.verifyHPisDisplayed(driver, 5, title);

	}
}
