package com.guisilva.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guisilva.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
