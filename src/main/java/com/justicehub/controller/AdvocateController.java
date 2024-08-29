package com.justicehub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.justicehub.model.Advocate;
import com.justicehub.service.AdvocateService;

@Controller
public class AdvocateController {
    @Autowired
    private AdvocateService advocateService;

    @GetMapping("/advocates")
    public String listAdvocates(Model model) {
        model.addAttribute("advocates", advocateService.getAllAdvocates());
        return "list-advocates";
    }

    @GetMapping("/advocate/{id}")
    public String advocateDetails(@PathVariable Long id, Model model) {
        model.addAttribute("advocate", advocateService.getAdvocateById(id));
        return "advocate-details";
    }
    
//    @PostMapping("/create")
//    public Advocate createAdvocate(@RequestBody Advocate advocate) {
//    	
//    	Advocate b=advocateService.addAdvocate(advocate);
//    	return b;
//    }
    
    @PostMapping("/advocates/save")
    public String saveAdvocate(@ModelAttribute Advocate advocate) {
        advocateService.addAdvocate(advocate);
        return "redirect:/advocates"; // Redirect to the list of advocates or another relevant page
    }
    
//    @GetMapping("/advocates/create")
//    public String showCreateForm(Model model) {
//        model.addAttribute("advocate", new Advocate());
//        return "create-advocate";
//    }
//    
//    @PostMapping("/create")
//    public Advocate createAdvocate(@RequestBody Model model,@RequestBody Advocate advocate) {
//    	model.addAttribute("advocates", advocateService.addAdvocate(advocate));
//    	Advocate b=advocateService.addAdvocate(advocate);
//    	return b;
//    }
}
