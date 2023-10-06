package org.launchcode.spaday.controllers;

import org.launchcode.spaday.models.User;
import org.launchcode.spaday.data.UserData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
public class UserController {

    //private UserData userData = new UserData();

    @GetMapping("add")
    public String displayAddUserForm () {
        return "user/add";
    }

    @PostMapping
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
         // add form submission handling code here
        if (user.getPassword().equals(verify)) {
//            userData.add(user);
//            model.addAttribute("users", this.userData.getAll());
            return "user/index";
        } else {
            model.addAttribute("error", "Passwords should match");
            model.addAttribute("username", user.getUsername());
            model.addAttribute("email", user.getEmail());
            return "user/add";
        }
    }

//    @GetMapping("{id}/details")
//    public String getUserDetails(Model model, @PathVariable int id) {
//        User user = this.userData.getById(id);
//        model.addAttribute("user", user);
//        return "user/details";
//    }

}
