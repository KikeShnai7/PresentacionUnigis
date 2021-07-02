package com.unigis.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactoPageSteps extends BaseSteps {
	
	
	@When("^Lleno el formulario de contacto excepto un campo y doy clic en Enviar$")
	public void lleno_el_formulario_de_contacto_excepto_un_campo_y_doy_clic_en_Enviar() throws Exception {
	    
		objContactoPage.LlenarFormulario("Enrique", "Garcia", "kike07@gmail.com", "5521757435", "Mi empresa", "Director", "Alemania", "0-30");
	}

	@Then("^Se muestra el mensaje Rellena todos los campos obligatorios$")
	public void se_muestra_el_mensaje_Rellena_todos_los_campos_obligatorios() {
	    
		objContactoPage.ValidarVisibilidadDeMensaje();
	}

}
