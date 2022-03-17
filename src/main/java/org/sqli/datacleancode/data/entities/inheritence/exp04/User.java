package org.sqli.datacleancode.data.entities.inheritence.exp04;

import javax.persistence.*;

@Entity(name = "user_join")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class User {

    @Id
    private Long id;
    private String name;

}
