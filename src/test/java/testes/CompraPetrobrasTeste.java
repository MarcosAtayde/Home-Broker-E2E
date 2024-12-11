package testes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import navegadores.Navegadores;
import pages.CompraPage;
import pages.LoginPage;

public class CompraPetrobrasTeste {

	CompraPage compra = new CompraPage();
	LoginPage login = new LoginPage();
	String msgAlertPreco1 = "O preço deve estar entre R$ 29,40 e R$ 33,00";
	String msgAlertPreco2 = "Preencha os campos corretamente.";
	String msgAlertQtd1 = "Quantidade insuficiente no livro de ofertas.";
	String msgSaldo = "Saldo insuficiente! Ative a conta margem ou deposite mais fundos.";

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
	public void compraPrecoPadrãoPetrobras() {
		compra.comprarAtivoPrecoPadrao("PETR3", "30,00", "10", "30,00", "R$ 9700,00");

	}

	@Test
	public void compraAcrecimo10PorcentoPetrobras() {
		compra.comprarAtivoAcrecimo10Porcento("PETR3", "33,00", "10", "30,00", "R$ 9670,00");

	}

	@Test
	public void compraDecrecimo2PorcentoPetrobras() {
		compra.comprarAtivoDecrecimo2Porcento("PETR3", "29,40", "10", "30,00", "R$ 9706,00");

	}

	@Test
	public void compraPrecoIgual0Petrobras() {
		compra.comprarAtivoPrecoInvalido("PETR3", "0", "10", msgAlertPreco2);

	}

	@Test
	public void compraAcrecimoMaiorQue10PorcentoPetrobras() {
		compra.comprarAtivoPrecoInvalido("PETR3", "33,01", "10", msgAlertPreco1);

	}

	@Test
	public void compraDecrecimoMaiorQue2PorcentoPetrobras() {
		compra.comprarAtivoPrecoInvalido("PETR3", "29,39", "10", msgAlertPreco1);

	}

	@Test
	public void compraPetrobrasQtdMaiorQueDisponivel() {
		compra.comprarAtivoQtdInvalida("PETR3", "30,00", "151", msgAlertQtd1);

	}
	
	@Test
	public void compraPetrobrasQtdIgual0() {
		compra.comprarAtivoQtdInvalida("PETR3", "30,00", "0", msgAlertPreco2);

	}
	
	// Não passa por aceitar numeros com casa decimal
	
	@Test
	public void compraPetrobrasQtdMCasaDecimal() {
		compra.comprarAtivoQtdInvalida("PETR3", "30,00", "10,5", msgAlertQtd1);

	}
	
	@Test
	public void compraAtivoSemSaldo() {
		compra.comprarAtivoSemSaldo("PETR3", "30,00", "140", "LREN3", "80,00", "70", "MGLU3", "10,00", "20", msgSaldo);

	}

}
