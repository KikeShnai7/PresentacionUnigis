
#Author: Enrique de Jesús García Espinosa
#Email: kiike_futball@hotmail.com

Feature: Pagina de Contacto
    
  Scenario: TC Llenado incompleto del formulario de contacto
  	Given He abierto el sitio web de Unigis
  	And Doy clic en el boton Contacto
  	When Lleno el formulario de contacto excepto un campo y doy clic en Enviar
  	Then Se muestra el mensaje Rellena todos los campos obligatorios
  	