package testes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import navegadores.Navegadores;
import pages.LoginPage;
import pages.ModalDeCompraPage;

public class ModalCompraTeste {
	
	LoginPage login = new LoginPage();
	ModalDeCompraPage modalCompra = new ModalDeCompraPage();
	
	String compraRealizada = "Compra realizada com sucesso usando saldo!";
	String confirmacaoCompra = "Confirma a compra:\n" + "- Ativo: PETR3\n" + "- Quantidade: 10 unidades\n"
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
	public void confirmarModalCompra() {
		modalCompra.aceiteModalConfirmacaoCompra("PETR3", "30,00", "10");
	}
	
	@Test
	public void recusarModalCompra() {
		modalCompra.recusarModalConfirmacaoCompra("PETR3", "30,00", "10");
	}
	
	@Test
	public void validarModalCompra() {
		modalCompra.validarModalConfirmacaoCompra("PETR3", "30,00", "10", compraRealizada, confirmacaoCompra);
	}

}
