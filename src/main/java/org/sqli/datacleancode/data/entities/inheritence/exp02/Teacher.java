package org.sqli.datacleancode.data.entities.inheritence.exp02;

import javax.persistence.Entity;

@Entity(name = "teacher_perclass")
public class Teacher extends User {

    private String course;
}
