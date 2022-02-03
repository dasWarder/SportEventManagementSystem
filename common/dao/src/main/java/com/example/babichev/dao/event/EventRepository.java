package com.example.babichev.dao.event;

import com.example.babichev.model.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.time.LocalDateTime;

public interface EventRepository extends PagingAndSortingRepository<Event, Long> {

    Page<Event> getEventsByDateAfter(LocalDateTime date);

    Page<Event> getEventByOrganization_Name(String organizationName);
}
