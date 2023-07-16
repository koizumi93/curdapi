package com.koizumi.curdapi.service;

import com.koizumi.curdapi.form.CreateForm;
import com.koizumi.curdapi.entity.Name;

import java.util.List;

public interface NameService {
    
    List<Name> findAll();
    
    Name findById(int id);
    
    //idに指定した名前が存在しない場合に例外をthrowする
    Name findBy(int id) throws Exception;
    
    //登録
    void create(CreateForm createForm);
    
    //更新
    //idに指定した名前が存在しない場合に例外をthrowする
    void update(int id, String name) throws Exception;
    
    //削除
    void delete(int id) throws Exception;
    
}

