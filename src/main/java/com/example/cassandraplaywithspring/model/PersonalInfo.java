package com.example.cassandraplaywithspring.model;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import java.time.LocalDate;

@UserDefinedType("basic_info")
public class PersonalInfo {
    @Column("birthday")
    LocalDate birthday;
    @Column("nationality")
    String nationality;
    @Column("weight")
    int weight;
    @Column("height")
    int height;

    public PersonalInfo(LocalDate birthday, String nationality, int weight, int height) {
        this.birthday = birthday;
        this.nationality = nationality;
        this.weight = weight;
        this.height = height;
    }
}
