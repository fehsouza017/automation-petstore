package qa.io.fsouza.automation.petstore.builder;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import io.cucumber.messages.internal.com.google.gson.Gson;
import qa.io.fsouza.automation.petstore.dto.UserB;
import qa.io.fsouza.automation.petstore.dto.UserList;

@Component
public class UserBuilder {
@Autowired
UserB user;

@Autowired
UserList userList;
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

public String createListUsers(String username,String firstName,String lastName,String email,String password, String phone) {
	List<UserB> userListar= new ArrayList<UserB>();
	
	user.setUsername(username);
	user.setFirstName(firstName);
	user.setLastName(lastName);
	user.setEmail(email);
	user.setPassword(password);
	user.setPhone(phone);
	userListar.add(user);
	userList.setUsers(userListar);
	return jsonParse(userList);
}

public String updateDataUsers(int id, String username,String firstName,String lastName,String email,String password, String phone, int userStatus) {

	user.setId(id);
	user.setUsername(username);
	user.setFirstName(firstName);
	user.setLastName(lastName);
	user.setEmail(email);
	user.setPassword(password);
	user.setPhone(phone);
	user.setUserStatus(userStatus);
	return jsonParse(user);
}

// Metodo parse Object for Json
public String jsonParse(Object object) {
	Gson gson = new Gson();
	this.jsonProviderBody = gson.toJson(object);
	return jsonProviderBody;
}

}
