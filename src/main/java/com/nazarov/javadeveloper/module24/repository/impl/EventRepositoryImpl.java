package com.nazarov.javadeveloper.module24.repository.impl;

import com.nazarov.javadeveloper.module24.entity.Event;
import com.nazarov.javadeveloper.module24.repository.EventRepository;

public class EventRepositoryImpl extends GenericRepositoryImpl<Event, Long> implements EventRepository {

    public EventRepositoryImpl() {
        super(Event.class);
    }
}