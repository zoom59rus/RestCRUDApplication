package com.nazarov.javadeveloper.module24.service;

import software.amazon.awssdk.services.s3.model.S3Object;

import java.util.List;

public interface S3Service {

    S3Object upload(String path);
    List<S3Object> getFileList();
    S3Object get(String fileName);
    void remove(String fileName);
    void download(String fileName, String destination);
}