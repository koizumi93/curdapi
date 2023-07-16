package com.koizumi.curdapi.service;

import com.koizumi.curdapi.form.CreateForm;
import com.koizumi.curdapi.entity.Name;
import com.koizumi.curdapi.mapper.NameMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NameServiceImpl implements NameService {
    @Autowired
    private NameMapper nameMapper;
    
    public NameServiceImpl(NameMapper nameMapper) {
        this.nameMapper = nameMapper;
    }
    
    @Override
    public List<Name> findAll() {
        return nameMapper.findAll();
    }
    
    @Override
    public Name findBy(int id) throws Exception {
        return null;
    }
    
    @Override
    public void create(CreateForm createForm) {
        Name name = new Name();
        name.setName(createForm.getName());
        nameMapper.create(name);
    }
    
    @Override
    public void update(int id, String name) throws Exception {
        nameMapper.update(id, name);
    }
    
    @Override
    public void delete(int id) throws Exception {
        nameMapper.delete(id);
        
    }
    
}
