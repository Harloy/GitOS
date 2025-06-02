package org.example.controller;


import org.example.model.EntityB;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/entityB")
public class EntityBController {
    private final List<EntityB> list = new ArrayList<>();

    @GetMapping
    public List<EntityB> getAll() {
        return list;
    }

    @PostMapping
    public EntityB create(@RequestBody EntityB entity) {
        list.add(entity);
        return entity;
    }
}
