package org.example.model;

public class EntityB {
    private Long id;
    private String description;

    public EntityB() {}
    public EntityB(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
