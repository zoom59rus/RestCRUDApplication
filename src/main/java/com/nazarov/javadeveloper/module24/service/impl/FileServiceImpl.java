package com.nazarov.javadeveloper.module24.service.impl;

import com.nazarov.javadeveloper.module24.entity.File;
import com.nazarov.javadeveloper.module24.repository.FileRepository;
import com.nazarov.javadeveloper.module24.repository.impl.FileRepositoryImpl;
import com.nazarov.javadeveloper.module24.service.FileService;

import java.util.List;

public class FileServiceImpl implements FileService {
    private final FileRepository fileRepository;

    public FileServiceImpl() {
        this.fileRepository = new FileRepositoryImpl();
    }

    @Override
    public File save(File file) {
        if(file.getId() == null){
            return fileRepository.save(file);
        }else {
            return fileRepository.update(file);
        }
    }

    @Override
    public File update(File file) {
        return fileRepository.update(file);
    }

    @Override
    public File get(Long id) {
        return fileRepository.get(id);
    }

    @Override
    public void remove(File file) {
        fileRepository.remove(file);
    }

    @Override
    public List<File> getAll(Long userId) {
        return fileRepository.getAll(userId);
    }
}
