package org.sqli.datacleancode.data.entities.relations;

import lombok.*;

import javax.persistence.*;

/**
 *
 * entity + table
 * mappe the instructor ManyToOne/JoinColumn
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {

    private Long id;
    private String title;
    private Instructor instructor;

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                '}';
    }


}
