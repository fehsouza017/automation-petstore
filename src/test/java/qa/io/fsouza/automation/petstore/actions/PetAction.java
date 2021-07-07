package qa.io.fsouza.automation.petstore.actions;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import qa.io.fsouza.automation.petstore.config.EnvConfig;

@Component
public class PetAction {
	
	private ValidatableResponse request;
	private final String path="pet/";
	
	@Autowired
	private EnvConfig envConfig;
	
	public ValidatableResponse addPet(String body) throws IOException {
	envConfig.init();
	
	request = RestAssured.given().contentType(envConfig.getContentType()).accept(envConfig.getAccept())
			.and().body(body).baseUri(envConfig.getBaseUrl()).when().post(path).then().statusCode(200);
	
	return request;
	}
	
	public ValidatableResponse updatePet(String body) throws IOException {
		envConfig.init();
		
		request = RestAssured.given().contentType("application/x-www-form-urlencoded").accept(envConfig.getAccept())
				.and().body(body).baseUri(envConfig.getBaseUrl()).when().post(path + "11").then().statusCode(200);
		
		return request;
	}
	
	public ValidatableResponse uploadImagePet(String body) throws IOException {
		envConfig.init();
		
		request = RestAssured.given().config(RestAssured.config().encoderConfig(EncoderConfig.encoderConfig()
				.encodeContentTypeAs("multipart/form-data", ContentType.TEXT))).contentType("multipart/form-data; boundary=--MyBoundary").accept(envConfig.getAccept()).and()
				.multiPart("file",new File( body)).baseUri(envConfig.getBaseUrl()).when().post(path + "11/uploadImage").then().statusCode(200);
		
		return request;
	}
	
	public ValidatableResponse findIdPet() throws IOException {
		envConfig.init();
		
		request = RestAssured.given().accept(envConfig.getAccept()).and().baseUri(envConfig.getBaseUrl())
				.when().get(path + "11").then().statusCode(200);
		
		return request;
	}

	public ValidatableResponse findStatusPet(String status) throws IOException {
		envConfig.init();
		
		request = RestAssured.given().accept(envConfig.getAccept()).queryParam("status", status).and()
				.baseUri(envConfig.getBaseUrl()).when().get(path + "findByStatus").then().statusCode(200);
		
		return request;
	}
	
	public ValidatableResponse deletePet(int id) throws IOException {
		envConfig.init();
		
		request = RestAssured.given().accept(envConfig.getAccept()).header("api_key", envConfig.getApi_key()).and().baseUri(envConfig.getBaseUrl())
				.when().delete(path + id).then().statusCode(200);
		
		return request;
	}
	
	public ValidatableResponse updateExistPet(String body) throws IOException {
		envConfig.init();
		
		request = RestAssured.given().contentType(envConfig.getContentType()).accept(envConfig.getAccept())
				.and().body(body).baseUri(envConfig.getBaseUrl()).when().put(path).then().statusCode(200);
				
		return request;
	}
}
