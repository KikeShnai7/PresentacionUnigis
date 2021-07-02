
#Author: Enrique de Jesús García Espinosa
#Email: kiike_futball@hotmail.com

Feature: Cambios de Idioma
	
	Scenario Outline: TC Validar cambio de idioma de Español a Ingles mediante URL
  	Given He abierto el sitio web de Unigis
  	And Situo el cursor en la opcion de idioma Espanol
  	When Doy clic en la opcion English
  	Then La URL cambia de valor "<url>"
  	
    Examples:
    | url |
    | https://www.unigis.com/en/unigis/ |
    
    
	Scenario Outline: TC Validar cambio de idioma de Español a Portugues mediante URL
  	Given He abierto el sitio web de Unigis
  	And Situo el cursor en la opcion de idioma Espanol
  	When Doy clic en la opcion Portugues
  	Then La URL cambia de valor "<url>"
  	
    Examples:
    | url |
    | https://www.unigis.com/pt/portugues/ |
