package testes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import navegadores.Navegadores;
import pages.LoginPage;
import pages.VendaPage;

public class VendaPetrobrasTeste {
	
	VendaPage venda = new VendaPage();
	LoginPage login = new LoginPage();
	String msgAlertPreco1 = "Por favor, insira valores válidos.";
	String msgAlertPreco2 = "Preencha os campos corretamente.";
	String msgAlertPreco3 = "O preço deve estar entre R$ 29,40 e R$ 33,00";
	String msgalertQtdCarteira = "Quantidade insuficiente na carteira.";
	
	@BeforeEach
	public void antesDoTeste() {
		Navegadores.iniciarTeste();
		login.login("e2etreinamentos", "e2e@123");
	}

	@AfterEach
	public void depoisDoTeste() {
		Navegadores.finalizarTeste();
	}
	
	//@Test
	public void vendaPrecoPadraoPetrobras() {
		venda.venderAtivo("PETR3", "30,00", "10", "150", "R$ 10000,00", "Total: R$ 00,00");
	}
	
	//@Test
	public void vendaAcrecimo10PorcentoPrecoPetrobras() {
		venda.venderAtivo("PETR3", "33,00", "10", "150", "R$ 10000,00", "Total: R$ 00,00");
	}
	
	//@Test
	public void vendaDecrecimo2PorcentoPrecoPetrobras() {
		venda.venderAtivo("PETR3", "29,40", "10", "150", "R$ 10000,00", "Total: R$ 00,00");
	}
	
	//@Test
	public void vendaPrecoIgual0Petrobras() {
		venda.vendaAtivoPrecoIgual0("PETR3", "30,00", "10", "0", msgAlertPreco1, msgAlertPreco2);
	}
	
	//@Test
	public void vendaAcrecimoMaiorQue10PorcentoPetrobras() {
		venda.vendaAtivoPrecoInvalido("PETR3", "30,00", "10", "33,01", msgAlertPreco3);
	}
	
	//@Test
	public void vendaDecrecimoMaiorQue2PorcentoPetrobras() {
		venda.vendaAtivoPrecoInvalido("PETR3", "30,00", "10", "29,39", msgAlertPreco3);
	}
	
	//@Test
	public void vendaQtdMaiorQueDisponivel() {
		venda.vendaAtivoQtdInvalida("PETR3", "30,00", "10", "11", msgalertQtdCarteira);
	}
	
	//@Test
		public void vendaQtdigual0() {
			venda.vendaAtivoQtdInvalida("PETR3", "30,00", "10", "0", msgAlertPreco1);
		}
	
	//@Test
	public void vendaQtdCasaDecimal() {
		venda.vendaAtivoQtdInvalida("PETR3", "30,00", "10", "1,75", msgAlertPreco1);
	}
	
	@Test
	public void vendaSemAtivos() {
		venda.vendaSemAtivo("PETR3", "30,00", "10", msgAlertPreco1);
	}
	
	
	

}
