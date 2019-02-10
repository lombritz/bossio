package io.codil.bossio.api;

import io.codil.bossio.model.Address;
import io.codil.bossio.model.Property;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

/**
 * This is a RESTful service for managing co-owned properties such as condos,
 * gated communities, apartments, etc...
 *
 * API is specs:
 *  GET    /properties/{id} ; Get a property by id
 *  GET    /properties/     ; Get all properties
 *  POST   /properties/     ; Creates a new property
 *  PUT    /properties/     ; Update a property by id
 *  DELETE /properties/{id} ; Delete a property by id
 *
 * @author Jaime Rojas <jaimitorojas@gmail.com>
 */
@RestController
@RequestMapping("properties")
public class PropertyController {

    @GetMapping(value = "/{id}", produces = "application/json")
    public Property getProperty(@PathVariable Long id) {
        System.out.println(id);
        return new Property(1L, "", new Address());
    }

    @GetMapping(value = "/", produces = "application/json")
    public List<Property> getAllProperties() {
        return Collections.emptyList();
    }

    @PostMapping(value = "/", produces = "application/json", consumes = "application/json")
    public String createProperty(Property property) {
        // TODO: create new property
        return String.format("{ \"response\": \"OK\", \"propertyId\": \"%s\" }", property.getId());
    }

    @PutMapping(value = "/", produces = "application/json", consumes = "application/json")
    public Property updateProperty(Property property) {
        // TODO: update property
        return property;
    }

    @DeleteMapping(value = "/", produces = "application/json", consumes = "application/json")
    public String deleteProperty(Property property) {
        // TODO: delete property
        return String.format("{ \"response\": \"OK\", \"propertyId\": \"%s\" }", property.getId());
    }
}
