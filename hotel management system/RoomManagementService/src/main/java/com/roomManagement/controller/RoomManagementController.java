package com.roomManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.roomManagement.model.Rooms;
import com.roomManagement.repo.RoomRepo;

@RestController
public class RoomManagementController {
	
	@Autowired
	private RoomRepo room_repo;
	
	@PostMapping("/add")
	public void store(@RequestBody Rooms b) {
		room_repo.insert(b);
	}
	
	@GetMapping("/all")
	public List<Rooms> get_rooms(){
		return room_repo.findAll();
		
	}
	@PutMapping("/update")
	public void updateguest(@RequestBody Rooms b) {
		room_repo.save(b);
	}
	
	@DeleteMapping("/delete/{room_id}")
	public void del(@PathVariable String room_id) {
		room_repo.deleteById(room_id);
	}


}
