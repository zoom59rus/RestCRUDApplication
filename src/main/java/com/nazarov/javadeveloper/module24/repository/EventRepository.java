package com.nazarov.javadeveloper.module24.repository;

import com.nazarov.javadeveloper.module24.entity.Event;

import java.util.List;

public interface EventRepository extends GenericRepository<Event, Long> {

    List<Event> getAll(Long userId);
}
