package br.com.lukedevfull.controllers;


import br.com.lukedevfull.model.Person;
import br.com.lukedevfull.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonServices service;
    // private PersonServices service = new PersonServices;

    @RequestMapping(value = "/{id}",
        method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Person findByID(@PathVariable("id") String id){
        return service.findByID(id);
    }
}
