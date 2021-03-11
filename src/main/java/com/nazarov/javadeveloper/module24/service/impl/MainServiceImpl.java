package com.nazarov.javadeveloper.module24.service.impl;

import com.nazarov.javadeveloper.module24.entity.File;
import com.nazarov.javadeveloper.module24.service.EventService;
import com.nazarov.javadeveloper.module24.service.FileService;
import com.nazarov.javadeveloper.module24.service.MainService;
import com.nazarov.javadeveloper.module24.service.UserService;

import java.util.List;

public class MainServiceImpl implements MainService {
    private final UserService userService;
    private final FileService fileService;
    private final EventService eventService;

    public MainServiceImpl() {
        this.userService = new UserServiceImpl();
        this.fileService = new FileServiceImpl();
        this.eventService = new EventServiceImpl();
    }

    @Override
    public File upload(String firstName, String lastName, String bucketName, String path) {

        return null;
    }

    @Override
    public List<String> getFileLists() {
        return null;
    }
}