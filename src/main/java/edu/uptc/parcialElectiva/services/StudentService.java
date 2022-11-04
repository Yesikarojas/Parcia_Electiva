package edu.uptc.parcialElectiva.services;


import edu.uptc.parcialElectiva.entities.Student;
import edu.uptc.parcialElectiva.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents(){return studentRepository.findAll();}

    public Student save(Student student){return studentRepository.save(student);}

    public Student findById(int id){
        Optional<Student> optional = studentRepository.findById(id);
        return optional.isPresent() ? optional.get() : null;
    }

    public Student update(Student student){return  (findById(student.getId())!=null) ? studentRepository.save(student) : null;
    }

    public boolean delete(Student student){
        if (student != null) {
            studentRepository.delete(student);
        }
        return false;
    }
}
