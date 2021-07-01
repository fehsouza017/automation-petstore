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

public String createUsers(int sufix) {

	user.setId(sufix);
	user.setUsername("");
	user.setFirstName("");
	user.setLastName("");
	user.setEmail("");
	user.setPassword("");
	user.setPhone("");
	user.setUserStatus(sufix);
	return jsonParse(user);
}

// Metodo parse Object for Json
public String jsonParse(Object object) {
	Gson gson = new Gson();
	this.jsonProviderBody = gson.toJson(object);
	return jsonProviderBody;
}

}
