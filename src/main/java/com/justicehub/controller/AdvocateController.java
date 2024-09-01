package com.justicehub.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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
    
    @PostMapping("/advocates/save")
    public String saveAdvocate(@ModelAttribute Advocate advocate) {
        advocateService.addAdvocate(advocate);
        return "redirect:/advocates"; // Redirect to the list of advocates or another relevant page
    }
    
    @GetMapping("/advocates/create")
    public String showCreateForm(Model model) {
        model.addAttribute("advocate", new Advocate());
        return "create-advocate";
    }
    
    
    @PostMapping("/booking")
    public String bookAdvocate(@RequestParam("clientName") String clientName,
                               @RequestParam("appointmentDate") String appointmentDate,
                               @RequestParam("advocateId") Long advocateId,
                               Model model) {

        model.addAttribute("message", "Thank you for booking, " + clientName + "!");
        return "booking-confirmation";
    }
    
    @GetMapping("/advocate/delete/{id}")
    public String deleteAdvocate(@PathVariable Long id, Model model) {
        advocateService.deleteAdvocateById(id);
        return "redirect:/advocates"; // Redirect to the list of advocates after deletion
    }
}
