package com.exceptionalcode.controller;

import com.exceptionalcode.model.Technology;
import com.exceptionalcode.service.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/technology")
public class TechnologyController {

    @Autowired
    private TechnologyService technologyService;

    @GetMapping
    public ResponseEntity<List<Technology>> viewAll() {
        return new ResponseEntity<>(technologyService.findAllTechnologies(), HttpStatus.OK);
    }

    @PostMapping
    public void addTechnology(@RequestBody Technology technology) {
        technologyService.addTechnology(technology);
    }

    @PutMapping("/{name}")
    public ResponseEntity<?> updateTechnology(@RequestBody Technology technology, @PathVariable String name) throws Exception {
        return new ResponseEntity<>(technologyService.updateTechnology(technology, name), HttpStatus.OK);
    }

    @DeleteMapping("/{name}")
    public void deleteTechnology(@PathVariable String name) throws Exception {
        technologyService.deleteTechnology(name);
    }
}