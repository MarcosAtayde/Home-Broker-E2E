package pages;

import elementos.Elementos;
import metodos.Metodos;

public class CompraPage {

	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();

	public void comprarAtivoPrecoPadrao(String ativo, String precoCompra, String quantidade, String precoCarteira,
			String saldoCarteira) {
		metodo.escrever(elemento.ativo, ativo);
		metodo.escrever(elemento.preco, precoCompra);
		metodo.escrever(elemento.quantidade, quantidade);
		metodo.clicar(elemento.btnComprar);
		metodo.aceitarAlert();
		metodo.aceitarAlert();
		metodo.aguardar1Segundo();
		metodo.validarTexto(elemento.carteiraPetr3, ativo);
		metodo.validarTexto(elemento.valorPetro3, precoCarteira);
		metodo.validarTexto(elemento.carteiraQuantidade, quantidade);
		metodo.validarTexto(elemento.saldoCliente, saldoCarteira);

	}

	public void comprarAtivoAcrecimo10Porcento(String ativo, String precoCompra, String quantidade,
			String precoCarteira, String saldoCarteira) {
		metodo.escrever(elemento.ativo, ativo);
		metodo.escrever(elemento.preco, precoCompra);
		metodo.escrever(elemento.quantidade, quantidade);
		metodo.clicar(elemento.btnComprar);
		metodo.aceitarAlert();
		metodo.aceitarAlert();
		metodo.aguardar1Segundo();
		metodo.validarTexto(elemento.carteiraPetr3, ativo);
		metodo.validarTexto(elemento.valorPetro3, precoCarteira);
		metodo.validarTexto(elemento.carteiraQuantidade, quantidade);
		metodo.validarTexto(elemento.saldoCliente10, saldoCarteira);

	}

	public void comprarAtivoDecrecimo2Porcento(String ativo, String precoCompra, String quantidade,
			String precoCarteira, String saldoCarteira) {
		metodo.escrever(elemento.ativo, ativo);
		metodo.escrever(elemento.preco, precoCompra);
		metodo.escrever(elemento.quantidade, quantidade);
		metodo.clicar(elemento.btnComprar);
		metodo.aceitarAlert();
		metodo.aceitarAlert();
		metodo.aguardar1Segundo();
		metodo.validarTexto(elemento.carteiraPetr3, ativo);
		metodo.validarTexto(elemento.valorPetro3, precoCarteira);
		metodo.validarTexto(elemento.carteiraQuantidade, quantidade);
		metodo.validarTexto(elemento.saldoCliente2, saldoCarteira);

	}

	public void comprarAtivoPrecoInvalido(String ativo, String preco, String quantidade, String msgAlertPreco) {
		metodo.escrever(elemento.ativo, ativo);
		metodo.escrever(elemento.preco, preco);
		metodo.escrever(elemento.quantidade, quantidade);
		metodo.clicar(elemento.btnComprar);
		metodo.validarMsgAlert(msgAlertPreco);

	}

	public void comprarAtivoQtdInvalida(String ativo, String preco, String quantidade, String msgAlertQtd) {
		metodo.escrever(elemento.ativo, ativo);
		metodo.escrever(elemento.preco, preco);
		metodo.escrever(elemento.quantidade, quantidade);
		metodo.clicar(elemento.btnComprar);
		metodo.validarMsgAlert(msgAlertQtd);

	}

	public void comprarAtivoSemSaldo(String ativo1, String precoCompra1, String quantidade1, String ativo2,
			String precoCompra2, String quantidade2, String ativo3, String precoCompra3, String quantidade3,
			String msgEsperada) {
		metodo.escrever(elemento.ativo, ativo1);
		metodo.escrever(elemento.preco, precoCompra1);
		metodo.escrever(elemento.quantidade, quantidade1);
		metodo.clicar(elemento.btnComprar);
		metodo.aceitarAlert();
		metodo.aceitarAlert();
		metodo.aguardar1Segundo();
		metodo.limparCampo(elemento.preco);
		metodo.limparCampo(elemento.quantidade);
		metodo.escrever(elemento.ativo, ativo2);
		metodo.escrever(elemento.preco, precoCompra2);
		metodo.escrever(elemento.quantidade, quantidade2);
		metodo.clicar(elemento.btnComprar);
		metodo.aceitarAlert();
		metodo.aceitarAlert();
		metodo.aguardar1Segundo();
		metodo.limparCampo(elemento.preco);
		metodo.limparCampo(elemento.quantidade);
		metodo.escrever(elemento.ativo, ativo3);
		metodo.escrever(elemento.preco, precoCompra3);
		metodo.escrever(elemento.quantidade, quantidade3);
		metodo.clicar(elemento.btnComprar);
		metodo.aceitarAlert();
		metodo.aceitarAlert();
		metodo.aguardar1Segundo();
		metodo.limparCampo(elemento.preco);
		metodo.limparCampo(elemento.quantidade);
		metodo.escrever(elemento.ativo, ativo3);
		metodo.escrever(elemento.preco, precoCompra3);
		metodo.escrever(elemento.quantidade, quantidade3);
		metodo.clicar(elemento.btnComprar);
		metodo.validarMsgAlert(msgEsperada);

	}

}
