package com.nazarov.javadeveloper.module24.service;

import com.nazarov.javadeveloper.module24.dto.UserData;
import com.nazarov.javadeveloper.module24.entity.File;

import java.util.List;

public interface MainService {

    File upload(UserData userData);
    List<String> getFileLists();
}
