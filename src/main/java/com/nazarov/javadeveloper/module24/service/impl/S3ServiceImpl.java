package com.nazarov.javadeveloper.module24.service.impl;

import com.nazarov.javadeveloper.module24.repository.S3Repository;
import com.nazarov.javadeveloper.module24.repository.impl.S3RepositoryImpl;
import com.nazarov.javadeveloper.module24.service.S3Service;
import software.amazon.awssdk.services.s3.model.S3Object;

import java.util.List;

public class S3ServiceImpl implements S3Service {
    private final S3Repository s3Repository;

    public S3ServiceImpl(S3RepositoryImpl s3Repository) {
        this.s3Repository = s3Repository;
    }

    @Override
    public S3Object upload(String path) {
        return s3Repository.upload(path);
    }

    @Override
    public List<S3Object> getFileList() {
        return s3Repository.getFileList();
    }

    @Override
    public S3Object get(String fileName) {
        return s3Repository.get(fileName);
    }

    @Override
    public void remove(String fileName) {
        s3Repository.remove(fileName);
    }

    @Override
    public void download(String fileName, String destination) {
        s3Repository.writeObjectToPath(fileName, destination);
    }
}
