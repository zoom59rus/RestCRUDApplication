package com.nazarov.javadeveloper.module24.service.impl;

import com.nazarov.javadeveloper.module24.entity.Event;
import com.nazarov.javadeveloper.module24.repository.EventRepository;
import com.nazarov.javadeveloper.module24.repository.impl.EventRepositoryImpl;
import com.nazarov.javadeveloper.module24.service.EventService;

import java.util.List;

public class EventServiceImpl implements EventService {
    private final EventRepository eventRepository;

    public EventServiceImpl() {
        this.eventRepository = new EventRepositoryImpl();
    }

    @Override
    public Event save(Event event) {
        if(event.getId() == null){
            return eventRepository.save(event);
        }else {
            return eventRepository.update(event);
        }
    }

    @Override
    public Event update(Event event) {
        return eventRepository.update(event);
    }

    @Override
    public Event get(Long id) {
        return eventRepository.get(id);
    }

    @Override
    public void remove(Event event) {
        eventRepository.remove(event);
    }

    @Override
    public List<Event> getAll(Long userId) {
        return eventRepository.getAll(userId);
    }
}
