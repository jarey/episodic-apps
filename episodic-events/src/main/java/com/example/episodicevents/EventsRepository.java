package com.example.episodicevents;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EventsRepository extends MongoRepository<Event, String> {

  public List<Event> findAll();

  public List<Event> findFirst20ByOrderByCreatedAtDesc();
}
