package com.example.cassandraplaywithspring.model;

import com.datastax.driver.core.DataType;
import org.springframework.data.cassandra.core.mapping.CassandraType;
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

    @Column("personal_info")
    //PersonalInfoクラスの方に@UserDefinedTypeを指定しておけば@CassandraTypeはなくても良さそう
    @CassandraType(type = DataType.Name.UDT, userTypeName = "basic_info")
    private PersonalInfo personalInfo;

    public User(UUID userId, String name, int strength, PersonalInfo personalInfo) {
        this.userId = userId;
        this.name = name;
        this.strength = strength;
        this.personalInfo = personalInfo;
    }
}