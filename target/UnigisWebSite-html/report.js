$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Contacto.feature");
formatter.feature({
  "name": "Pagina de Contacto",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "TC Llenado incompleto del formulario de contacto",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "He abierto el sitio web de Unigis",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.he_abierto_el_sitio_web_de_Unigis()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Doy clic en el boton Contacto",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.doy_clic_en_el_boton_Contacto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Lleno el formulario de contacto excepto un campo y doy clic en Enviar",
  "keyword": "When "
});
formatter.match({
  "location": "ContactoPageSteps.lleno_el_formulario_de_contacto_excepto_un_campo_y_doy_clic_en_Enviar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Se muestra el mensaje Rellena todos los campos obligatorios",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactoPageSteps.se_muestra_el_mensaje_Rellena_todos_los_campos_obligatorios()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Idiomas.feature");
formatter.feature({
  "name": "Cambios de Idioma",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "TC Validar cambio de idioma de Espa�ol a Ingles mediante URL",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "He abierto el sitio web de Unigis",
  "keyword": "Given "
});
formatter.step({
  "name": "Situo el cursor en la opcion de idioma Espanol",
  "keyword": "And "
});
formatter.step({
  "name": "Doy clic en la opcion English",
  "keyword": "When "
});
formatter.step({
  "name": "La URL cambia de valor \"\u003curl\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "url"
      ]
    },
    {
      "cells": [
        "https://www.unigis.com/en/unigis/"
      ]
    }
  ]
});
formatter.scenario({
  "name": "TC Validar cambio de idioma de Espa�ol a Ingles mediante URL",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "He abierto el sitio web de Unigis",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.he_abierto_el_sitio_web_de_Unigis()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Situo el cursor en la opcion de idioma Espanol",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.situo_el_cursor_en_la_opcion_de_idioma_Espanol()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Doy clic en la opcion English",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps.doy_clic_en_la_opcion_English()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "La URL cambia de valor \"https://www.unigis.com/en/unigis/\"",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.la_URL_cambia_de_valor(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "TC Validar cambio de idioma de Espa�ol a Portugues mediante URL",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "He abierto el sitio web de Unigis",
  "keyword": "Given "
});
formatter.step({
  "name": "Situo el cursor en la opcion de idioma Espanol",
  "keyword": "And "
});
formatter.step({
  "name": "Doy clic en la opcion Portugues",
  "keyword": "When "
});
formatter.step({
  "name": "La URL cambia de valor \"\u003curl\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "url"
      ]
    },
    {
      "cells": [
        "https://www.unigis.com/pt/portugues/"
      ]
    }
  ]
});
formatter.scenario({
  "name": "TC Validar cambio de idioma de Espa�ol a Portugues mediante URL",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "He abierto el sitio web de Unigis",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.he_abierto_el_sitio_web_de_Unigis()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Situo el cursor en la opcion de idioma Espanol",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.situo_el_cursor_en_la_opcion_de_idioma_Espanol()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Doy clic en la opcion Portugues",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps.doy_clic_en_la_opcion_Portugues()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "La URL cambia de valor \"https://www.unigis.com/pt/portugues/\"",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.la_URL_cambia_de_valor(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});