package org.sqli.datacleancode.data.entities;

import lombok.*;
import org.sqli.datacleancode.data.TechnologyEnum;

import javax.persistence.*;

/**
 *
 * add the entity & table annotation
 *
 * add the columns and the id with identity strategy
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private Long id;
    private String name;
    private int age;
    private boolean present;
    private TechnologyEnum technology;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", present=" + present +
                ", technology=" + technology +
                '}';
    }
}