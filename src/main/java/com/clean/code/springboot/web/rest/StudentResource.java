package com.clean.code.springboot.web.rest;

import com.clean.code.springboot.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")

public class StudentResource {
//    @GetMapping("/students")
//    public String hello(){
//        return "Hello world";
//    }

    @RequestMapping(value = "/students/all", method = RequestMethod.GET)
    public ResponseEntity getAll(){
        Student student = new Student(1L, "Aziz", "Nodirov", "3-kurs");
        Student student1 = new Student(2L, "Laziz", "Nodirov", "3-kurs");
        Student student2 = new Student(3L, "Jobir", "Nodirov", "3-kurs");

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);

        return ResponseEntity.ok(students);
    }

    @GetMapping("/student/{id}")
    public ResponseEntity getOne(@PathVariable Long id){
        Student student = new Student(id, "Aziz", "Nodirov", "3-kurs");
        return ResponseEntity.ok(student);
    }

    @GetMapping("/students")
    public ResponseEntity getOne(@RequestParam Long id,
                                 @RequestParam String name,
                                 @RequestParam String lastName,
                                 @RequestParam String course){
        Student student = new Student(id, name, lastName, course);
        return ResponseEntity.ok(student);
    }

    @PostMapping("/students")
    public ResponseEntity create(@RequestBody Student student){
        return ResponseEntity.ok(student);
    }

    @PutMapping("/students/{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody Student newStudent){
        Student student = new Student(1L, "Aziz", "Nodirov", "3-kurs");
        student.setId(id);
        student.setName(newStudent.getName());
        student.setLastname(newStudent.getLastname());
        return ResponseEntity.ok(student);
    }

    @DeleteMapping("students/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        return ResponseEntity.ok("Malumot o'chirildi!");
    }

}
