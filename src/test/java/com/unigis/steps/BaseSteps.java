package com.unigis.steps;

import org.openqa.selenium.support.PageFactory;

import com.unigis.hooks.Hooks;
import com.unigis.pages.ContactoPage;
import com.unigis.pages.HomePage;

public class BaseSteps {
	
	protected HomePage objHome;
	protected ContactoPage objContactoPage;
	
	// Constructor method
	public BaseSteps()
	{
		objHome = new HomePage(Hooks.driver);
		PageFactory.initElements(Hooks.driver, objHome);
		
		objContactoPage = new ContactoPage(Hooks.driver);
		PageFactory.initElements(Hooks.driver, objContactoPage);
	}
	
}