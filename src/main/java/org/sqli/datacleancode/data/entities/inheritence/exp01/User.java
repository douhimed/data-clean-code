package org.sqli.datacleancode.data.entities.inheritence.exp01;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class User {

    @Id
    private Long id;
    private String name;

}
