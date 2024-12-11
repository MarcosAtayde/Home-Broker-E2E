package pages;

import elementos.Elementos;
import metodos.Metodos;

public class CompraFracionariaPage {

	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();

	public void comprarAtivoFracionado(String ativo, String precoCompra, String quantidade, String precoCarteira,
			String saldoCarteira) {
		metodo.escrever(elemento.ativo, ativo);
		metodo.escrever(elemento.preco, precoCompra);
		metodo.escrever(elemento.quantidade, quantidade);
		metodo.clicar(elemento.btnComprar);
		metodo.aceitarAlert();
		metodo.aceitarAlert();
		metodo.validarTexto(elemento.carteiraPetr3F, ativo + "F");
		metodo.validarTexto(elemento.valorPetro3, precoCarteira);
		metodo.validarTexto(elemento.carteiraQuantidade1, quantidade);
		metodo.validarTexto(elemento.saldoClienteF, saldoCarteira);

	}
	
	public void comprarAtivoFracionadoAcrecimo10Porcento(String ativo, String precoCompra, String quantidade,
			String precoCarteira, String saldoCarteira) {
		metodo.escrever(elemento.ativo, ativo);
		metodo.escrever(elemento.preco, precoCompra);
		metodo.escrever(elemento.quantidade, quantidade);
		metodo.clicar(elemento.btnComprar);
		metodo.aceitarAlert();
		metodo.aceitarAlert();
		metodo.aguardar1Segundo();
		metodo.validarTexto(elemento.carteiraPetr3F, ativo + "F");
		metodo.validarTexto(elemento.valorPetro3, precoCarteira);
		metodo.validarTexto(elemento.carteiraQuantidade1, quantidade);
		metodo.validarTexto(elemento.saldoCliente10F, saldoCarteira);

	}

	public void comprarAtivoFracionadoDecrecimo2Porcento(String ativo, String precoCompra, String quantidade,
			String precoCarteira, String saldoCarteira) {
		metodo.escrever(elemento.ativo, ativo);
		metodo.escrever(elemento.preco, precoCompra);
		metodo.escrever(elemento.quantidade, quantidade);
		metodo.clicar(elemento.btnComprar);
		metodo.aceitarAlert();
		metodo.aceitarAlert();
		metodo.aguardar1Segundo();
		metodo.validarTexto(elemento.carteiraPetr3F, ativo + "F");
		metodo.validarTexto(elemento.valorPetro3, precoCarteira);
		metodo.validarTexto(elemento.carteiraQuantidade1, quantidade);
		metodo.validarTexto(elemento.saldoCliente2F, saldoCarteira);

	}

	public void comprarAtivoFracionadoPrecoInvalido(String ativo, String preco, String quantidade, String msgAlertPreco) {
		metodo.escrever(elemento.ativo, ativo);
		metodo.escrever(elemento.preco, preco);
		metodo.escrever(elemento.quantidade, quantidade);
		metodo.clicar(elemento.btnComprar);
		metodo.validarMsgAlert(msgAlertPreco);

	}

	public void comprarAtivoFracionadoQtdInvalida(String ativo, String preco, String quantidade, String msgAlertQtd) {
		metodo.escrever(elemento.ativo, ativo);
		metodo.escrever(elemento.preco, preco);
		metodo.escrever(elemento.quantidade, quantidade);
		metodo.clicar(elemento.btnComprar);
		metodo.validarMsgAlert(msgAlertQtd);

	}
	
	public void comprarAtivoFracionadoParaLotePadrao(String ativo, String precoCompra, String quantidade1, String quantidade2, String precoCarteira,
			String saldoCarteira, String quantidadeCarteira) {
		metodo.escrever(elemento.ativo, ativo);
		metodo.escrever(elemento.preco, precoCompra);
		metodo.escrever(elemento.quantidade, quantidade1);
		metodo.clicar(elemento.btnComprar);
		metodo.aceitarAlert();
		metodo.aceitarAlert();
		metodo.limparCampo(elemento.quantidade);
		metodo.escrever(elemento.quantidade, quantidade2);
		metodo.clicar(elemento.btnComprar);
		metodo.aceitarAlert();
		metodo.aceitarAlert();
		metodo.validarTexto(elemento.carteiraPetr3, ativo);
		metodo.validarTexto(elemento.valorPetro3, precoCarteira);
		metodo.validarTexto(elemento.carteiraQuantidade, quantidadeCarteira);
		metodo.validarTexto(elemento.saldoCliente, saldoCarteira);

	}

}
