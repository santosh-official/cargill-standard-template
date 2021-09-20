package com.cargill.controller;

import com.cargill.entity.Template;
import com.cargill.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/template")
public class TemplateController {

    @Autowired
    private TemplateService templateService;


    @PostMapping
    public String saveNewTemplate(@RequestBody Template template) {
        templateService.onboardNewTemplate(template);
        return "Templated onboarded ..";
    }

    @GetMapping
    public Template getTemplate() {
        return templateService.getTemplate();
    }


}
