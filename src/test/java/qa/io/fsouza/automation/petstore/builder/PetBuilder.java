package qa.io.fsouza.automation.petstore.builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.cucumber.messages.internal.com.google.gson.Gson;
import qa.io.fsouza.automation.petstore.dto.Category;
import qa.io.fsouza.automation.petstore.dto.PetD;
import qa.io.fsouza.automation.petstore.dto.Tags;


@Component
public class PetBuilder {
@Autowired
PetD petD;

@Autowired
Category category;

@Autowired
Tags tags;

private String jsonProviderBody;

	public String adcPet(String name, String name1, String name2, String photoUrls, String status) {
		
		category.setName(name1);
		tags.setName(name2);
		List<Tags> tag = new ArrayList <Tags>();
		tag.add(tags);
		petD.setPhotoUrls(Arrays.asList(photoUrls));
		petD.setName(name);
		petD.setStatus(status);
		petD.setCategory(category);
		petD.setTags(tag);
		return jsonParse(petD);
	}
	
	public String updatePetExist(int id, int id1,String name, String name1, String name2, String photoUrls, int id2, String status) {
		
		category.setName(name1);
		category.setId(id1);
		tags.setName(name2);
		tags.setId(id2);
		List<Tags> tag = new ArrayList <Tags>();
		tag.add(tags);
		petD.setId(id);
		petD.setPhotoUrls(Arrays.asList(photoUrls));
		petD.setName(name);
		petD.setStatus(status);
		petD.setCategory(category);
		petD.setTags(tag);
		return jsonParse(petD);
	}
	
	public String updatePett(String name, String status) {
		
		petD.setName(name);
		petD.setStatus(status);
		return jsonParse(petD);
	}
	
	public String imageUpload(String file) {
		
		String image = file;
		
		return image;
	}
	
	
//Metodo parse Object for Json
public String jsonParse(Object object) {
	Gson gson = new Gson();
	this.jsonProviderBody = gson.toJson(object);
	return jsonProviderBody;
}

}
