package org.eazybytes.controller;

import lombok.extern.slf4j.Slf4j;
import org.eazybytes.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class ContactController {

    @Autowired
    ContactService contactService;

    @GetMapping("/contact")
    public String displayContactPage() {
        return "contact.html";
    }

    @PostMapping("/saveMsg")
    public ModelAndView saveMessage(@RequestParam String name, @RequestParam String mobileNum, @RequestParam String email, @RequestParam String subject, @RequestParam String message) {
        log.info("Name : " + name);
        log.info("Mobile Number : " + mobileNum);
        log.info("Email Id : " + email);
        log.info("Subject : " + subject);
        log.info("Message : " + message);

        return new ModelAndView("redirect:/contact");
    }
}
