package com.nazarov.javadeveloper.module24.service;

import com.nazarov.javadeveloper.module24.dto.UserData;
import com.nazarov.javadeveloper.module24.entity.Event;
import com.nazarov.javadeveloper.module24.entity.File;
import com.nazarov.javadeveloper.module24.entity.User;
import javassist.NotFoundException;

import java.util.List;

public interface MainService {

    File upload(UserData userData);
    User getFullUserInformation(Long id);
    List<File> getFileLists(Long userId);
    void removeFile(Long userId, String fileName) throws NotFoundException;
    void downloadFile(String fileName, String path);
    List<Event> getEventList(Long userId, Long fileId);
}
