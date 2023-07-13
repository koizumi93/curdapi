package com.koizumi.curdapi.service;

import com.koizumi.curdapi.entity.Name;

import java.util.List;

public interface NameService {
    List<Name> findAll();
    
 /*   //idに指定した名前が存在しない場合に例外をthrowする
    Name findBy(int id) throws Exception;
    
    void create(String name);
    
    //idに指定した名前が存在しない場合に例外をthrowする
    void update(int id, String name) throws Exception;*/
}
