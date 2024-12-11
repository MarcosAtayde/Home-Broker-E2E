package metodos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import drivers.Drivers;

public class Metodos extends Drivers {

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}

	public void validarMsgAlert(String textoEsperado) {
		Alert alert = driver.switchTo().alert();
		assertEquals(alert.getText(), textoEsperado);
	}

	public void validarUrl(String urlEsperada) {
		assertEquals(urlEsperada, driver.getCurrentUrl());

	}

	public void validarTexto(By elemento, String textoEsperado) {
		assertEquals(textoEsperado, driver.findElement(elemento).getText());
	}

	public void aceitarAlert() {
		driver.switchTo().alert().accept();
	}
	
	public void recusarAlert() {
		driver.switchTo().alert().dismiss();
	}
	
	public void mudarParaAlert() {
		driver.switchTo().alert();
	}

	public void aguardarElemento(By elemento) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
	}

	public void extrairMsgAlert() {
		String alert = driver.switchTo().alert().getText();
		System.out.println(alert);
	}

	public void aguardarAlert() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());

	}

	public void limparCampo(By elemento) {
		driver.findElement(elemento).clear();

	}

	public void aguardar1Segundo() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}
	
	public void validar2Alerts(String comprarealizada, String confirmacaoCompra) {
		// Primeiro alerta
	    Alert alert1 = driver.switchTo().alert();
	    String textoAlert1 = alert1.getText();
	    assertEquals(textoAlert1, comprarealizada);
	    alert1.accept();

	    // Segundo alerta
	    Alert alert2 = driver.switchTo().alert();
	    String textoAlert2 = alert2.getText();
	    assertEquals(textoAlert2, confirmacaoCompra);
	    alert2.accept();
	}

}
