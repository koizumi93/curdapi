package com.koizumi.curdapi.controller;

import com.koizumi.curdapi.entity.Name;
import com.koizumi.curdapi.service.NameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;


@RestController

public class NameController {
    
    private NameService nameService;
    
    public NameController(NameService nameService) throws Exception {
        this.nameService = nameService;
    }
    
    @GetMapping("/names")
    public ResponseEntity<List<NameResponse>> getNames() {
        List<Name> names = nameService.findAll();
        List<NameResponse> nameResponses = names.stream().map(NameResponse::new).collect(Collectors.toList());
        return ResponseEntity.ok(nameResponses);
    }
    
    @GetMapping("/names/{id}")
    public ResponseEntity<NameResponse> getNameById(@PathVariable int id) {
        Name name = nameService.findById(id);
        NameResponse nameResponse = new NameResponse(name);
        return ResponseEntity.ok(nameResponse);
    }
    
    //名前の登録
    /*@PostMapping("/names")
    public ResponseEntity<String> createName(@RequestBody CreateForm createForm) {
        nameService.create(createForm);
        return ResponseEntity.ok("NameCreated successfully");//created(null).build();
    }
    
    @PutMapping("/names/{id}")
    public void updateName(@PathVariable int id, @RequestBody String name) throws Exception {
        nameService.update(id, name);
    }*/
    
    /*@DeleteMapping("/names/{id}")
    /*public ResponseEntity<Map<String, String>> deleteName(@PathVariable("id") int id) {
        return ResponseEntity.ok(Map.of("message", "name successfully deleted"));
    }
    public void deleteName(@PathVariable int id) throws Exception {
        nameService.delete(id);
    }*/
}
