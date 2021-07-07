package com.example.demospringday2.controller;

import com.example.demospringday2.model.Institute;
import com.example.demospringday2.service.InstituteService;
import com.example.demospringday2.service.InstituteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class indexController {

    // @Autowired //injecting the bean that is stored in ioc
    private InstituteService instituteService;
    indexController (InstituteService instituteService) {
        this.instituteService=instituteService;
    }
    //public void setInstituteService(InstituteService insituteService){
    //this.instituteService=instituteService;
    //}
    //HTTP Methods
    // GET -> used for getting values, returning the views (html)
    // POST -> save something to database
    // PUT -> update something
    // DELETE -> delete something

    //DI and IOC
    //Dependency Injection and Inversion of Control

    @GetMapping("/institute-list")
    public List<Institute> index() {


        return instituteService.instituteList();
    }
}
