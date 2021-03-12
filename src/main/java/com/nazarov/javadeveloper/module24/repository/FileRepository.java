package com.nazarov.javadeveloper.module24.repository;

import com.nazarov.javadeveloper.module24.entity.File;

import java.util.List;

public interface FileRepository extends GenericRepository<File, Long> {
    List<File> getAll(Long id);
}
