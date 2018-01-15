package com.josh.repository;

import com.josh.domain.event.Event;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventRepository extends MongoRepository<Event, String> {
    Event findEventByEventid(String eventid);
}
