package org.sqli.datacleancode.data.controllers;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import org.sqli.datacleancode.data.dao.StudentRepository;
import org.sqli.datacleancode.data.entities.Student;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private StudentRepository studentRepository;


    @GetMapping
    public List<Student> getAll() {
        return new ArrayList<>();
    }


    @GetMapping("/{name}")
    public List<Student> getByName(@PathVariable String name) {
        return new ArrayList<>();
    }


    @GetMapping("/startsWith/{name}")
    public List<Student> getByNameIsStartsWith(@PathVariable String name) {
        return new ArrayList<>();
    }

    @GetMapping("/find/{id}")
    public Student getByIdUsingFind(@PathVariable long id) {
        return null;
    }


    @GetMapping("/get/{id}")
    public Student getByIdUsingGet(@PathVariable long id) {
        return null;
    }


    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {

    }


    @GetMapping("/pages")
    public Page<Student> getAllInPagesMode(@RequestParam(defaultValue = "0") int page,
                                           @RequestParam(defaultValue = "3") int size) {
        return null;
    }


    @GetMapping("/pages/{name}")
    public Page<Student> getAllInPagesMode(@PathVariable String name,
                                           @RequestParam(defaultValue = "0") int page,
                                           @RequestParam(defaultValue = "2") int size) {
        return null;
    }

    @GetMapping("/fetch/{name}")
    public List<Student> fetch(@PathVariable String name) {
        return new ArrayList<>();
    }

}
