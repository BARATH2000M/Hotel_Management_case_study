package com.roomManagement.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.roomManagement.model.Rooms;

public interface RoomRepo extends MongoRepository<Rooms, String> {

}
