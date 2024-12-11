package navegadores;

import org.openqa.selenium.chrome.ChromeDriver;

import drivers.Drivers;

public class Navegadores extends Drivers{
	
	public static void iniciarTeste() {
		driver = new ChromeDriver();
		driver.get("https://desafio.ui.e2etreinamentos.com.br/hb.html");
		driver.manage().window().maximize();
	}
	
	public static void finalizarTeste() {
		driver.quit();
		
	}

}
