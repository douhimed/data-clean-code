package org.sqli.datacleancode.data.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.sqli.datacleancode.data.entities.relations.Instructor;

@Repository
public interface InstructorDao extends JpaRepository<Instructor, Long> {
}
