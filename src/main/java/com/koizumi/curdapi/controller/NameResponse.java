package com.koizumi.curdapi.controller;

import com.koizumi.curdapi.entity.Name;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NameResponse {
    
    private String name;
    
    public NameResponse(Name name) {
        this.name = name.getName();
    }
}
