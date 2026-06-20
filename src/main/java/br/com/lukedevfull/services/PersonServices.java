package br.com.lukedevfull.services;

import br.com.lukedevfull.exceptions.handler.ResourceNotFoundException;
import br.com.lukedevfull.model.Person;
import br.com.lukedevfull.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    PersonRepository repository;

    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public List<Person> findAll(){

        List<Person> persons = new ArrayList<Person>();
        logger.info("Find All Persons.");
        //      Data MOCK ---->
//        for (int i = 0; i < 10; i++) {
//            Person person = mockPerson(i);
//            persons.add(person);
//        }
        return repository.findAll();
    }

    public Person findByID(Long id){
        logger.info("Fiding one person.");

        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No Records found this id!"));
    }

    public Person create(Person person){
        logger.info("Creating one person.");

        return repository.save(person);
    }

    public Person update(Person person){
        logger.info("Updating one person.");
        Person entity = repository.findById(person.getId())
                .orElseThrow(() -> new ResourceNotFoundException("No Records found this id!"));
        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setAddress(person.getAddress());
        entity.setGender(person.getGender());

        return repository.save(entity);
    }
    public void delete(Long id){
        logger.info("Deleting one person.");
        Person entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No Records found this id!"));

        repository.delete(entity);
    }
}
