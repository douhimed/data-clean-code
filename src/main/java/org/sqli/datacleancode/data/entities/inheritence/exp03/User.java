package org.sqli.datacleancode.data.entities.inheritence.exp03;

import javax.persistence.*;

@Entity(name = "user_singleclass")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
public class User {

    @Id
    private Long id;
    private String name;

}
