package edu.uptc.parcialElectiva.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "matter")
public class Matter {
    @Id
    private String code;
    private String description;
    private String cedits;

    public Matter() {
    }

    public Matter(String code, String description, String cedits) {
        this.code = code;
        this.description = description;
        this.cedits = cedits;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCedits() {
        return cedits;
    }

    public void setCedits(String cedits) {
        this.cedits = cedits;
    }

    @Override
    public String toString() {
        return "Matter{" +
                "code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", cedits='" + cedits + '\'' +
                '}';
    }
}
