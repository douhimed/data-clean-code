package org.sqli.datacleancode.data;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.sqli.datacleancode.data.dao.CourseDao;
import org.sqli.datacleancode.data.dao.InstructorDao;
import org.sqli.datacleancode.data.dao.StudentRepository;
import org.sqli.datacleancode.data.entities.Student;
import org.sqli.datacleancode.data.entities.TechnologyEnum;
import org.sqli.datacleancode.data.entities.relations.Course;
import org.sqli.datacleancode.data.entities.relations.Instructor;
import org.sqli.datacleancode.data.entities.relations.InstructorDetail;

@SpringBootApplication
public class DataCleanCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataCleanCodeApplication.class, args);
    }

    @Bean
    CommandLineRunner run(StudentRepository studentRepository, InstructorDao instructorDao, CourseDao courseDao) {
        return args -> {

            studentRepository.save(new Student(null, "med", 27, true, TechnologyEnum.JAVA));
            studentRepository.save(new Student(null, "med", 20, true, TechnologyEnum.RUST));
            studentRepository.save(new Student(null, "ahmed", 15, true, TechnologyEnum.RUST));
            studentRepository.save(new Student(null, "ahmed", 27, false, TechnologyEnum.GO));
            studentRepository.save(new Student(null, "khalid", 42, true, TechnologyEnum.JAVA));
            studentRepository.save(new Student(null, "hicham", 30, false, TechnologyEnum.JAVA));
            studentRepository.save(new Student(null, "med", 19, false, TechnologyEnum.GO));
            studentRepository.save(new Student(null, "sousou", 32, false, TechnologyEnum.GO));
            studentRepository.save(new Student(null, "fouad", 32, true, TechnologyEnum.JAVA));
            studentRepository.save(new Student(null, "fouad", 32, true, TechnologyEnum.JAVA));
            studentRepository.save(new Student(null, "fouad", 25, true, TechnologyEnum.JAVA));
            studentRepository.save(new Student(null, "fouad", 72, false, TechnologyEnum.GO));
            studentRepository.save(new Student(null, "fouad", 22, true, TechnologyEnum.GO));
            studentRepository.save(new Student(null, "fouad", 35, true, TechnologyEnum.RUST));
            studentRepository.save(new Student(null, "laila", 32, true, TechnologyEnum.JAVA));

            final InstructorDetail instructorDetail = InstructorDetail.builder().hobby("coding").build();

            Instructor instructor = Instructor.builder()
                    .lastName("med")
                    .instructorDetail(instructorDetail)
                    .build();
            instructor = instructorDao.save(instructor);

            Course course = Course.builder().title("java").instructor(instructor).build();
            instructor.addCourse(course);
            courseDao.save(course);

            System.out.println("=================================== ALL Instructors =============================");
            instructorDao.findAll().forEach(System.out::println);

            System.out.println("=================================== ALL COURSES =============================");
            courseDao.findAll().forEach(System.out::println);
        };
    }
}
