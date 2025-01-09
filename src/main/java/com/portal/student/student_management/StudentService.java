package com.portal.student.student_management;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//import static com.sun.beans.introspect.PropertyInfo.Name.description;

@Service
public class StudentService {
private static List<Student> students = new ArrayList<>();
private static int studentCount = 0;

static {
    students.add(new Student(++studentCount, "Alice", 15, "10th Grade", "123 Main St","Mr. Smith"));
    students.add(new Student(++studentCount, "Bob", 16, "11th Grade", "456 Oak Rd","Mr. Smith"));
    students.add(new Student(++studentCount, "Charlie", 14, "9th Grade", "789 Pine Ave","Ms. Johnson"));
    students.add(new Student(++studentCount, "Diana", 17, "12th Grade", "101 Maple Dr","Mr. Smith"));
}

public List<Student> getAllStudents() {
    return students;
}

//public List<Student> findByname(String name){
//    return students;
//}
    public List<Student> findByTeachername(String name){
    Predicate<? super Student> predicate
     = student -> student.getTeacherName().equalsIgnoreCase(name); //parameter representing a single Student object from the list.
    return students.stream().filter(predicate).toList();
    }

    public void addStudent(String name, int age, String grade, String address ,String teacherName){
        Student student = new Student(++studentCount,name,age,grade,address,teacherName);
        students.add(student);
//         System.out.println("Student added: " + student);
//        System.out.prtintln("Current students list: " + students);
    }
    public void deleteById(int id){
        Predicate<? super Student> predicate
        = student -> student.getId()==id;
        students.removeIf(predicate);
    }
    public Student findById(int id) {
        Predicate<? super Student> predicate = student -> student.getId() == id;
        Student student = students.stream().filter(predicate).findFirst().get();
        return student;
    }
    public void updateStudent(@Valid Student student){
    deleteById(student.getId());
    students.add(student);
    }
}
