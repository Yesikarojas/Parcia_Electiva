package edu.uptc.parcialElectiva.entities;

import javax.persistence.*;

@Entity
@Table(name = "student_matter")
public class Student_Has_Matter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Student student;

    @ManyToOne
    private Matter matter;

    public Student_Has_Matter() {
    }

    public Student_Has_Matter(Student student, Matter matter) {
        this.student = student;
        this.matter = matter;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Matter getMatter() {
        return matter;
    }

    public void setMatter(Matter matter) {
        this.matter = matter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student_Has_Matter{" +
                "id=" + id +
                ", student=" + student +
                ", matter=" + matter +
                '}';
    }
}