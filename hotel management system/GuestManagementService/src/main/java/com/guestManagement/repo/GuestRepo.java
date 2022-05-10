package com.guestManagement.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.guestManagement.model.Guest;

public interface GuestRepo extends MongoRepository<Guest,String> {

	
}
