package org.sqli.datacleancode.data.entities.inheritence.exp01;

import javax.persistence.Entity;

@Entity(name = "teacher_superclass")
public class Teacher extends User{

    private String course;
}
