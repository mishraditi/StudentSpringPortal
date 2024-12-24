package com.portal.student.student_management;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
private static List<Student> students = new ArrayList<>();

static {
    students.add(new Student(1, "Alice", 15, "10th Grade", "123 Main St"));
    students.add(new Student(2, "Bob", 16, "11th Grade", "456 Oak Rd"));
    students.add(new Student(3, "Charlie", 14, "9th Grade", "789 Pine Ave"));
    students.add(new Student(4, "Diana", 17, "12th Grade", "101 Maple Dr"));
}

public List<Student> getAllStudents() {
    return students;
}
}