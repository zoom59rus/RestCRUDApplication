package com.nazarov.javadeveloper.module24.repository.impl;

import com.nazarov.javadeveloper.module24.entity.File;
import com.nazarov.javadeveloper.module24.repository.FileRepository;

public class FileRepositoryImpl extends GenericRepositoryImpl<File, Long> implements FileRepository {

    public FileRepositoryImpl() {
        super(File.class);
    }
}
