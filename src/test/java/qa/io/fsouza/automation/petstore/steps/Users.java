package qa.io.fsouza.automation.petstore.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class Users {

	@Dado("que eu queira criar um usuario {string}")
	public void queEuQueiraCriarUmUsuario(String username) {
	}

	@Quando("eu preencher os dados necessarios {string}, {string}, {string}, {string}, {string}")
	public void euPreencherOsDadosNecessarios(String firstName, String lastName, String email, String password,
			String phone) {
	}

	@Quando("clicar em send")
	public void clicarEmSend() {
	}

	@Então("tenho meu usuario criado com sucesso")
	public void tenhoMeuUsuarioCriadoComSucesso() {
	}

}
