package com.portal.student.student_management;

    public class Student {
        private Integer id;
        private String name;
        private int age;
        private String grade;
        private String address;
        private String teacherName;

        // Constructor
        public Student(Integer id, String name, int age, String grade, String address ,String teacherName) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.grade = grade;
            this.address = address;
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

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
        public String getTeacherName() {
            return teacherName;
        }

        public void setTeacherName(String teacherName) {
            this.teacherName = teacherName;
        }

@Override
public String toString() {
    return "Student [id=" + id + ", name=" + name + ", age=" + age + ", grade=" + grade +
            ", address=" + address + ", teacherName=" + teacherName + "]";
}
}
