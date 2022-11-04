package edu.uptc.parcialElectiva.controllers;

import edu.uptc.parcialElectiva.entities.Student_Has_Matter;
import edu.uptc.parcialElectiva.services.MatterService;
import edu.uptc.parcialElectiva.services.StuMatterService;
import edu.uptc.parcialElectiva.services.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/stumatt")
public class Stu_Matt_Controller {

    private StuMatterService stuMatterService;
    private StudentService studentService;
    private MatterService matterService;

    public Stu_Matt_Controller(StuMatterService stuMatterService, StudentService studentService, MatterService matterService) {
        this.stuMatterService = stuMatterService;
        this.studentService = studentService;
        this.matterService = matterService;
    }

    @GetMapping
    public List<Student_Has_Matter> getStuMatt(){return  stuMatterService.getStudMatter();}

    @GetMapping("/{id}")
    public Student_Has_Matter findById(@PathVariable int id){return stuMatterService.findById(id);}

    @PostMapping
    public Student_Has_Matter save(@RequestBody Student_Has_Matter student_has_matter){
        if(matterService.findById(student_has_matter.getMatter().getCode()) != null && studentService.findById(student_has_matter.getStudent().getId()) != null){
            return stuMatterService.save(new Student_Has_Matter(studentService.findById(student_has_matter.getStudent().getId()),matterService.findById(student_has_matter.getMatter().getCode())));
        }
        return null;
    }

    @PutMapping("/{id}")
    public Student_Has_Matter update(@RequestBody Student_Has_Matter student_has_matter, @PathVariable int id){
        if(matterService.findById(student_has_matter.getMatter().getCode()) != null && studentService.findById(student_has_matter.getStudent().getId()) != null){
            return stuMatterService.update(new Student_Has_Matter(studentService.findById(student_has_matter.getStudent().getId()),matterService.findById(student_has_matter.getMatter().getCode())));
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable int id){
        return stuMatterService.delete(findById(id));
    }
}
