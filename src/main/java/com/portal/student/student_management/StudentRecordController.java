package com.portal.student.student_management;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
public class StudentRecordController {
    private StudentService studentService;

    public StudentRecordController(StudentService studentService) {
//        super();
        this.studentService = studentService ;
    }
    @RequestMapping("list-students")
    public String listAllStudents(ModelMap model) {
        List<Student> students = studentService.findByname("Alice");
        model.addAttribute("students",students);
        return "listStudents";
    }
}
