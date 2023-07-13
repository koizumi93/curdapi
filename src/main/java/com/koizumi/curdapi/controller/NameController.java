package com.koizumi.curdapi.controller;

import com.koizumi.curdapi.entity.Name;
import com.koizumi.curdapi.mapper.NameMapper;
import com.koizumi.curdapi.service.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@RestController
public class NameController {
    private NameMapper nameMapper;
    
    public NameController(NameMapper nameMapper) {
        this.nameMapper = nameMapper;
    }
    
    @GetMapping("/names")
    public List<Name> getNames() {
        List<Name> names = nameMapper.findAll();
        return names;
        
    }
}
