package com.Spring.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Spring.web.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
