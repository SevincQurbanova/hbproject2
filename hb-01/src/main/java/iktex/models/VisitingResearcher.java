package iktex.models;

import javax.persistence.Entity;

@Entity
public class VisitingResearcher extends Instructor{
    private String hourlySalary;

    public String getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(String hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public VisitingResearcher(Long id, String name, String address, String phoneNumber, String hourlySalary) {
        super(id, name, address, phoneNumber);
        this.hourlySalary = hourlySalary;
    }

    public VisitingResearcher(String hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    @Override
    public String toString() {
        return "VisitingResearcher{" +
                "hourlySalary='" + hourlySalary + '\'' +
                '}';
    }
}
