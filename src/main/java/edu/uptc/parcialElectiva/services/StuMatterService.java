package edu.uptc.parcialElectiva.services;

import edu.uptc.parcialElectiva.entities.Student_Has_Matter;
import edu.uptc.parcialElectiva.repositories.Stu_Matt_Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StuMatterService {
    private Stu_Matt_Repository stu_matt_repository;

    public StuMatterService(Stu_Matt_Repository stu_matt_repository) {
        this.stu_matt_repository = stu_matt_repository;
    }

    public List<Student_Has_Matter> getStudMatter(){return stu_matt_repository.findAll();}

    public Student_Has_Matter save(Student_Has_Matter student_has_matter ){return stu_matt_repository.save(student_has_matter);}

    public Student_Has_Matter findById(int id){
        Optional<Student_Has_Matter> optional = stu_matt_repository.findById(id);
        return optional.isPresent() ? optional.get() : null;
    }

    public Student_Has_Matter update(Student_Has_Matter student_has_matter){return  (findById(student_has_matter.getId())!=null) ? stu_matt_repository.save(student_has_matter) : null;
    }

    public boolean delete(Student_Has_Matter student_has_matter){
        if (student_has_matter != null) {
            stu_matt_repository.delete(student_has_matter);
        }
        return false;
    }
}
