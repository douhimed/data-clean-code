package org.sqli.datacleancode.data.entities.inheritence.exp04;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

public class Teacher extends User {

    private String course;
}
