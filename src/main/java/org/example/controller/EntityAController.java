package org.example.controller;

import org.example.model.EntityA;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/entityA")
public class EntityAController {
    private final List<EntityA> list = new ArrayList<>();

    @GetMapping
    public List<EntityA> getAll() {
        return list;
    }

    @PostMapping
    public EntityA create(@RequestBody EntityA entity) {
        list.add(entity);
        return entity;
    }
}
