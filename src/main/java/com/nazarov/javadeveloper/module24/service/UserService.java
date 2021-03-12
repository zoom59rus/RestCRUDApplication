package com.nazarov.javadeveloper.module24.service;

import com.nazarov.javadeveloper.module24.entity.User;

public interface UserService extends GenericService<User, Long> {

    User load(Long id);
}
