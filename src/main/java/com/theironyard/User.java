package com.theironyard;

import javax.persistence.*;

/**
 * Created by hoseasandstrom on 6/21/16.
 */

@Entity // need this if want in database
@Table(name = "users") // allows for special properties into table

public class User {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
