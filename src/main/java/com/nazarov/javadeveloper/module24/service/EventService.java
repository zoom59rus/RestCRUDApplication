package com.nazarov.javadeveloper.module24.service;

import com.nazarov.javadeveloper.module24.entity.Event;

import java.util.List;

public interface EventService extends GenericService<Event, Long>{
    List<Event> getAll(Long userId);
}
