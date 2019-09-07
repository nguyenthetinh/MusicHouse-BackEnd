package com.codegym.musichouse.service.Impl;

import com.codegym.musichouse.model.Category;
import com.codegym.musichouse.repository.CategoryRepository;
import com.codegym.musichouse.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
}
