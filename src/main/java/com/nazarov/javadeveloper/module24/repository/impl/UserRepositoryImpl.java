package com.nazarov.javadeveloper.module24.repository.impl;

import com.nazarov.javadeveloper.module24.entity.User;
import com.nazarov.javadeveloper.module24.repository.UserRepository;

public class UserRepositoryImpl extends GenericRepositoryImpl<User, Long> implements UserRepository {
    public UserRepositoryImpl() {
        super(User.class);
    }
}
