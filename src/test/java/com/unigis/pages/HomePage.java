package com.unigis.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.unigis.helps.WebActions;

public class HomePage extends WebActions {
	
	WebDriver driver;
	
	// Elementos
	@FindBy(xpath = "//a[text()='Español']")
	private WebElement lblEspanol;
	
	@FindBy(xpath = "//a[text()='English']")
	private WebElement lblEnglish;
	
	@FindBy(xpath = "//a[text()='Português']")
	private WebElement lblPortugues;
	
	@FindBy(xpath = "//a[text()='Contacto']")
	private WebElement btnContacto;

	
	// Constructor method
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	// Métodos
	
	public void AbrirWeb(String url) throws Exception
	{
		driver.get(url);
		Thread.sleep(5000);
	}
	
	
	public void GoToElement(WebElement we) throws Exception
	{
		Actions action = new Actions(driver);
	    action.moveToElement(we).perform();
	    Thread.sleep(1500);
	}
	
	
	public void ClickIdiomaEnglish() throws Exception
	{
		lblEnglish.click();
		Thread.sleep(4000);
	}
	
	
	public void ClickIdiomaPortugues() throws Exception
	{
		lblPortugues.click();
		Thread.sleep(4000);
	}
	
	
	public void ValidarURL(String urlExpected)
	{
		String currentURL = driver.getCurrentUrl();
		//System.out.println(currentURL);
		Assert.assertEquals(currentURL, urlExpected);
	}
	
	
	public void ClickContacto()
	{
		btnContacto.click();
	}
	
	
	
	// Getters And Setters
	
	public WebElement getLblEspanol() {
		return lblEspanol;
	}
	

}
