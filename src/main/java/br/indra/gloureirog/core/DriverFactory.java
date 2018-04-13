package br.indra.gloureirog.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import br.indra.gloureirog.core.Propriedades.Browsers;;


public class DriverFactory {

	private static WebDriver driver;

	private DriverFactory() {
	}
	
	public static void navegador(Browsers param) {
		Propriedades.browser = Browsers.CHROME;
	}

	public static WebDriver getDriver() {
		if (driver == null) {
			switch (Propriedades.browser) {
			case CHROME:
				System.setProperty("webdriver.chrome.driver", "C:/Users/rcrodriguesm/Downloads/chromedriver_win32/chromedriver.exe");
				driver = new ChromeDriver();
				break;
			}
			driver.manage().window().maximize();
		}
		return driver;
	}

	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
