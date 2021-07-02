package com.unigis.helps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.unigis.hooks.Hooks;

public class WebActions {
	
	
	public WebDriverWait waiter()
	{		
		WebDriverWait waiter = new WebDriverWait(Hooks.driver, 15);
		return waiter;
				
	}//waiter
	
	
	public void SelectByVisibleText(WebElement cmbElement, String visibleText)
	{		
		Select selector = new Select(cmbElement);
		selector.selectByVisibleText(visibleText);
			
	}//SelectByVisibleText
	
	
	public void ScrollUP()
	{
		JavascriptExecutor js = (JavascriptExecutor)Hooks.driver;
		js.executeScript("window.scrollBy(0,-300)");
	
	}//ScrollUP
	
	
	public void ScrollDown()
	{	
		JavascriptExecutor js = (JavascriptExecutor)Hooks.driver;
		js.executeScript("window.scrollBy(0,300)");			
	
	}//ScrollDown
	

}
