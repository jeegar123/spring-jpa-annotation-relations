package com.hiberelation.app.controller;

import com.hiberelation.app.model.People;
import com.hiberelation.app.repo.ContactRepository;
import com.hiberelation.app.repo.PeopleRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    private final PeopleRepository peopleRepository;
    private final ContactRepository contactRepository;

    public AppController(PeopleRepository peopleRepository, ContactRepository contactRepository) {
        this.peopleRepository = peopleRepository;
        this.contactRepository = contactRepository;
    }

    @RequestMapping("/")
    public People getPeople() {
        return peopleRepository.findById(1).get();
    }


}
