package br.com.lukedevfull.services;

import br.com.lukedevfull.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Service
public class PersonServices {
    private final AtomicLong counter = new AtomicLong();

    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public List<Person> findAll(){

        List<Person> persons = new ArrayList<Person>();
        //      Data MOCK ---->
        for (int i = 0; i < 10; i++) {
            Person person = mockPerson(i);
            persons.add(person);
        }
        logger.info("Find All Persons.");
        return persons;
    }

    private Person mockPerson(int i){
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstname("FIRTSNAME " + i);
        person.setLastName("LASTNAME " + i);
        person.setAddress("ADRESS " + i);
        person.setGender("GENDER " + i);
        return person;
    }

    public Person findByID(String id){
        logger.info("Fiding one person.");

        //      Data MOCK ---->
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstname("John");
        person.setLastName("Doe");
        person.setAddress("123 Main St");
        person.setGender("Male");

        return person;
    }

    public Person create(Person person){
        logger.info("Creating one person.");

        return person;
    }

    public Person update(Person person){
        logger.info("Updating one person.");

        return person;
    }

    public void delete(String id){
        logger.info("Deleting one person.");
    }
}
