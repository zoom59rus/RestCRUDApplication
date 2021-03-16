package com.nazarov.javadeveloper.module24.service.impl;

import com.nazarov.javadeveloper.module24.repository.S3Repository;
import com.nazarov.javadeveloper.module24.repository.impl.S3RepositoryImpl;
import com.nazarov.javadeveloper.module24.service.S3Service;
import software.amazon.awssdk.services.s3.model.S3Object;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class S3ServiceImpl implements S3Service {
    private final S3Repository s3Repository;

    public S3ServiceImpl() {
        this.s3Repository = new S3RepositoryImpl();
    }

    @Override
    public S3Object upload(String path, String bucket) {
        if(Files.exists(Paths.get(path))){
            return s3Repository.upload(path, bucket);
        }

        return null;
    }

    @Override
    public List<S3Object> getFileList(String bucket) {
        return s3Repository.getFileList(bucket);
    }

    @Override
    public S3Object get(String fileName, String bucket) {
        return s3Repository.get(fileName, bucket);
    }

    @Override
    public void remove(String fileName, String bucket) {
        s3Repository.remove(fileName, bucket);
    }

    @Override
    public void download(String bucket, String fileName, String destination) {
        s3Repository.writeObjectToPath(bucket, fileName, destination);
    }
}
