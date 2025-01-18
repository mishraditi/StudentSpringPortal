package com.portal.student.student_management;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
@Entity
public class Student {
       @Id
       @GeneratedValue
        private Integer id;
        @Size(min = 8 , message ="Name must be at least 8 characters, including surname")
        private String name;
        private int age;
        private String grade;
        private LocalDate enrollmentDate;
       private String teacherName;

        // Constructor
        public Student(Integer id, String name, int age, String grade, LocalDate enrollmentDate ,String teacherName) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.grade = grade;
            this.enrollmentDate = enrollmentDate;
            this.teacherName = teacherName;
        }

        // Getters and Setters
        public Integer getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getGrade() {
            return grade;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }

        public LocalDate getEnrollmentDate() {
            return enrollmentDate;
        }

        public void setEnrollmentDate(LocalDate enrollmentDate) {
            this.enrollmentDate = enrollmentDate;
        }
        public String getTeacherName() {
            return teacherName;
        }

        public void setTeacherName(String teacherName) {
            this.teacherName = teacherName;
        }

    @Override
    public String toString() {
        return "Student [id=" + id +
                ", name=" + name +
                ", age=" + age +
                ", grade=" + grade +
                ", teacherName=" + teacherName +
                ", enrollmentDate=" + enrollmentDate + "]";
    }

}
