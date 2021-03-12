package com.nazarov.javadeveloper.module24.repository.impl;

import com.nazarov.javadeveloper.module24.entity.File;
import com.nazarov.javadeveloper.module24.repository.FileRepository;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class FileRepositoryImpl extends GenericRepositoryImpl<File, Long> implements FileRepository {

    public FileRepositoryImpl() {
        super(File.class);
    }

    @Override
    public List<File> getAll(Long id) {
        try(Session session = super.getSession()){
            Query query = session.createQuery("FROM File WHERE user=" + id);
            return query.list();
        }
    }
}
