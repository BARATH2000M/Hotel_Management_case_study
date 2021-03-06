package com.guestManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.guestManagement.model.Guest;
import com.guestManagement.repo.GuestRepo;

@RestController
public class GuestController {
	
	@Autowired
	private GuestRepo reposit;
	
	@PostMapping("/add")
	public void store(@RequestBody Guest b){
		reposit.insert(b);
		
	}
	@GetMapping("/all")
	public List<Guest> getGuest(){
		
		return reposit.findAll();
		
	}
	
	@PutMapping("/update")
	public void updateguest(@RequestBody Guest c) {
		reposit.save(c);
	}
	
	@DeleteMapping("/delete/{id}")
	public void del(@PathVariable String id) {
		reposit.deleteById(id);
	}

}