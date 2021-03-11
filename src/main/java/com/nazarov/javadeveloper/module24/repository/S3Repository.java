package com.nazarov.javadeveloper.module24.repository;

import software.amazon.awssdk.services.s3.model.S3Object;

import java.util.List;

public interface S3Repository {

    S3Object upload(String path);
    List<S3Object> getFileList();
    S3Object get(String fileName);
    void remove(String fileName);
    void writeObjectToPath(String fileName, String destination);
    byte[] getObjectBytes(String fileName);
}