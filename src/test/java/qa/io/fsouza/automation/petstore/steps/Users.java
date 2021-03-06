package qa.io.fsouza.automation.petstore.steps;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import io.restassured.response.ValidatableResponse;
import qa.io.fsouza.automation.petstore.actions.UserAction;
import qa.io.fsouza.automation.petstore.builder.UserBuilder;

public class Users {

	@Autowired
	UserAction userAction;

	@Autowired
	UserBuilder userBuilder;

	private String body;
	private ValidatableResponse arm;
	private String usuario;
	private String senha;
	private String nameUser;

	
	@Dado("que eu queira criar um usuario")
	public void queEuQueiraCriarUmUsuario() {
		System.out.println("Criando um usuario");
	}

	@Quando("eu preencher os dados necessarios {string}, {string}, {string}, {string}, {string}, {string}")
	public void euPreencherOsDadosNecessarios(String username, String firstName, String lastName, String email,
			String password, String phone) {
		System.out.println("Preenchendo dados necessarios");
		body = userBuilder.createUsers(username,firstName,lastName,email,password,phone);
	}

	@Quando("clicar em send")
	public void clicarEmSend() throws IOException {
		System.out.println("Clicando em send");
		arm = userAction.createUser(body);
		
		
	}

	@Então("o meu usuario é criado com sucesso")
	public void oMeuUsuarioÉCriadoComSucesso() {
		System.out.println("Usuario criado com sucesso");
	}

	// Criar lista de usuarios
	@Dado("que eu queira criar uma lista de usuarios")
	public void queEuQueiraCriarUmaListaDeUsuarios() {
		System.out.println("Criando uma lista de usuarios");
	}

	@Quando("eu informar todos os meus dados necessarios {string}, {string}, {string}, {string}, {string}, {string}")
	public void euInformarTodosOsMeusDadosNecessarios(String username, String firstName, String lastName, String email, String password, String phone) {
		System.out.println("Informando os meus dados necessarios");
		body = userBuilder.createListUsers(username, firstName, lastName, email, password, phone);
		System.out.println(body);
	}

	@Quando("enviar em send")
	public void enviarEmSend() throws IOException {
		System.out.println("clicando em send");
		userAction.createListUser(body);
		
	}

	@Então("tenho minha lista de usuarios criada com sucesso")
	public void tenhoMinhaListaDeUsuariosCriadaComSucesso() {
		System.out.println("Lista de usuarios criada com sucesso");
	}

	// Fazer Login
	@Dado("que eu esteja na home")
	public void queEuEstejaNaHome() {
		System.out.println("Estou na home");
	}

	@Dado("queira fazer login")
	public void queiraFazerLogin() {
		System.out.println("Fazendo login");
	}

	@Quando("eu digitar meus dados de acesso {string}, {string}")
	public void euDigitarMeusDadosDeAcesso(String usuario, String senha) throws IOException {
		System.out.println("Digitando meus dados de acesso");
		this.usuario = usuario;
		this.senha = senha;
		arm = userAction.loginUser(usuario, senha);
	}

	@Quando("utilizar o botao send")
	public void utilizarOBotaoSend() {
		System.out.println("Utilizando o botao send");
	}

	@Então("meu acesso a plataforma é permitido com sucesso")
	public void meuAcessoAPlataformaÉPermitidoComSucesso() {
		System.out.println("Acesso a plataforma permitido com sucesso");
	}

	// Buscar usuarios
	@Dado("que eu queira buscar um usuario")
	public void queEuQueiraBuscarUmUsuario() {
		System.out.println("Buscando um usuario");
	}

	@Quando("eu digitar meu usuario {string}")
	public void euDigitarMeuUsuario(String usuario) throws IOException {
		System.out.println("Digitando meu usuario");
		this.usuario = usuario;
		arm = userAction.findUser(usuario);
		
	}

	@Quando("mandar com o botao send")
	public void mandarComOBotaoSend() {
		System.out.println("Mandando com o botao send");
	}

	@Então("tenho meu usuario encontrado com sucesso")
	public void tenhoMeuUsuarioEncontradoComSucesso() {
		System.out.println("Usuario encontrado com sucesso");
	}

	// Atualizar dados
	@Dado("que eu queira atualizar meus dados {string}")
	public void queEuQueiraAtualizarMeusDados(String nameUser) {
		System.out.println("Atualizando meus dados");
		this.nameUser = nameUser;
	}

	@Quando("eu informar os dados que desejo alterar {int}, {string}, {string}, {string}, {string}, {string}, {string}, {int}")
	public void euInformarOsDadosQueDesejoAlterar(Integer id, String username, String firstName, String lastName, String email, String password, String phone, Integer userStatus) {
		System.out.println("Informando meus dados que desejo alterar");
		body = userBuilder.updateDataUsers(id, username, firstName, lastName, email, password, phone, userStatus);
	}

	@Quando("enviar o request")
	public void enviarORequest() throws IOException {
		System.out.println("Enviando o request");
		userAction.updateUser(body, nameUser);
	}

	@Então("tenho meus dados atualizados com sucesso")
	public void tenhoMeusDadosAtualizadosComSucesso() {
		System.out.println("Dados atualizados com sucesso");
	}

	// logout do usuario
	@Dado("que eu queira fazer logout")
	public void queEuQueiraFazerLogout() {
		System.out.println("Fazendo o request");
	}

	@Quando("eu clicar no botao de logout")
	public void euClicarNoBotaoDeLogout() throws IOException {
		System.out.println("Clicando no botao logout");
		userAction.logoutUser();
	}

	@Então("tenho meu logout feito com sucesso")
	public void tenhoMeuLogoutFeitoComSucesso() {
		System.out.println("Logout feito com sucesso");
	}

	// Deletar usuario
	@Dado("que eu queira deletar um usuario")
	public void queEuQueiraDeletarUmUsuario() {
		System.out.println("Deletando um usuario");
	}

	@Quando("eu informar meu usuario {string}")
	public void euInformarMeuUsuario(String usuary) throws IOException {
		System.out.println("Informando o usuario");
		userAction.deleteUser(usuary);
	}

	@Quando("mandar a request")
	public void mandarARequest() {
		System.out.println("Mandando a request");
	}

	@Então("meu usuario é deletado com sucesso")
	public void meuUsuarioÉDeletadoComSucesso() {
		System.out.println("Usuario deletado com sucesso");
	}

}
