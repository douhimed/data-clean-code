package org.sqli.datacleancode.data.entities.inheritence.exp03;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "teacher_singleclass")
@DiscriminatorValue("T")
public class Teacher extends User {

    private String course;
}
