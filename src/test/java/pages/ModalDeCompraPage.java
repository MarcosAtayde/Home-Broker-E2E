package pages;

import elementos.Elementos;
import metodos.Metodos;

public class ModalDeCompraPage {

	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();

	public void aceiteModalConfirmacaoCompra(String ativo, String preco, String quantidade) {
		metodo.escrever(elemento.ativo, ativo);
		metodo.escrever(elemento.preco, preco);
		metodo.escrever(elemento.quantidade, quantidade);
		metodo.clicar(elemento.btnComprar);
		metodo.aceitarAlert();
		metodo.aceitarAlert();

	}

	public void recusarModalConfirmacaoCompra(String ativo, String preco, String quantidade) {
		metodo.escrever(elemento.ativo, ativo);
		metodo.escrever(elemento.preco, preco);
		metodo.escrever(elemento.quantidade, quantidade);
		metodo.clicar(elemento.btnComprar);
		metodo.aceitarAlert();
		metodo.recusarAlert();

	}

	public void validarModalConfirmacaoCompra(String ativo, String preco, String quantidade, String textoEsperado1, String textoEsperado2) {
		metodo.escrever(elemento.ativo, ativo);
		metodo.escrever(elemento.preco, preco);
		metodo.escrever(elemento.quantidade, quantidade);
		metodo.clicar(elemento.btnComprar);
		metodo.validarMsgAlert(textoEsperado1);
		metodo.aceitarAlert();
		metodo.validarMsgAlert(textoEsperado2);
		metodo.aceitarAlert();

	}

}
