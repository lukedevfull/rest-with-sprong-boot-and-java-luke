package br.com.lukedevfull.controllers;


import br.com.lukedevfull.model.Person;
import br.com.lukedevfull.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonServices service;
    // private PersonServices service = new PersonServices;

    //Find All
    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Person> findAll (){
        return service.findAll();
    }

    //Find by ID
    @RequestMapping(value = "/{id}",
        method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Person findByID(@PathVariable("id") String id){
        return service.findByID(id);
    }
    //Create
    @RequestMapping(
        method = RequestMethod.POST,
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Person create(@RequestBody Person person){
        return service.create(person);
    }
    //UPDATE
    @RequestMapping(
        method = RequestMethod.PUT,
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Person update(@RequestBody Person person){
        return service.update(person);
    }

    //DELETE
    @RequestMapping(value = "/{id}",
            method = RequestMethod.DELETE
    )
    public void delete(@PathVariable("id") String id){
        service.delete(id);
    }
}
