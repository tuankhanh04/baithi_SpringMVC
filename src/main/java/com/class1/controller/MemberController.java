package com.class1.controller;


import com.class1.entity.Members;
import com.class1.entity.Roles;
import com.class1.service.MemberService;
import com.class1.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/members")
public class MemberController {
    @Autowired
    private MemberService membersService;

    @Autowired
    private RoleService rolesService;

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String userId, @RequestParam String password, Model model) {
        Members existingMember = membersService.findByUserId(userId);
        if (existingMember != null && existingMember.getPassword().equals(password)) {
            model.addAttribute("message", "Login successful");
            return "loginSuccess";
        } else {
            model.addAttribute("message", "Invalid credentials");
            return "loginFailure";
        }
    }

    @PostMapping("/add")
    public String addMember(@RequestParam String userId, @RequestParam String password, @RequestParam int isActive, Model model) {
        Roles role = rolesService.findByUserId(userId);
        if (role != null && role.getRole().equals("ADMIN")) {
            Members member = new Members(userId, password, isActive);
            membersService.save(member);
            model.addAttribute("message", "Member added successfully");
            return "success";
        } else {
            model.addAttribute("message", "Access denied");
            return "failure";
        }
    }

    @PostMapping("/update")
    public String updateMember(@RequestParam String userId, @RequestParam String password, @RequestParam int isActive, Model model) {
        Roles role = rolesService.findByUserId(userId);
        if (role != null && role.getRole().equals("ADMIN")) {
            Members member = new Members(userId, password, isActive);
            membersService.save(member);
            model.addAttribute("message", "Member updated successfully");
            return "success";
        } else {
            model.addAttribute("message", "Access denied");
            return "failure";
        }
    }

    @DeleteMapping("/delete")
    public String deleteMember(@RequestParam String userId, Model model) {
        Roles role = rolesService.findByUserId(userId);
        if (role != null && role.getRole().equals("ADMIN")) {
            membersService.deleteById(userId);
            model.addAttribute("message", "Member deleted successfully");
            return "success";
        } else {
            model.addAttribute("message", "Access denied");
            return "failure";
        }
    }
}
