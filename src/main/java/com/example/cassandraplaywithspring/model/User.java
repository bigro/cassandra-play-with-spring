package com.example.cassandraplaywithspring.model;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Table("users")
public class User {

    @PrimaryKey("user_id")
    private UUID userId;

    @Column("name") // @Columnはフィールド名と同じならなくてもいい
    private String name;

    @Column("strength")
    private int strength;

    public User(UUID userId, String name, int strength) {
        this.userId = userId;
        this.name = name;
        this.strength = strength;
    }
}