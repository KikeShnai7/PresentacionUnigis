package com.unigis.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps extends BaseSteps {
	
	
	@Given("^He abierto el sitio web de Unigis$")
	public void he_abierto_el_sitio_web_de_Unigis() throws Exception {
	    
		objHome.AbrirWeb("https://www.unigis.com/");
	}

	
	@And("Situo el cursor en la opcion de idioma Espanol")
	public void situo_el_cursor_en_la_opcion_de_idioma_Espanol() throws Exception {
	   
		objHome.GoToElement(objHome.getLblEspanol());
	}

	
	@When("^Doy clic en la opcion English$")
	public void doy_clic_en_la_opcion_English() throws Exception {
		
		objHome.ClickIdiomaEnglish();
	}

	
	@Then("La URL cambia de valor {string}")
	public void la_URL_cambia_de_valor(String url) {
	    
		objHome.ValidarURL(url);
	}

	
	@When("^Doy clic en la opcion Portugues$")
	public void doy_clic_en_la_opcion_Portugues() throws Exception {
	    
		objHome.ClickIdiomaPortugues();
	}
	
	
	@And("^Doy clic en el boton Contacto$")
	public void doy_clic_en_el_boton_Contacto() {
	    
		objHome.ClickContacto();
	}
	
}