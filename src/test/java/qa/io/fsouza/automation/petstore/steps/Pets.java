package qa.io.fsouza.automation.petstore.steps;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import io.restassured.response.ValidatableResponse;
import qa.io.fsouza.automation.petstore.actions.PetAction;
import qa.io.fsouza.automation.petstore.builder.PetBuilder;

public class Pets {
	
@Autowired
PetBuilder petBuilder;

@Autowired
PetAction petAction;
	
	private String body;
	private ValidatableResponse act;
	private int petId;
	private int idPet;

	// Adicionar pet
	@Dado("que eu adicionar um novo pet")
	public void queEuAdicionarUmNovoPet() {
		System.out.println("Adicionando novo pet");
	}

	@Quando("eu inserir todas as informaçoes do pet {string}, {string}, {string}, {string}, {string}")
	public void euInserirTodasAsInformaçoesDoPet(String category, String name, String photoUrl, String tags,
			String status) {
		System.out.println("Inserindo todas as informações");
		body = petBuilder.adcPet(name,category,tags, photoUrl,status);
		System.out.println(body);
	}

	@Quando("mandarr um send")
	public void mandarrUmSend() throws IOException {
		System.out.println("Dando um send");
		act = petAction.addPet(body);
	}

	@Então("o novo pet é adicionado com sucesso")
	public void oNovoPetÉAdicionadoComSucesso() {
		System.out.println("Novo pet inserido com sucesso");
	}

	// Atualizar pet por id
	@Dado("que eu queira atualizar os dados do pet na loja")
	public void queEuQueiraAtualizarOsDadosDoPetNaLoja() {
		System.out.println("Atualizando os dados do pet na loja");
	}

	@Quando("eu inserir o id do pet {int}")
	public void euInserirOIdDoPet(Integer idPet) {
		System.out.println("Inserindo o id do pet");
		this.idPet = idPet;
		
	}

	@Quando("os dados que desejo alterar {string}, {string}")
	public void osDadosQueDesejoAlterar(String name, String status) {
		System.out.println("Inserindo dados que desejo alterar");
		body = petBuilder.updatePett(name, status);
	}

	@Quando("enviar a request")
	public void enviarARequest() throws IOException {
		System.out.println("Enviando a request");
		petAction.updatePet(body);
	}

	@Então("tenho os dados do pet atualizado com sucesso")
	public void tenhoOsDadosDoPetAtualizadoComSucesso() {
		System.out.println("Dados do pet atuaizado com sucesso");
	}

	// Adicionar imagem
	@Dado("que eu queira adicionar uma imagem")
	public void queEuQueiraAdicionarUmaImagem() {
		System.out.println("Adicionando uma imagem");
	}

	@Quando("eu inserir a url da imagem  {int}, {string}")
	public void euInserirAUrlDaImagem(Integer id, String url) {
		System.out.println("Inserindo url da imagem");
		body = petBuilder.imageUpload(url);
	}

	@Quando("clicar no send")
	public void clicarNoSend() throws IOException {
		System.out.println("Clicando no send");
		petAction.uploadImagePet(body);
	}

	@Então("tenho minha imagem adicionada com sucesso")
	public void tenhoMinhaImagemAdicionadaComSucesso() {
		System.out.println("Imagem adicionada com sucesso");
	}

	// Buscar pet por id
	@Dado("que eu queira buscar um pet pelo id")
	public void queEuQueiraBuscarUmPetPeloId() {
		System.out.println("Buscando pet pelo id");
	}

	@Quando("eu passar o id do pet {int}")
	public void euPassarOIdDoPet(Integer petId) throws IOException {
		System.out.println("Inserindo o id do pet");
		this.petId = petId;
		petAction.findIdPet();
	}

	@Então("tenho meu pet encontrado com sucesso")
	public void tenhoMeuPetEncontradoComSucesso() {
		System.out.println("Pet encontrado com sucesso");
	}

	// Buscar pet por status
	@Dado("que eu queira buscar um pet pelo status")
	public void queEuQueiraBuscarUmPetPeloStatus() {
		System.out.println("Buscando um pet pelo status");
	}

	@Quando("eu inserir o status do pet {string}")
	public void euInserirOStatusDoPet(String status) throws IOException {
		System.out.println("Inserindo o status do pet");
		act = petAction.findStatusPet(status);
	}
	
	@Quando("dar um clique no send")
	public void darUmCliqueNoSend() {
	}

	@Então("minha busca por pet via status é concluida com sucesso")
	public void minhaBuscaPorPetViaStatusÉConcluidaComSucesso() {
		System.out.println("Busca por pet via status concluida com sucesso");
	}

	// Deletar um pet
	@Dado("que eu queira deletar um pet")
	public void queEuQueiraDeletarUmPet() {
		System.out.println("Deletando um pet");
	}

	@Quando("eu passar o id do pett {int}")
	public void euPassarOIdDoPett(Integer id) throws IOException {
		System.out.println("Inserindo o id do pet");
		petAction.deletePet(id);
	}
	
	@Quando("enviar com o send")
	public void enviarComOSend() {
		System.out.println("Enviando o send");
	}

	@Então("pet é deletado com sucesso")
	public void petÉDeletadoComSucesso() {
		System.out.println("Pet deletado com sucesso");
	}

	// Adicionar objeto ao pet existente
	@Dado("que eu queira adicionar um objeto ao pet existente na loja")
	public void queEuQueiraAdicionarUmObjetoAoPetExistenteNaLoja() {
		System.out.println("Adicionando um objeto ao pet existente na loja");
	}

	@Quando("eu inserir o objeto do pet {int}, {int} {string}, {string}, {string}, {int} {string}, {string}")
	public void euInserirOObjetoDoPet(Integer id, Integer categoryId, String category, String name, String photoUrl, Integer tagId, String tags, String status) {
		body = petBuilder.updatePetExist(id, categoryId, name, name, name, photoUrl, tagId, status);
		System.out.println("Inserindo o objeto do pet");
	}
	
	@Quando("usar o send")
	public void usarOSend() throws IOException {
	System.out.println("Usando o send");
	petAction.updateExistPet(body);
	}

	@Então("objeto do pet é adicionado com sucesso")
	public void objetoDoPetÉAdicionadoComSucesso() {
		System.out.println("Objeto do pet adicionado com sucesso");
	}

}
