package pages;

import elementos.Elementos;
import metodos.Metodos;

public class LoginPage {

	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();

	public void login(String usuario, String senha) {
		metodo.escrever(elemento.usuario, usuario);
		metodo.escrever(elemento.senha, senha);
		metodo.clicar(elemento.btnLogin);
		metodo.validarUrl("https://desafio.ui.e2etreinamentos.com.br/home.html");
	}

	public void loginEmBranco(String usuario, String senha, String msgAlertCampo) {
		metodo.escrever(elemento.usuario, usuario);
		metodo.escrever(elemento.senha, senha);
		metodo.clicar(elemento.btnLogin);
		metodo.validarMsgAlert(msgAlertCampo);

	}

	public void loginUsuarioEmBranco(String usuario, String senha, String msgAlertCampo) {
		metodo.escrever(elemento.usuario, usuario);
		metodo.escrever(elemento.senha, senha);
		metodo.clicar(elemento.btnLogin);
		metodo.validarMsgAlert(msgAlertCampo);
	}

	public void loginSenhaEmBranco(String usuario, String senha, String msgAlertCampo) {
		metodo.escrever(elemento.usuario, usuario);
		metodo.escrever(elemento.senha, senha);
		metodo.clicar(elemento.btnLogin);
		metodo.validarMsgAlert(msgAlertCampo);
	}

	public void loginUsuarioInvalido(String usuario, String senha, String msgAlertInvalidos) {
		metodo.escrever(elemento.usuario, usuario);
		metodo.escrever(elemento.senha, senha);
		metodo.clicar(elemento.btnLogin);
		metodo.validarMsgAlert(msgAlertInvalidos);
	}

	public void loginSenhaInvalida(String usuario, String senha, String msgAlertInvalidos) {
		metodo.escrever(elemento.usuario, usuario);
		metodo.escrever(elemento.senha, senha);
		metodo.clicar(elemento.btnLogin);
		metodo.validarMsgAlert(msgAlertInvalidos);
	}
}