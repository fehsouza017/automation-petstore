package qa.io.fsouza.automation.petstore.config;

import java.io.IOException;

import org.springframework.stereotype.Component;

import qa.io.fsouza.automation.petstore.enums.EnvEnum;

@Component
public class EnvConfig {

	private static final EnvEnum environment = EnvEnum.HML;

	private String accept;
	private String contentType;
	private String username;
	private String password;
	private String baseUrl;
	private String api_key;

	public void init() throws IOException {

		switch (environment) {
		case DEV:

			this.accept = "application/json";
			this.contentType = "application/json";
			this.username = "";
			this.password = "";
			this.baseUrl = "https://petstore.swagger.io/v2";
			this.api_key= "JUOGHJ";

			break;

		case HML:

			this.accept = "application/json";
			this.contentType = "application/json";
			this.username = "";
			this.password = "";
			this.baseUrl = "https://petstore.swagger.io/v2";
			this.api_key= "JUOGHJ";

			break;

		case PROD:

			this.accept = "application/json";
			this.contentType = "application/json";
			this.username = "";
			this.password = "";
			this.baseUrl = "https://petstore.swagger.io/v2";
			this.api_key= "JUOGHJ";

			break;
		}

	}

	public String getAccept() {
		return accept;
	}

	public String getContentType() {
		return contentType;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getBaseUrl() {
		return baseUrl;
	}
	
	public String getApi_key() {
		return api_key;
	}

}
