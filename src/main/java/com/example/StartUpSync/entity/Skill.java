package com.example.StartUpSync.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Skill") // Change the table name to "Skill"
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "skillname")
    private String skillName;

    @ManyToOne
    @JoinColumn(name = "userid")
    private User user;

    public Skill() {
        super();
    }
}

