package com.example.cassandraplaywithspring.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Table("users")
public class User {

    @PrimaryKey("user_id")
    private UUID userId;

    private String name;

    private int strength;

    public User(UUID userId, String name, int strength) {
        this.userId = userId;
        this.name = name;
        this.strength = strength;
    }
}