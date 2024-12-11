package pages;

import elementos.Elementos;
import metodos.Metodos;

public class VendaPage {

	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();

	public void venderAtivo(String ativo, String preco, String quantidade, String saldoCliente, String qtdLivroOfertas,
			String totalCarteira) {
		metodo.escrever(elemento.ativo, ativo);
		metodo.escrever(elemento.preco, preco);
		metodo.escrever(elemento.quantidade, quantidade);
		metodo.clicar(elemento.btnComprar);
		metodo.aceitarAlert();
		metodo.aceitarAlert();
		metodo.validarTexto(elemento.carteiraPetr3, ativo);
		metodo.aguardarElemento(elemento.carteiraPetr3);
		metodo.clicar(elemento.BtnVender);
		metodo.aceitarAlert();
		metodo.aceitarAlert();
		metodo.validarTexto(elemento.saldoInicialCliente, saldoCliente);
		metodo.validarTexto(elemento.qtdLivroOfertas, qtdLivroOfertas);
		metodo.validarTexto(elemento.totalCarteiraVenda, totalCarteira);

	}

	public void vendaAtivoPrecoIgual0(String ativo, String precoCompra, String quantidade, String precoVenda,
			String msgAlertPreco1, String msgAlertPreco2) {
		metodo.escrever(elemento.ativo, ativo);
		metodo.escrever(elemento.preco, precoCompra);
		metodo.escrever(elemento.quantidade, quantidade);
		metodo.clicar(elemento.btnComprar);
		metodo.aceitarAlert();
		metodo.aceitarAlert();
		metodo.validarTexto(elemento.carteiraPetr3, ativo);
		metodo.aguardarElemento(elemento.carteiraPetr3);
		metodo.limparCampo(elemento.preco);
		metodo.escrever(elemento.preco, precoVenda);
		metodo.clicar(elemento.BtnVender);
		metodo.validarMsgAlert(msgAlertPreco1);
		metodo.aceitarAlert();
		metodo.validarMsgAlert(msgAlertPreco2);
		metodo.aceitarAlert();

	}

	public void vendaAtivoPrecoInvalido(String ativo, String precoCompra, String quantidade, String precoVenda,
			String msgAlertPreco1) {
		metodo.escrever(elemento.ativo, ativo);
		metodo.escrever(elemento.preco, precoCompra);
		metodo.escrever(elemento.quantidade, quantidade);
		metodo.clicar(elemento.btnComprar);
		metodo.aceitarAlert();
		metodo.aceitarAlert();
		metodo.validarTexto(elemento.carteiraPetr3, ativo);
		metodo.aguardarElemento(elemento.carteiraPetr3);
		metodo.limparCampo(elemento.preco);
		metodo.escrever(elemento.preco, precoVenda);
		metodo.clicar(elemento.BtnVender);
		metodo.validarMsgAlert(msgAlertPreco1);
		metodo.aceitarAlert();

	}

	public void vendaAtivoQtdInvalida(String ativo, String preco, String quantidadeCompra, String quantidadeVenda,
			String msgAlertPreco1) {
		metodo.escrever(elemento.ativo, ativo);
		metodo.escrever(elemento.preco, preco);
		metodo.escrever(elemento.quantidade, quantidadeCompra);
		metodo.clicar(elemento.btnComprar);
		metodo.aceitarAlert();
		metodo.aceitarAlert();
		metodo.validarTexto(elemento.carteiraPetr3, ativo);
		metodo.aguardarElemento(elemento.carteiraPetr3);
		metodo.limparCampo(elemento.preco);
		metodo.escrever(elemento.preco, preco);
		metodo.limparCampo(elemento.quantidade);
		metodo.escrever(elemento.quantidade, quantidadeVenda);
		metodo.clicar(elemento.BtnVender);
		metodo.validarMsgAlert(msgAlertPreco1);
		metodo.aceitarAlert();

	}
	
	public void vendaSemAtivo(String ativo, String preco, String quantidade, String msgAlertPreco1) {
		metodo.escrever(elemento.ativo, ativo);
		metodo.escrever(elemento.preco, preco);
		metodo.escrever(elemento.quantidade, quantidade);
		metodo.clicar(elemento.BtnVender);
		
	}

	public void vendaAtivoFracionado(String ativo, String preco, String quantidade) {
		metodo.escrever(elemento.ativo, ativo);
		metodo.escrever(elemento.preco, preco);
		metodo.escrever(elemento.quantidade, quantidade);
		metodo.clicar(elemento.btnComprar);
		metodo.aceitarAlert();
		metodo.aceitarAlert();
		metodo.validarTexto(elemento.carteiraPetr3F, ativo + "F");
		metodo.validarTexto(elemento.valorPetro3, preco);

	}

}
