package com.portal.student.login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
//    @RequestMapping("login")
//    public String gotoLoginPage(@RequestParam String name , ModelMap model) {
//        model.put("name", name);
//        return "login";}
private AuthenticationService authenticationService;
    public LoginController(AuthenticationService authenticationService) {
        super();
        this.authenticationService = authenticationService;
    }
        @RequestMapping(value = "login" ,method = RequestMethod.GET)
        public String gotoLoginPage() {
            return "login";
        }
    @RequestMapping(value="login",method = RequestMethod.POST)
    public String gotoWelcomePage(@RequestParam String name,
                                  @RequestParam String password, ModelMap model) {

        if(authenticationService.authenticate(name, password)) {
            model.put("name", name);
            //Authentication
            //name - aditi
            //password - Udemy
            return "welcome";
        }
        model.put("errorMessage","Invalid Credentials!, Please try again!");
        return "login";
    }
}
