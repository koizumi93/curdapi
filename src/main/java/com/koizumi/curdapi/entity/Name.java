package com.koizumi.curdapi.entity;

import com.koizumi.curdapi.mapper.NameMapper;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Name {
    private int id;
    private String name;
    
    public Name(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public Name() {
    }
}
