package com.coachslb.course.services;


import com.coachslb.course.entities.Category;
import com.coachslb.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> optionalCategory = categoryRepository.findById(id);

        return optionalCategory.orElse(null);
    }
}
