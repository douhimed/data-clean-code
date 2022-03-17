package org.sqli.datacleancode.data.entities.inheritence.exp02;

import javax.persistence.*;

@Entity(name = "user_perclass")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User {

    @Id
    private Long id;
    private String name;

}
