package com.portal.student.student_management;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@SessionAttributes("name")
public class StudentRecordController {
    private StudentService studentService;

    public StudentRecordController(StudentService studentService) {
//        super();
        this.studentService = studentService ;
    }
    @RequestMapping("list-students")
    public String listAllStudents(ModelMap model) {
//        List<Student> students = studentService.findByTeachername("Mr. Smith");
        List<Student> students = studentService.getAllStudents(); // Get all students
        model.addAttribute("students",students);
        return "listStudents";
    }

    @RequestMapping(value="add-students", method = RequestMethod.GET)
    public String showNewStudentPage() {
        return "student";
    }

    @RequestMapping(value="add-students", method = RequestMethod.POST)
    public String addNewStudents(@RequestParam String name, @RequestParam int age,
                                 @RequestParam String grade, @RequestParam String address,
                                 @RequestParam String teacherName) {
//        String name = (String)model.get("name");
        studentService.addStudent(name, age, grade, address, teacherName);
System.out.println("Received data: Name=" + name + ", Age=" + age + ", Grade=" + grade + ", Address=" + address + ", TeacherName=" + teacherName);

        return "redirect:list-students";
    }
}
