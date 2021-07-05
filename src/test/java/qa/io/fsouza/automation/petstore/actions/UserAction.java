package qa.io.fsouza.automation.petstore.actions;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import qa.io.fsouza.automation.petstore.config.EnvConfig;

@Component
public class UserAction {

	private ValidatableResponse request;
	private final String path="user/";

	@Autowired
	private EnvConfig envConfig;

	public ValidatableResponse createUser(String body) throws IOException {
		envConfig.init();
		
		request = RestAssured.given().contentType(envConfig.getContentType()).and()
				.accept(envConfig.getAccept()).and().body(body).baseUri(envConfig.getBaseUrl())
				.when().post(path).then().statusCode(200);
		
		return request;
		
	}
	
	public ValidatableResponse createListUser(String body) throws IOException {
		envConfig.init();
		
		 request = RestAssured.given().contentType(envConfig.getContentType()).and()
				.accept(envConfig.getAccept()).and().body(body).baseUri(envConfig.getBaseUrl())
				.when().post(path + "createWithList").then().statusCode(200);
		 
		 return request;
		
	}
	
	public ValidatableResponse loginUser(String username, String password) throws IOException {
		envConfig.init();
		
		request = RestAssured.given().accept(envConfig.getAccept()).and().queryParam("username", envConfig.getUsername())
				.queryParam("password", envConfig.getPassword()).baseUri(envConfig.getBaseUrl()).when().get(path + "/login")
				.then().statusCode(200);
		
		return request;
				}
	
	public ValidatableResponse findUser(String usuario) throws IOException {
		envConfig.init();
		
		request = RestAssured.given().accept(envConfig.getAccept()).and().baseUri(envConfig.getBaseUrl())
				.when().get(path + usuario).then().statusCode(200);
		
		return request;
	}
	
	public ValidatableResponse updateUser(String body, String nameUser) throws IOException {
		envConfig.init();
		
		request = RestAssured.given().contentType(envConfig.getContentType()).accept(envConfig.getAccept())
				.and().body(body).baseUri(envConfig.getBaseUrl()).when().put(path + nameUser).then().statusCode(200);
		
		return request;
	}
	
	public ValidatableResponse logoutUser() throws IOException {
		envConfig.init();
		
		request = RestAssured.given().accept(envConfig.getAccept()).and().baseUri(envConfig.getBaseUrl())
				.when().get(path + "logout").then().statusCode(200);
		
		return request;
	}
	
	public ValidatableResponse deleteUser(String usuary) throws IOException {
		envConfig.init();
		
		request = RestAssured.given().accept(envConfig.getAccept()).and().baseUri(envConfig.getBaseUrl())
				.when().delete(path + usuary).then().statusCode(200);
		
		return request;
	}

}
