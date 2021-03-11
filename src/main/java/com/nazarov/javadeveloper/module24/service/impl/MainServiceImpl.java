package com.nazarov.javadeveloper.module24.service.impl;

import com.nazarov.javadeveloper.module24.dto.UserData;
import com.nazarov.javadeveloper.module24.entity.Event;
import com.nazarov.javadeveloper.module24.entity.File;
import com.nazarov.javadeveloper.module24.entity.FileStatus;
import com.nazarov.javadeveloper.module24.entity.User;
import com.nazarov.javadeveloper.module24.service.*;
import software.amazon.awssdk.services.s3.model.S3Object;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class MainServiceImpl implements MainService {
    private final UserService userService;
    private final FileService fileService;
    private final EventService eventService;
    private final S3Service s3Service;

    public MainServiceImpl() {
        this.userService = new UserServiceImpl();
        this.fileService = new FileServiceImpl();
        this.eventService = new EventServiceImpl();
        this.s3Service = new S3ServiceImpl();
    }

    @Override
    public File upload(UserData userData) {
        S3Object result = s3Service.upload(userData.getPath(), userData.getBucket());
        if(result == null){
            return null;
        }
        String[] fNameType = result.key().split("\\.");
        User user = new User(userData.getFirstName(), userData.getLastName());

        File file = new File();
        file.setName(fNameType[0]);
        file.setType(fNameType[1]);
        file.setSize((float) result.size());
        file.setStatus(FileStatus.ACTIVE);
        file.setLastModified(new Date(result.lastModified().toEpochMilli()));

        user.addFile(file);
        userService.save(user);

        Event event = new Event();
        event.setUser(user);
        event.setFile(file);
        eventService.save(event);

        return file;
    }

    @Override
    public List<String> getFileLists() {
        return null;
    }
}