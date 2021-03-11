package com.nazarov.javadeveloper.module24.service;

import com.nazarov.javadeveloper.module24.entity.File;

import java.util.List;

public interface MainService {

    File upload(String firstName, String lastName, String bucketName, String path);
    List<String> getFileLists();
}
