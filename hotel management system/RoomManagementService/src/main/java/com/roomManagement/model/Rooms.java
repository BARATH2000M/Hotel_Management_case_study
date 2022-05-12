package com.roomManagement.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Roomdetail")
public class Rooms {
	
	@Id
	private String room_id;
	private String room_no;
	private String room_status;
	private String room_type;
	private String room_rate;
	
	
	
	
	
	public Rooms() {
		super();
	}
	public Rooms(String room_id, String room_no, String room_status, String room_type, String room_rate) {
		super();
		this.room_id = room_id;
		this.room_no = room_no;
		this.room_status = room_status;
		this.room_type = room_type;
		this.room_rate = room_rate;
	}
	public String getRoom_id() {
		return room_id;
	}
	public void setRoom_id(String room_id) {
		this.room_id = room_id;
	}
	public String getRoom_no() {
		return room_no;
	}
	public void setRoom_no(String room_no) {
		this.room_no = room_no;
	}
	public String getRoom_status() {
		return room_status;
	}
	public void setRoom_status(String room_status) {
		this.room_status = room_status;
	}
	public String getRoom_type() {
		return room_type;
	}
	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}
	public String getRoom_rate() {
		return room_rate;
	}
	public void setRoom_rate(String room_rate) {
		this.room_rate = room_rate;
	}
	
	
	
	

}
