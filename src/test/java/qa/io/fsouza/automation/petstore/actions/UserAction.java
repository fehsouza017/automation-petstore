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
	private final String path="user";

	@Autowired
	private EnvConfig envConfig;

	public ValidatableResponse createUser(String body) throws IOException {
		envConfig.init();
		
		request = RestAssured.given().contentType(envConfig.getContentType()).and()
				.accept(envConfig.getAccept()).and().body(body).baseUri(envConfig.getBaseUrl())
				.when().post(path).then().statusCode(200);
		
		return request;
		
	}

}
