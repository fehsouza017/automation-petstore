package qa.io.fsouza.automation.petstore.dto;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserList {
	
	private List<UserB> users;

	public List<UserB> getUsers() {
		return users;
	}

	public void setUsers(List<UserB> users) {
		this.users = users;
	}

}
