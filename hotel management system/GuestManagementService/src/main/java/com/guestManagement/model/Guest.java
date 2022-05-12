package com.guestManagement.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Guestdetail")
public class Guest {
	
	@Id
	private String id;
	private String guestname;
	private String contact;
	private String no_of_adult;
	private String no_of_child;
	private String no_of_nights;
	
	
	
	
	
	
	
	public Guest() {
		super();
	}
	
	public Guest(String id, String guestname, String contact, String no_of_adult, String no_of_child, String no_of_nights) {
		super();
		this.id=id;
		this.guestname = guestname;
		this.contact = contact;
		this.no_of_adult = no_of_adult;
		this.no_of_child = no_of_child;
		this.no_of_nights = no_of_nights;
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return guestname;
	}
	public void setName(String guestname) {
		this.guestname = guestname;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getNo_of_adult() {
		return no_of_adult;
	}
	public void setNo_of_adult(String no_of_adult) {
		this.no_of_adult = no_of_adult;
	}
	public String getNo_of_child() {
		return no_of_child;
	}
	public void setNo_of_child(String no_of_child) {
		this.no_of_child = no_of_child;
	}
	public String getNo_of_nights() {
		return no_of_nights;
	}
	public void setNo_of_nights(String no_of_nights) {
		this.no_of_nights = no_of_nights;
	}
	
	
	
	

}