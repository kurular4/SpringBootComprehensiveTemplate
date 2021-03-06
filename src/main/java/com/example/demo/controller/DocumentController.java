package com.example.demo.controller;

import com.example.demo.dto.GenericResponse;
import com.example.demo.model.Document;
import com.example.demo.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("document")
public class DocumentController {

    @Autowired
    DocumentService documentService;

    @PutMapping(value = "create", consumes = "application/json")
    public GenericResponse create(@Valid @RequestBody Document document) {
        return documentService.create(document);
    }

    @PutMapping(value = "update/{id}", consumes = "application/json")
    public GenericResponse update(@PathVariable String id, @Valid @RequestBody Document document) {
        return documentService.update(id, document);
    }

    @DeleteMapping(value = "remove/{id}", consumes = "application/json")
    public GenericResponse update(@PathVariable String id) {
        return documentService.remove(id);
    }
}
