package testes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import navegadores.Navegadores;
import pages.LoginPage;

public class LoginTestes {

	LoginPage login = new LoginPage();
	String msgCamposOrigatorios = "Todos os campos precisam ser preenchidos.";
	String msgDadosInvalidos = "Usuário ou senha incorretos.";

	@BeforeEach
	public void antesDoTeste() {
		Navegadores.iniciarTeste();
	}

	@AfterEach
	public void depoisDoTeste() {
		Navegadores.finalizarTeste();
	}

	@Test
	public void loginComSucesso() {
		login.login("e2etreinamentos", "e2e@123");
	}

	@Test
	public void loginComSenhaInvalida() {
		login.loginUsuarioInvalido("e2etreinamentos", "error", msgDadosInvalidos);

	}

	@Test
	public void loginComUsuarioInvalido() {
		login.loginUsuarioInvalido("error", "e2e@123", msgDadosInvalidos);

	}

	@Test
	public void loginComSenhaEmBranco() {
		login.loginSenhaEmBranco("e2etreinamentos", "", msgCamposOrigatorios);

	}

	@Test
	public void loginComUsuarioEmBranco() {
		login.loginUsuarioEmBranco("", "e2e@123", msgCamposOrigatorios);

	}

	@Test
	public void loginComDadosEmBranco() {
		login.loginEmBranco("", "", msgCamposOrigatorios);

	}

}
