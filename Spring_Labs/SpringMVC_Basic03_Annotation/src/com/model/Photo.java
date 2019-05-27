package com.model;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class Photo {
	
	private String name; //올린사람이름
	private int age; //올린사람 나이 ?!
	private String image; //파일명
	
	///////////// FILE UPLOAD POINT //////////////
	private CommonsMultipartFile file;
	
	public CommonsMultipartFile getFile() {
		return file;
	}
	
	public void setFile(CommonsMultipartFile file) {
		this.file = file;
	}
	//////////////////////////////////////////////
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
}
