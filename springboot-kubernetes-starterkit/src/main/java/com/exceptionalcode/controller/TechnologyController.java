package com.exceptionalcode.controller;

import com.exceptionalcode.model.Technology;
import com.exceptionalcode.repository.TechnologyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class TechnologyController {

    @Autowired
    private TechnologyRepository technologyRepository;

    @GetMapping(value = "/technology")
    public List<Technology> viewAll() {
        return technologyRepository.findAll();
    }
}
