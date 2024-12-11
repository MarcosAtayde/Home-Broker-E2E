package pages;

import elementos.Elementos;
import metodos.Metodos;

public class VendaFracionariaPage {

	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();

	public void vendaAtivoFracionado(String ativo, String preco, String quantidade, String textoEsperado,
			String saldoCliente, String qtdLivroOfertas, String totalCarteira) {
		metodo.escrever(elemento.ativo, ativo);
		metodo.escrever(elemento.preco, preco);
		metodo.escrever(elemento.quantidade, quantidade);
		metodo.clicar(elemento.btnComprar);
		metodo.aceitarAlert();
		metodo.aceitarAlert();
		metodo.clicar(elemento.BtnVender);
		metodo.validarMsgAlert(textoEsperado);
		metodo.aceitarAlert();
		metodo.aceitarAlert();
		metodo.validarTexto(elemento.saldoInicialCliente, saldoCliente);
		metodo.validarTexto(elemento.qtdLivroOfertas, qtdLivroOfertas);
		metodo.validarTexto(elemento.totalCarteiraVenda, totalCarteira);

	}

	public void vendaAtivoFracionadoParaLotePadrao(String ativo, String preco, String quantidadeCompra,
			String quantidadeVenda, String textoEsperado, String saldoCliente, String qtdLivroOfertas,
			String precoCarteira, String quantidadeCarteira, String saldoCarteira) {
		metodo.escrever(elemento.ativo, ativo);
		metodo.escrever(elemento.preco, preco);
		metodo.escrever(elemento.quantidade, quantidadeCompra);
		metodo.clicar(elemento.btnComprar);
		metodo.aceitarAlert();
		metodo.aceitarAlert();
		metodo.limparCampo(elemento.quantidade);
		metodo.escrever(elemento.quantidade, quantidadeVenda);
		metodo.clicar(elemento.BtnVender);
		metodo.validarMsgAlert(textoEsperado);
		metodo.aceitarAlert();
		metodo.aceitarAlert();
		metodo.validarTexto(elemento.saldoInicialCliente, saldoCliente);
		metodo.validarTexto(elemento.qtdLivroOfertas, qtdLivroOfertas);
		metodo.validarTexto(elemento.totalCarteiraVenda, saldoCarteira);

	}

	public void vendaAtivoFracionadoAcrescimo10Porcento(String ativo, String precoCompra, String quantidade,
			String precoVenda, String textoEsperado, String saldoCliente, String qtdLivroOfertas,
			String totalCarteira) {
		metodo.escrever(elemento.ativo, ativo);
		metodo.escrever(elemento.preco, precoCompra);
		metodo.escrever(elemento.quantidade, quantidade);
		metodo.clicar(elemento.btnComprar);
		metodo.aceitarAlert();
		metodo.aceitarAlert();
		metodo.limparCampo(elemento.preco);
		metodo.escrever(elemento.preco, precoVenda);
		metodo.clicar(elemento.BtnVender);
		metodo.validarMsgAlert(textoEsperado);
		metodo.aceitarAlert();
		metodo.aceitarAlert();
		metodo.validarTexto(elemento.saldoInicialCliente10, saldoCliente);
		metodo.validarTexto(elemento.qtdLivroOfertas, qtdLivroOfertas);
		metodo.validarTexto(elemento.totalCarteiraVenda, totalCarteira);

	}

	public void vendaAtivoFracionadoDecrecimo2Porcento(String ativo, String precoCompra, String quantidade,
			String precoVenda, String textoEsperado, String saldoCliente, String qtdLivroOfertas,
			String totalCarteira) {
		metodo.escrever(elemento.ativo, ativo);
		metodo.escrever(elemento.preco, precoCompra);
		metodo.escrever(elemento.quantidade, quantidade);
		metodo.clicar(elemento.btnComprar);
		metodo.aceitarAlert();
		metodo.aceitarAlert();
		metodo.limparCampo(elemento.preco);
		metodo.escrever(elemento.preco, precoVenda);
		metodo.clicar(elemento.BtnVender);
		metodo.validarMsgAlert(textoEsperado);
		metodo.aceitarAlert();
		metodo.aceitarAlert();
		metodo.validarTexto(elemento.saldoInicialCliente2, saldoCliente);
		metodo.validarTexto(elemento.qtdLivroOfertas, qtdLivroOfertas);
		metodo.validarTexto(elemento.totalCarteiraVenda, totalCarteira);

	}

	public void vendaAtivoFracionadoPrecoInvalido(String ativo, String precoCompra, String quantidade,
			String precoVenda, String textoEsperad1, String saldoCliente, String qtdCarteira, String totalCarteira) {
		metodo.escrever(elemento.ativo, ativo);
		metodo.escrever(elemento.preco, precoCompra);
		metodo.escrever(elemento.quantidade, quantidade);
		metodo.clicar(elemento.btnComprar);
		metodo.aceitarAlert();
		metodo.aceitarAlert();
		metodo.limparCampo(elemento.preco);
		metodo.escrever(elemento.preco, precoVenda);
		metodo.clicar(elemento.BtnVender);
		metodo.validarMsgAlert(textoEsperad1);
		metodo.aceitarAlert();
		metodo.validarTexto(elemento.saldoClienteF, saldoCliente);
		metodo.validarTexto(elemento.carteiraQuantidade1, qtdCarteira);
		metodo.validarTexto(elemento.totalCarteiraVenda30, totalCarteira);

	}

	public void vendaAtivoFracionadoPrecoIgual0(String ativo, String precoCompra, String quantidade, String precoVenda,
			String textoEsperad1, String textoEsperado2, String saldoCliente, String qtdCarteira,
			String totalCarteira) {
		metodo.escrever(elemento.ativo, ativo);
		metodo.escrever(elemento.preco, precoCompra);
		metodo.escrever(elemento.quantidade, quantidade);
		metodo.clicar(elemento.btnComprar);
		metodo.aceitarAlert();
		metodo.aceitarAlert();
		metodo.limparCampo(elemento.preco);
		metodo.escrever(elemento.preco, precoVenda);
		metodo.clicar(elemento.BtnVender);
		metodo.validarMsgAlert(textoEsperad1);
		metodo.aceitarAlert();
		metodo.validarMsgAlert(textoEsperado2);
		metodo.aceitarAlert();
		metodo.validarTexto(elemento.saldoClienteF, saldoCliente);
		metodo.validarTexto(elemento.carteiraQuantidade1, qtdCarteira);
		metodo.validarTexto(elemento.totalCarteiraVenda30, totalCarteira);

	}

	public void vendaAtivoSemAtivoNaCarteira(String ativo, String preco, String quantidade, String msgAlertQtd,
			String saldoCliente, String qtdLivroOfertas, String totalCarteira) {
		metodo.escrever(elemento.ativo, ativo);
		metodo.escrever(elemento.preco, preco);
		metodo.escrever(elemento.quantidade, quantidade);
		metodo.clicar(elemento.BtnVender);
		metodo.validarMsgAlert(msgAlertQtd);
		metodo.aceitarAlert();
		metodo.validarTexto(elemento.saldoInicialClienteVirgula, saldoCliente);
		metodo.validarTexto(elemento.qtdLivroOfertas, qtdLivroOfertas);
		metodo.validarTexto(elemento.totalCarteiraVenda00, totalCarteira);

	}

}
