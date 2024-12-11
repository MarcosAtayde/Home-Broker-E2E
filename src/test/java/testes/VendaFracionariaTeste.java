package testes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import navegadores.Navegadores;
import pages.LoginPage;
import pages.VendaFracionariaPage;

public class VendaFracionariaTeste {

	LoginPage login = new LoginPage();
	VendaFracionariaPage vendaF = new VendaFracionariaPage();
	String alertVenda = "Confirma a venda:\n"
			+ "- Ativo: PETR3\n"
			+ "- Quantidade: 1 unidades\n"
			+ "- Preço unitário: R$ 30,00\n"
			+ "- Total: R$ 30,00\n"
			+ "\n"
			+ "Deseja continuar?";
	String alertVenda10 = "Confirma a venda:\n"
			+ "- Ativo: PETR3\n"
			+ "- Quantidade: 1 unidades\n"
			+ "- Preço unitário: R$ 33,00\n"
			+ "- Total: R$ 33,00\n"
			+ "\n"
			+ "Deseja continuar?";
	String alertVenda2 = "Confirma a venda:\n"
			+ "- Ativo: PETR3\n"
			+ "- Quantidade: 1 unidades\n"
			+ "- Preço unitário: R$ 29,40\n"
			+ "- Total: R$ 29,40\n"
			+ "\n"
			+ "Deseja continuar?";
	String alertPreco0 = "Por favor, insira valores válidos.";
	String alertCampos = "Preencha os campos corretamente.";
	String alertPreco = "O preço deve estar entre R$ 29,40 e R$ 33,00";
	String alertCarteira = "Quantidade insuficiente na carteira.";

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
	public void vendaAtivoFracionado() {
		vendaF.vendaAtivoFracionado("PETR3", "30,00", "1", alertVenda, "R$ 10000.00", "150", "Total: R$ 0,00");

	}
	
	// não passa por bug
	@Test
	public void vendaAtivoFracionadoParaLotePadrao() {
		vendaF.vendaAtivoFracionadoParaLotePadrao("PETR3", "30,00", "11", "1", alertVenda, "R$ 9700.00", "140", "30,00", "10", "Total: R$ 300,00");

	}

	@Test
	public void vendaAtivoFracionadoAcrescimo10PorCento() {
		vendaF.vendaAtivoFracionadoAcrescimo10Porcento("PETR3", "30,00", "1", "33,00", alertVenda10, "R$ 10003.00", "150", "Total: R$ 0,00");
		
	}
	
	@Test
	public void vendaAtivoFracionadoDecrescimo2PorCento() {
		vendaF.vendaAtivoFracionadoDecrecimo2Porcento("PETR3", "30,00", "1", "29,40", alertVenda2, "R$ 9999.40", "150", "Total: R$ 0,00");
	}
	
	@Test
	public void vendaAtivoFracionadoPrecoIgual0() {
		vendaF.vendaAtivoFracionadoPrecoIgual0("PETR3", "30,00", "1", "0,00", alertPreco0, alertCampos, "R$ 9970,00", "1", "Total: R$ 30,00");

	}
	
	@Test
	public void vendaAtivoFracionadoAcrescimoMaior10PorCento() {
		vendaF.vendaAtivoFracionadoPrecoInvalido("PETR3", "30,00", "1", "33,01", alertPreco, "R$ 9970,00", "1", "Total: R$ 30,00");

	}
	
	@Test
	public void vendaAtivoFracionadoDecrescimoMaio2PorCento() {
		vendaF.vendaAtivoFracionadoPrecoInvalido("PETR3", "30,00", "1", "29,39", alertPreco, "R$ 9970,00", "1", "Total: R$ 30,00");

	}
	
	@Test
	public void vendaAtivoFracionadoSemAtivoNaCarteira() {
		vendaF.vendaAtivoSemAtivoNaCarteira("PETR3", "30,00", "1", alertCarteira, "R$ 10000,00", "150", "Total: R$ 00,00");

	}

}
