package com.unigis.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.unigis.helps.WebActions;

import org.junit.Assert;

public class ContactoPage extends WebActions {
	
	WebDriver driver;
	
	// Elementos
	@FindBy(name = "firstname")
	private WebElement txtNombre;
	
	@FindBy(name = "lastname")
	private WebElement txtApellido;
	
	@FindBy(name = "email")
	private WebElement txtCorreo;
	
	@FindBy(name = "mobilephone")
	private WebElement txtNumTel;
	
	@FindBy(name = "company")
	private WebElement txtNombreEmpresa;
	
	@FindBy(name = "jobtitle")
	private WebElement txtCargo;
	
	@FindBy(name = "pais")
	private WebElement cmbPais;
	
	@FindBy(name = "cantidad_de_vehiculos")
	private WebElement cmbCantVehiculos;
	
	@FindBy(xpath = "//input[@value='Enviar']")
	private WebElement btnEnviar;
	
	@FindBy(xpath = "//label[text()='Rellena todos los campos obligatorios.']")
	private WebElement msjRellenaTdsCampsObligs;

	
	// Constructor method
	public ContactoPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	// Métodos
	
	public void LlenarFormulario(String nombre, String apellido, String correo, String numTel, String empresa, String cargo, String pais, String cantidad) throws Exception
	{
		ScrollDown();
		
		driver.switchTo().frame("hs-form-iframe-0");
		
		txtNombre.sendKeys(nombre);
		txtApellido.sendKeys(apellido);
		txtCorreo.sendKeys(correo);
		txtNumTel.sendKeys(numTel);
		txtNombreEmpresa.sendKeys(empresa);
		txtCargo.sendKeys(cargo);
		SelectByVisibleText(cmbPais, pais);
		SelectByVisibleText(cmbCantVehiculos, cantidad);
		
		Thread.sleep(2000);
		
		btnEnviar.click();
	}
	
	
	public void ValidarVisibilidadDeMensaje()
	{
		Assert.assertTrue(msjRellenaTdsCampsObligs.isDisplayed());
		driver.switchTo().defaultContent();
	}

}
