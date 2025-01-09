package com.portal.student.student_management;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
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
    public String showNewStudentPage(ModelMap model) {
        Student student = new Student(0,"",0,"","","");
        model.put("student", student);
        return "student";
    }

    @RequestMapping(value="add-students", method = RequestMethod.POST)
    public String addNewStudents(@Valid Student student , BindingResult result){
//@RequestParam String name,@RequestParam int age,@RequestParam String grade, @RequestParam String address, @RequestParam String teacherName
//        String name = (String)model.get("name");
        if(result.hasErrors()){
            return "student";
        }
studentService.addStudent(student.getName(), student.getAge(), student.getGrade() , student.getAddress(), student.getTeacherName());
//System.out.println("Received data: Name=" + name + ",Age=" + age + ",Grade=" + grade + ",Address=" + address + ", TeacherName=" + teacherName);
        return "redirect:list-students";
    }
}