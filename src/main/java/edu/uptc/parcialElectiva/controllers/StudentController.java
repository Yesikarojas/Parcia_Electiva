package edu.uptc.parcialElectiva.controllers;

import edu.uptc.parcialElectiva.entities.Matter;
import edu.uptc.parcialElectiva.entities.Student;
import edu.uptc.parcialElectiva.services.MatterService;
import edu.uptc.parcialElectiva.services.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/students")
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents(){return  studentService.getStudents();}
    @GetMapping("/{id}")
    public Student findById(@PathVariable int id){return  studentService.findById(id);}

    @PostMapping
    public Student save(@RequestBody Student student){return studentService.save(student);}

    @PutMapping("/{id}")
    public Student update(@RequestBody Student student, @PathVariable int id){return studentService.update(student);}

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable int id){
        return studentService.delete(findById(id));
    }
}
