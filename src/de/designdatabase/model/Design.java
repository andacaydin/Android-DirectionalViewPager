package de.designdatabase.model;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
public class Design implements Serializable{
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull
	private String title;
	
	@NotNull
	private String description;
	
	@NotNull
	private String designerName;
	
	@ElementCollection(fetch=FetchType.EAGER)
	private ArrayList<String> pictures;
	
	@ElementCollection(fetch=FetchType.EAGER)
	private ArrayList<String> tags;
	
	@ElementCollection(fetch=FetchType.EAGER)
	private ArrayList<String> categories;
	
	@ElementCollection(fetch=FetchType.EAGER)
	private ArrayList<String> comments;
	
	@ElementCollection(fetch=FetchType.EAGER)
	private ArrayList<String> licensingModels;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDesignerName() {
		return designerName;
	}

	public void setDesignerName(String designerName) {
		this.designerName = designerName;
	}

	public ArrayList<String> getPictures() {
		return pictures;
	}

	public void setPictures(ArrayList<String> pictures) {
		this.pictures = pictures;
	}

	public ArrayList<String> getTags() {
		return tags;
	}

	public void setTags(ArrayList<String> tags) {
		this.tags = tags;
	}

	public ArrayList<String> getCategories() {
		return categories;
	}

	public void setCategories(ArrayList<String> categories) {
		this.categories = categories;
	}

	public ArrayList<String> getComments() {
		return comments;
	}

	public void setComments(ArrayList<String> comments) {
		this.comments = comments;
	}

	public ArrayList<String> getLicensingModels() {
		return licensingModels;
	}

	public void setLicensingModels(ArrayList<String> licensingModels) {
		this.licensingModels = licensingModels;
	}

	public Design(){
		
	}
	
	
 
}
