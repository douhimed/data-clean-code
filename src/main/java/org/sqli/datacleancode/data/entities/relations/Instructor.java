package org.sqli.datacleancode.data.entities.relations;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * mappe the list OneToMany
 *
 * instructor details is a one to one case
 *
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Instructor {
    private Long id;
    private String lastName;
    private InstructorDetail instructorDetail;
    private List<Course> courses;

    public void addCourse(Course course) {
        if(courses == null)
            courses = new ArrayList<>();
        courses.add(course);
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", instructorDetail=" + instructorDetail +
                ", courses=" + courses +
                '}';
    }
}






