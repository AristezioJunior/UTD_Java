package br.com.alura.leilao;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class HelloWorldSelenium {
	
	@Test
    public void hello() {

		System.setProperty("webdriver.chrome.driver", "C:\\UTD_Java\\2019-selenium-java-projeto_inicial\\drivers\\chromedriver.exe");		
		WebDriver browser = new ChromeDriver();
		browser.navigate().to("http://localhost:8080/leiloes");
		//browser.quit();

    }
	
	

}


//DEPENDENCIA NO PON https://www.selenium.dev/documentation/en/selenium_installation/installing_selenium_libraries/

//DRIVER REQUERIMENTO https://www.selenium.dev/documentation/en/webdriver/driver_requirements/

//BAIXANDO O DRIVER DA WEB 
/* https://chromedriver.chromium.org/downloads */

// DANDO PERMISSÃO AO WEBDRIVER NO PROMPT 
/* cacls “nomedoarquivo”(ou pasta) /E /P (ou G) “nomedousuario:Permissão a ser concedida

ex: cacls pci.txt /E /P User:F  – Nesse caso foi concedida permissão total(F) ao usuario “User” para o Arquivo “pci.txt”    */




