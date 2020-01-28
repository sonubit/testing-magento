package com.abc.MagentoMain;
				
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.abc.factory.Home;
import com.abc.factory.Login;
import com.abc.factory.Welcome;


public class MagentoTest {
    @Test
	public void test() {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://magento.com");
	Welcome w =new Welcome(driver);
	w.clickOnMyAccount();
	Login l=new Login(driver);
	l.typeEmail("kundansinghmahisour@gmail.com");
	l.typePassword("Welcome@123");
	l.clickOnLogin();
	Home h=new Home(driver);
	h.clickOnLogOut();
	driver.quit();
	
}
}
