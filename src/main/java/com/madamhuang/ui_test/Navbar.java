package com.madamhuang.ui_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Navbar {
	
	private WebDriver driver;
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public Navbar(WebDriver driver){
		this.driver = driver;
	}
	
	public void validateNavbarText(){
		logger.info("Ready to find links");
        (new WebDriverWait(driver, 15)).until(
        		ExpectedConditions.presenceOfElementLocated(By.className("nav-item")));
        logger.info("End wait.");
        List<WebElement> navlinks = driver.findElements(By.className("nav-item"));
        try{
            for(WebElement navlink : navlinks){
            	WebElement a = navlink.findElement(By.tagName("a"));
            	if(a != null){
            		logger.info(a.getText());
            	}
            }
        }catch(Exception ex){
        	logger.info(ex.getMessage());
        }
	}
}
