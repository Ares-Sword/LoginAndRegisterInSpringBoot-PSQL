package com.example.ExercicesWithSolution.ExercicesWithSolution.Controllers;

import com.example.ExercicesWithSolution.ExercicesWithSolution.Repository.UserRepository;
import com.example.ExercicesWithSolution.ExercicesWithSolution.Repository.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller

public class RegistrationController {

    @Autowired
    UserRepository userRepository;

 @GetMapping("/registration")
 public String customerForm(Model model) {
     model.addAttribute("users", new Users());
     return "registration";
 }
 @PostMapping("/registration")
 public String createCustomer( Users users, Model model) {
     userRepository.save(users);
     return "registration";
 }




  }
