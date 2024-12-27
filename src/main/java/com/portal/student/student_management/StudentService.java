package com.portal.student.student_management;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
private static List<Student> students = new ArrayList<>();

static {
    students.add(new Student(1, "Alice", 15, "10th Grade", "123 Main St","Mr. Smith"));
    students.add(new Student(2, "Bob", 16, "11th Grade", "456 Oak Rd","Mr. Smith"));
    students.add(new Student(3, "Charlie", 14, "9th Grade", "789 Pine Ave","Ms. Johnson"));
    students.add(new Student(4, "Diana", 17, "12th Grade", "101 Maple Dr","Mr. Smith"));
}

public List<Student> getAllStudents() {
    return students;
}

public List<Student> findByname(String name){
    return students;
}
}
