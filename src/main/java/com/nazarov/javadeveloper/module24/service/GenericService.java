package com.nazarov.javadeveloper.module24.service;

public interface GenericService<T, ID> {

    T save(T t);
    T update(T t);
    T get(ID id);
    void remove(T t);
}
