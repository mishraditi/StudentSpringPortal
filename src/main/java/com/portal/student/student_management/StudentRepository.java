package com.portal.student.student_management;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository <Student , Integer> {
//    Inherits methods like save, findById, deleteById, and more.

}