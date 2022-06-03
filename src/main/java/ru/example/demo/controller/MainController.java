package ru.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
//Вводится inject
@Value("${welcome.name}")
private String name;
@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
public String index(Model model){
   model.addAttribute("name", name);
   return "index";
}
}