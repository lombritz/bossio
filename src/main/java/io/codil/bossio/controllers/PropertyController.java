package io.codil.bossio.controllers;

import io.codil.bossio.models.Property;
import io.codil.bossio.repositories.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

/**
 * This is a RESTful service for managing co-owned properties such as condos,
 * gated communities, apartments, etc...
 *
 * API is specs:
 *  GET    /properties/{id} ; Get a properties by id
 *  GET    /properties/     ; Get all properties
 *  POST   /properties/     ; Creates a new properties
 *  PUT    /properties/     ; Update a properties by id
 *  DELETE /properties/{id} ; Delete a properties by id
 *
 * @author Jaime Rojas <jaimitorojas@gmail.com>
 */
@Controller
@RequestMapping("/properties")
public class PropertyController {

    private PropertyRepository propertyRepository;

    @Autowired
    public PropertyController(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("property", new Property());
        return "properties/form";
    }

    @PostMapping("/form")
    public RedirectView submit(@ModelAttribute Property property, Model model) {
        propertyRepository.save(property);
        return new RedirectView("list");// FIXME: only if save succeeded
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("properties", propertyRepository.findAll());
        return "properties/list";
    }

//    @GetMapping(value = "/{id}", produces = "application/json")
//    public Property getProperty(@PathVariable Long id) {
//        System.out.println(id);
//        return new Property(1L, "", new Address());
//    }
//
//    @GetMapping(value = "/", produces = "application/json")
//    public List<Property> getAllProperties() {
//        return Collections.emptyList();
//    }
//
//    @PostMapping(value = "/", produces = "application/json", consumes = "application/json")
//    public String createProperty(Property properties) {
//        // TODO: create new properties
//        return String.format("{ \"response\": \"OK\", \"propertyId\": \"%s\" }", properties.getId());
//    }
//
//    @PutMapping(value = "/", produces = "application/json", consumes = "application/json")
//    public Property updateProperty(Property properties) {
//        // TODO: update properties
//        return properties;
//    }
//
//    @DeleteMapping(value = "/", produces = "application/json", consumes = "application/json")
//    public String deleteProperty(Property properties) {
//        // TODO: delete properties
//        return String.format("{ \"response\": \"OK\", \"propertyId\": \"%s\" }", properties.getId());
//    }
}
