package br.com.lukedevfull.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class PersonServices {
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private PersonServices person;
        // private PersonServices person = new PersonServices;
}
