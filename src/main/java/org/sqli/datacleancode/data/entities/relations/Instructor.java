package org.sqli.datacleancode.data.entities.relations;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "instructor")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "last_name")
    private String lastName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "instructor_detail_id")
    private InstructorDetail instructorDetail;

    @OneToMany(mappedBy = "instructor", fetch = FetchType.EAGER)
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






