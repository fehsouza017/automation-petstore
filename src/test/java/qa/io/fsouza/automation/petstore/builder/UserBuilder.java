package qa.io.fsouza.automation.petstore.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.cucumber.messages.internal.com.google.gson.Gson;
import qa.io.fsouza.automation.petstore.entitys.UserB;

@Component
public class UserBuilder {
@Autowired
UserB user;
private String jsonProviderBody;

public String createUsers(String username,String firstName,String lastName,String email,String password, String phone) {

	user.setUsername(username);
	user.setFirstName(firstName);
	user.setLastName(lastName);
	user.setEmail(email);
	user.setPassword(password);
	user.setPhone(phone);
	return jsonParse(user);
}

// Metodo parse Object for Json
public String jsonParse(Object object) {
	Gson gson = new Gson();
	this.jsonProviderBody = gson.toJson(object);
	return jsonProviderBody;
}

}
