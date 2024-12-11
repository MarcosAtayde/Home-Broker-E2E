package elementos;

import org.openqa.selenium.By;

public class Elementos {

	// Home Page Homebroker
	public By usuario = By.id("username");
	public By senha = By.id("password");
	public By btnLogin = By.id("loginButton");

	// Pagina inicial de usuário Homebroker
	public By ativo = By.id("asset");
	public By preco = By.id("price");
	public By quantidade = By.id("quantity");
	public By btnComprar = By.id("buy-button");
	public By BtnVender = By.id("sell-button");
	public By saldoInicialCliente = By.xpath("//span[text()='R$ 10000.00']");
	public By saldoInicialClienteVirgula = By.xpath("//span[text()='R$ 10000,00']");
	public By saldoInicialCliente10 = By.xpath("//span[text()='R$ 10003.00']");
	public By saldoInicialCliente2 = By.xpath("//span[text()='R$ 9999.40']");
	public By ativoLivroOfertas = By.xpath("//td[text()='PETR3']");
	public By precoLivroOfertas = By.xpath("//td[text()='30,00']");
	public By qtdLivroOfertas = By.xpath("//td[text()='150']");

	// Carteira do cliente
	public By carteiraPetr3 = By.xpath("(//td[text()='PETR3'])[2]");
	public By valorPetro3 = By.xpath("(//td[text()='30,00'])[3]");
	public By carteiraQuantidade = By.xpath("(//td[text()='10'])");
	public By saldoCliente = By.xpath("//span[text()='R$ 9700,00']");
	public By saldoCliente10 = By.xpath("//span[text()='R$ 9670,00']");
	public By saldoCliente2 = By.xpath("//span[text()='R$ 9706,00']");
	public By carteiraPetr3F = By.xpath("//td[text()='PETR3F']");
	public By totalCarteiraVenda = By.xpath("//p[text()='Total: R$ 0,00']");
	public By totalCarteiraVenda00 = By.xpath("//p[text()='Total: R$ 00,00']");
	public By totalCarteiraVenda30 = By.xpath("//p[text()='Total: R$ 30,00']");
	public By carteiraQuantidade1 = By.xpath("(//td[text()='1'])");
	public By saldoCliente10F = By.xpath("//span[text()='R$ 9967,00']");
	public By saldoCliente2F = By.xpath("//span[text()='R$ 9970,60']");
	public By saldoClienteF = By.xpath("//span[text()='R$ 9970,00']");
	

}
