package testes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import navegadores.Navegadores;
import pages.LoginPage;
import pages.ModalDeVendaPage;

public class ModalVendaTeste {
	
	LoginPage login = new LoginPage();
	ModalDeVendaPage modalVenda = new ModalDeVendaPage();
	
	String confirmacaoVenda = "Confirma a venda:\n" + "- Ativo: PETR3\n" + "- Quantidade: 10 unidades\n"
			+ "- Preço unitário: R$ 30,00\n" + "- Total: R$ 300,00\n" + "\n" + "Deseja continuar?";
	
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
	public void aceitarModalVenda() {
		modalVenda.aceiteModalConfirmacaoVenda("PETR3", "30,00", "10");
		
	}
	
	@Test
	public void recusarModalVenda() {
		modalVenda.recusaModalConfirmacaoVenda("PETR3", "30,00", "10");
		
	}
	
	@Test
	public void validarModalVenda() {
		modalVenda.validacaoModalConfirmacaoVenda("PETR3", "30,00", "10", confirmacaoVenda);
		
	}

}
