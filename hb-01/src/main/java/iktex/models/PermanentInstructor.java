package iktex.models;

import javax.persistence.Entity;

@Entity
public class PermanentInstructor extends Instructor{
    private String fixedSalary;

    public String getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(String fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public PermanentInstructor(Long id, String name, String address, String phoneNumber, String fixedSalary) {
        super(id, name, address, phoneNumber);
        this.fixedSalary = fixedSalary;
    }

    public PermanentInstructor(String fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    @Override
    public String toString() {
        return "PermanentInstructor{" +
                "fixedSalary='" + fixedSalary + '\'' +
                '}';
    }
}
