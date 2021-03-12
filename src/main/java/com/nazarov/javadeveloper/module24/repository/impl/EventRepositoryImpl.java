package com.nazarov.javadeveloper.module24.repository.impl;

import com.nazarov.javadeveloper.module24.entity.Event;
import com.nazarov.javadeveloper.module24.repository.EventRepository;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class EventRepositoryImpl extends GenericRepositoryImpl<Event, Long> implements EventRepository {

    public EventRepositoryImpl() {
        super(Event.class);
    }

    @Override
    public List<Event> getAll(Long userId) {
        try(Session session = super.getSession()){
            Query query = session.createQuery("FROM Event WHERE user=" + userId);
            return query.list();
        }
    }
}