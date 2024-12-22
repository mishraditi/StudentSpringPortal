package com.portal.student.student_hive;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController{
    @RequestMapping("student-hive")
    @ResponseBody
    public String StudentHub(){
        return "Welcome! students";
    }
    @RequestMapping("generate-html")
    @ResponseBody
    public String sayHelloHtml() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title> My First HTML Page - Changed</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("Welcome to my first HTML page");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    }}
