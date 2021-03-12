package com.nazarov.javadeveloper.module24.service;

import com.nazarov.javadeveloper.module24.entity.File;

import java.util.List;

public interface FileService extends GenericService<File, Long> {
    List<File> getAll(Long userId);
}
