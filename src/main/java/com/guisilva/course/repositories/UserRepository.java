package com.guisilva.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guisilva.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
