package br.indra.gloureirog.tests;

import static br.indra.gloureirog.core.DriverFactory.getDriver;

import br.indra.gloureirog.core.BasePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CadastroCartaoTest {

	BasePage page = new BasePage();
	
	/*---- CT01 ----*/

	@Given("^CT01 - Acceder la Página principal$")
	public void acessarPaginaCadastro() throws Throwable {
		getDriver().get("http://www.bancoripley.com.pe/bancoripley/home/index.html");
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
