package testes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import navegadores.Navegadores;
import pages.CompraFracionariaPage;
import pages.LoginPage;

public class CompraFracionariaTestes {
	
	CompraFracionariaPage compraF = new CompraFracionariaPage();
	LoginPage login = new LoginPage();
	String msgAlertPreco1 = "O preço deve estar entre R$ 29,40 e R$ 33,00";
	String msgAlertPreco2 = "Preencha os campos corretamente.";

	@BeforeEach
	public void antesDoTeste() {
		Navegadores.iniciarTeste();
		login.login("e2etreinamentos", "e2e@123");
	}

	@AfterEach
	public void depoisDoTeste() {
		Navegadores.finalizarTeste();
	}

	@Test
	public void compraFracionariaPrecoPadrãoPetrobras() {
		compraF.comprarAtivoFracionado("PETR3", "30,00", "1", "30,00", "R$ 9970,00");

	}

	@Test
	public void compraFracionariaAcrecimo10PorcentoPetrobras() {
		compraF.comprarAtivoFracionadoAcrecimo10Porcento("PETR3", "33,00", "1", "30,00", "R$ 9967,00");

	}

	@Test
	public void compraFracionariaDecrecimo2PorcentoPetrobras() {
		compraF.comprarAtivoFracionadoDecrecimo2Porcento("PETR3", "29,40", "1", "30,00", "R$ 9970,60");

	}

	@Test
	public void compraFracionariaPrecoIgual0Petrobras() {
		compraF.comprarAtivoFracionadoPrecoInvalido("PETR3", "0", "1", msgAlertPreco2);

	}

	@Test
	public void compraFracionariaAcrecimoMaiorQue10PorcentoPetrobras() {
		compraF.comprarAtivoFracionadoPrecoInvalido("PETR3", "33,01", "1", msgAlertPreco1);

	}

	@Test
	public void compraFracionariaDecrecimoMaiorQue2PorcentoPetrobras() {
		compraF.comprarAtivoFracionadoPrecoInvalido("PETR3", "29,39", "1", msgAlertPreco1);

	}
	
	@Test
	public void comprarAtivoFracionadoParaLotePadrao() {
		compraF.comprarAtivoFracionadoParaLotePadrao("PETR3", "30,00", "1", "9", "30,00", "R$ 9700,00", "10");

	}

}
