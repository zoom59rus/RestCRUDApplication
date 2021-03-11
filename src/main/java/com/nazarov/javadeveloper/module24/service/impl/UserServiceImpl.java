package com.nazarov.javadeveloper.module24.service.impl;

import com.nazarov.javadeveloper.module24.entity.User;
import com.nazarov.javadeveloper.module24.repository.UserRepository;
import com.nazarov.javadeveloper.module24.repository.impl.UserRepositoryImpl;
import com.nazarov.javadeveloper.module24.service.UserService;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl() {
        this.userRepository = new UserRepositoryImpl();
    }

    @Override
    public User save(User user) {
        if(user.getId() == null){
            return userRepository.save(user);
        } else {
            return userRepository.update(user);
        }
    }

    @Override
    public User update(User user) {
        return userRepository.update(user);
    }

    @Override
    public User get(Long id) {
        return userRepository.get(id);
    }

    @Override
    public void remove(User user) {
        userRepository.remove(user);
    }
}
