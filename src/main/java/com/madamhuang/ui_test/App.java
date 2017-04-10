package com.madamhuang.ui_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
	
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
    	//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://madamhuang.com");
        Navbar navbar = new Navbar(driver);
        navbar.validateNavbarText();
		driver.quit();
    }
    
}
