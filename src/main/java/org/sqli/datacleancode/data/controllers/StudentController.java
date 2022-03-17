package org.sqli.datacleancode.data.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;
import org.sqli.datacleancode.data.dao.StudentRepository;
import org.sqli.datacleancode.data.entities.Student;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;


    @GetMapping
    public List<Student> getAll() {
        return this.studentRepository.findAll();
    }


    @GetMapping("/{name}")
    public List<Student> getByName(@PathVariable String name) {
        return this.studentRepository.findAllByName(name);
    }


    @GetMapping("/startsWith/{name}")
    public List<Student> getByNameIsStartsWith(@PathVariable String name) {
        return this.studentRepository.findByNameStartingWith(name);
    }

    @GetMapping("/find/{id}")
    public Student getByIdUsingFind(@PathVariable long id) {
        return this.studentRepository.findById(id).orElse(null);
    }


    @GetMapping("/get/{id}")
    public Student getByIdUsingGet(@PathVariable long id) {
        return this.studentRepository.getById(id);
    }


    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {
        this.studentRepository.deleteById(id);
    }


    @GetMapping("/pages")
    public Page<Student> getAllInPagesMode(@RequestParam(defaultValue = "0") int page,
                                           @RequestParam(defaultValue = "3") int size) {
        return this.studentRepository.findAll(PageRequest.of(page, size));
    }


    @GetMapping("/pages/{name}")
    public Page<Student> getAllInPagesMode(@PathVariable String name,
                                           @RequestParam(defaultValue = "0") int page,
                                           @RequestParam(defaultValue = "2") int size) {
        return this.studentRepository.findByName(name, PageRequest.of(page, size));
    }

    @GetMapping("/fetch/{name}")
    public List<Student> fetch(@PathVariable String name) {
        return this.studentRepository.fetchAllStudentsByName(name);
    }

}
