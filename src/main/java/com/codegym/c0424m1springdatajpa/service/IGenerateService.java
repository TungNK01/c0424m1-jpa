package com.codegym.c0424m1springdatajpa.service;

import java.util.List;

public interface IGenerateService<T> {
    List<T> findAll();

    T findById(Long id);

    void save(T t);

    void remove(Long id);
}
