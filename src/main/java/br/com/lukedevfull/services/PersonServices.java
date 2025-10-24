package br.com.lukedevfull.services;

import br.com.lukedevfull.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {
    private final AtomicLong counter = new AtomicLong();

    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public Person findByID(String id){
        logger.info("Fiding one person.");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstname("John");
        person.setLastName("Doe");
        person.setAddress("123 Main St");
        person.setGender("Male");

        return person;
    }
}
