package com.portal.student.student_management;

    public class Student {
        private int id;
        private String name;
        private int age;
        private String grade;
        private String address;

        // Constructor
        public Student(int id, String name, int age, String grade, String address) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.grade = grade;
            this.address = address;
        }

        // Getters and Setters
        public int getId() {
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

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

@Override
public String toString() {
    return "Student [id=" + id + ", name=" + name + ", age=" + age + "," +
            " grade=" + grade + ", address=" + address + "]";
}}
