package br.indra.gloureirog.tests;

import static br.indra.gloureirog.core.DriverFactory.getDriver;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

import br.indra.gloureirog.core.BasePage;
import br.indra.gloureirog.core.BaseTest;
import br.indra.gloureirog.core.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CadastroCartaoTest {

	BasePage page = new BasePage();
	BaseTest teste = new BaseTest();
	/*---- CT01 ----*/

	@Given("^CT01 - Acceder la Página principal$")
	public void acessarPaginaCadastro() throws Throwable {
		getDriver().get("http://www.bancoripley.com.pe/bancoripley/home/index.html");
		teste.finaliza();
	}
	@When("^CT01 - Ir a creditos$")
	public void irCredito1() throws InterruptedException, IOException{
		
		WebElement we = DriverFactory.getDriver().findElement(By.id("m_creditos"));
		WebElement wd =DriverFactory.getDriver().findElement(By.id("MMMenu0805194703_0_Item_0"));




		String mouseOverScript = 
		"if(document.createEvent){var evObj = document.createEvent('MouseEvents');"
		+"evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} "
			+ "else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";


		
		((JavascriptExecutor)DriverFactory.getDriver()).executeScript(mouseOverScript,we);
		Thread.sleep(1000);
		
		((JavascriptExecutor)DriverFactory.getDriver()).executeScript(mouseOverScript,wd);

		Thread.sleep(2000);

		((JavascriptExecutor)DriverFactory.getDriver()).executeScript("arguments[0].click();",wd);
		teste.finaliza();
		
	}
	@When("^CT01 - Ir a creditos2$")
	public void irCredito2() throws InterruptedException, IOException{
		WebElement we = DriverFactory.getDriver().findElement(By.id("m_creditos"));
		WebElement wd =DriverFactory.getDriver().findElement(By.id("MMMenu0805194703_0_Item_1"));




		String mouseOverScript = 
		"if(document.createEvent){var evObj = document.createEvent('MouseEvents');"
		+"evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} "
			+ "else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";


		
		((JavascriptExecutor)DriverFactory.getDriver()).executeScript(mouseOverScript,we);
		Thread.sleep(1000);
		
		((JavascriptExecutor)DriverFactory.getDriver()).executeScript(mouseOverScript,wd);

		Thread.sleep(2000);

		((JavascriptExecutor)DriverFactory.getDriver()).executeScript("arguments[0].click();",wd);
		teste.finaliza();
	}
	
	
	@When("^CT01 - Ir a creditos3$")
	public void irCredito3() throws InterruptedException, IOException{
		WebElement we = DriverFactory.getDriver().findElement(By.id("m_creditos"));
		WebElement wd =DriverFactory.getDriver().findElement(By.id("MMMenu0805194703_0_Item_2"));




		String mouseOverScript = 
		"if(document.createEvent){var evObj = document.createEvent('MouseEvents');"
		+"evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} "
			+ "else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";


		
		((JavascriptExecutor)DriverFactory.getDriver()).executeScript(mouseOverScript,we);
		Thread.sleep(1000);
		
		((JavascriptExecutor)DriverFactory.getDriver()).executeScript(mouseOverScript,wd);

		Thread.sleep(2000);

		((JavascriptExecutor)DriverFactory.getDriver()).executeScript("arguments[0].click();",wd);
		teste.finaliza();
	}
	
	@When("^CT01 - Ir a creditos4$")
	public void irCredito4() throws InterruptedException, IOException{
		WebElement we = DriverFactory.getDriver().findElement(By.id("m_creditos"));
		WebElement wd =DriverFactory.getDriver().findElement(By.id("MMMenu0805194703_0_Item_3"));




		String mouseOverScript = 
		"if(document.createEvent){var evObj = document.createEvent('MouseEvents');"
		+"evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} "
			+ "else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";


		
		((JavascriptExecutor)DriverFactory.getDriver()).executeScript(mouseOverScript,we);
		Thread.sleep(1000);
		
		((JavascriptExecutor)DriverFactory.getDriver()).executeScript(mouseOverScript,wd);

		Thread.sleep(2000);

		((JavascriptExecutor)DriverFactory.getDriver()).executeScript("arguments[0].click();",wd);
		teste.finaliza();
	}
	@When("^CT01 - Ir a creditos5$")
	public void irCredito5() throws InterruptedException, IOException{
		WebElement we = DriverFactory.getDriver().findElement(By.id("m_creditos"));
		WebElement wd =DriverFactory.getDriver().findElement(By.id("MMMenu0805194703_0_Item_4"));




		String mouseOverScript = 
		"if(document.createEvent){var evObj = document.createEvent('MouseEvents');"
		+"evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} "
			+ "else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";


		
		((JavascriptExecutor)DriverFactory.getDriver()).executeScript(mouseOverScript,we);
		Thread.sleep(1000);
		
		((JavascriptExecutor)DriverFactory.getDriver()).executeScript(mouseOverScript,wd);

		Thread.sleep(2000);

		((JavascriptExecutor)DriverFactory.getDriver()).executeScript("arguments[0].click();",wd);
		teste.finaliza();
	}
	
	
	@When("^CT01 - Ir a creditos6$")
	public void irCredito6() throws InterruptedException, IOException{
		WebElement we = DriverFactory.getDriver().findElement(By.id("m_creditos"));
		WebElement wd =DriverFactory.getDriver().findElement(By.id("MMMenu0805194703_0_Item_5"));




		String mouseOverScript = 
		"if(document.createEvent){var evObj = document.createEvent('MouseEvents');"
		+"evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} "
			+ "else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";


		
		((JavascriptExecutor)DriverFactory.getDriver()).executeScript(mouseOverScript,we);
		Thread.sleep(1000);
		
		((JavascriptExecutor)DriverFactory.getDriver()).executeScript(mouseOverScript,wd);

		Thread.sleep(2000);

		((JavascriptExecutor)DriverFactory.getDriver()).executeScript("arguments[0].click();",wd);
		//teste.finaliza();
	}
	
	
	
	
	
	
	@When("^CT01 - Acceda la página de tarjetas$")
	public void clicarTarjeta() throws Throwable {
		getDriver().navigate().to("https://www.solicitatutarjetabancoripley.com.pe/");
	}

	@When("^CT01 - Añadir DNI \"(.*?)\" válido$")
	public void inserirDni(String dni) throws Throwable {
		page.escreverWaitId("userDNI", dni);
		
	}

	@When("^CT01 - Añadir Correo \"(.*?)\" válido$")
	public void inserirCorreo(String correo) throws Throwable {
		page.escreverWaitId("userEmail", correo);
	}

	@When("^CT01 - Clic en enviar$")
	public void acessarTelaTipoAutorizacao() throws Throwable {
		page.clicarWaitXpath("//*[@id=\"form1\"]/a");
	}

	/*---- CT001 ----*/
	

}
