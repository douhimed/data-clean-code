package org.sqli.datacleancode.data.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.sqli.datacleancode.data.entities.TechnologyEnum;
import org.sqli.datacleancode.data.entities.Student;

import java.util.List;

/**
 *
 * by name
 *
 * name starts with
 *
 * by name with pageable options
 *
 * find by name with @Query
 *
 * by name and age
 *
 * by name is null
 *
 * name like
 *
 * name not like
 *
 * by age
 *
 * by age less than
 *
 * by age greater than
 *
 * present == true
 *
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findAllByName(String name);

    List<Student> findByNameStartingWith(String name);

    Page<Student> findByName(String name, Pageable pageable);

    @Query("select s from Student s where s.name = ?1")
    List<Student> fetchAllStudentsByName(String name);

    List<Student> findByNameAndAge(String name, int age);

    List<Student> findByNameIsNull();

    List<Student> findByNameLike(String name);

    List<Student> findByNameNotLike(String name);

    List<Student> findByAge(int age);

    List<Student> findByAgeLessThan(int age);

    List<Student> findByAgeGreaterThan(int age);

    List<Student> findByPresentTrue();

    List<Student> findByTechnology(TechnologyEnum technology);
}
