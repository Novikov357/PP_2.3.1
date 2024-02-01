package controller;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import service.UserService;

@Controller
@RequestMapping("/")
public class UsersController {

    private UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String printAllUsers(ModelMap model) {
        model.addAttribute("users", userService.getUserList());
        model.addAttribute("user", new User());
        return "users";
    }

    @PostMapping("/new")
    public String addUser(@ModelAttribute("user") User user) {
        userService.addUser(user);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String deleteUser(@RequestParam Long id) {
        userService.deleteUser(id);
        return "redirect:/";
    }

    @GetMapping("/edit")
    public String updateUser(@RequestParam Long id, ModelMap model) {
        model.addAttribute(userService.getUser(id));
        return "editUser";
    }

    @PostMapping("/applyapdate")
    public String doUpdate(@ModelAttribute("user") User user) {
        userService.updateUser(user);
        return "editUser";
    }
}
