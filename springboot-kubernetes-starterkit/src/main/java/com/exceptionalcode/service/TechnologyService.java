package com.exceptionalcode.service;

import com.exceptionalcode.model.Technology;
import com.exceptionalcode.repository.TechnologyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TechnologyService {

    @Autowired
    private TechnologyRepository technologyRepository;

    public List<Technology> findAllTechnologies() {
        return technologyRepository.findAll();
    }

    public void addTechnology(Technology technology) {
        technologyRepository.save(technology);
    }

    public Technology updateTechnology(Technology technology, String name) throws Exception {
        Technology technologyByName = technologyRepository.findById(name).orElseThrow(Exception::new);
        technologyByName.setFramework(technology.getFramework());
        return technologyRepository.save(technologyByName);
    }

    public void deleteTechnology(String name) throws Exception {
        technologyRepository.findById(name).orElseThrow(Exception::new);
        technologyRepository.deleteById(name);
    }
}
