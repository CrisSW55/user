package com.api.user;

import jakarta.persistence.*;

//Blueprint to create a table named user, and it's class fields as columns
//Using Hibernate framework to map this Java class into a relational database table
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
}
