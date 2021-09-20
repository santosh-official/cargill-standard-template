package com.cargill.service;
import com.cargill.entity.Template;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.*;

@Service
public class TemplateService {

    @Autowired
    private ObjectMapper mapper;

    private static final String FILE_NAME= "template.json";

    public void onboardNewTemplate(Template template) {
        File file = new File(FILE_NAME);
        try {
            mapper.writeValue(file, template);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Template getTemplate() {
        try {
            Template template = mapper.readValue(new File(FILE_NAME), Template.class);
            return template;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
