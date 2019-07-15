package frameworkdemo.genericmethod;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class FWutil {
	public static void takescreenshot(WebDriver driver, String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		File ss = new File("./ScreenShot/" + name + ".png");
		Files.copy(screenshot, ss);

	}
}