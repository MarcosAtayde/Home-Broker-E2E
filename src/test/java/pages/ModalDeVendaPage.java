package pages;

import elementos.Elementos;
import metodos.Metodos;

public class ModalDeVendaPage {
	
	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();

	public void aceiteModalConfirmacaoVenda(String ativo, String preco, String quantidade) {
		metodo.escrever(elemento.ativo, ativo);
		metodo.escrever(elemento.preco, preco);
		metodo.escrever(elemento.quantidade, quantidade);
		metodo.clicar(elemento.btnComprar);
		metodo.aceitarAlert();
		metodo.aceitarAlert();
		metodo.clicar(elemento.BtnVender);
		metodo.aceitarAlert();
		metodo.aceitarAlert();

	}
	
	public void recusaModalConfirmacaoVenda(String ativo, String preco, String quantidade) {
		metodo.escrever(elemento.ativo, ativo);
		metodo.escrever(elemento.preco, preco);
		metodo.escrever(elemento.quantidade, quantidade);
		metodo.clicar(elemento.btnComprar);
		metodo.aceitarAlert();
		metodo.aceitarAlert();
		metodo.clicar(elemento.BtnVender);
		metodo.aceitarAlert();
		metodo.aceitarAlert();

	}
	
	public void validacaoModalConfirmacaoVenda(String ativo, String preco, String quantidade, String textoEsperado) {
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

	}

}
