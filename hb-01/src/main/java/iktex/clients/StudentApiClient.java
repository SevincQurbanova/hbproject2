package iktex.clients;


import iktex.models.*;
import iktex.utils.EntityManagerUtils;

import javax.persistence.EntityManager;
import java.time.LocalDate;

public class StudentApiClient {
    public static void main(String[] args) {



        //public Student(String name, LocalDate birthDate, String address, String gender)
        Student student1 = new Student("Ali", LocalDate.of(1981,2,23), "Tuzla Istanbul", "male");
        Student student2 = new Student("Ayşe", LocalDate.of(1987,8,30), "Baku ", "female");
        Student student3 = new Student("Hasan", LocalDate.of(1981,1,18), "Bostancı Istanbul", "male");

        Instructor pi1 = new PermanentInstructor("2500 tl");
        Instructor pi2 = new PermanentInstructor("1000 tl");
        Instructor vr1 = new VisitingResearcher("100 tl");
        Instructor vr2 = new VisitingResearcher("200 tl");
        Instructor vr3 = new VisitingResearcher("300 tl");

        Course course1=new Course("Advanced Hibernate","123","2000");
        Course course2=new Course("Spring boot microservices","124","2100");
        Course course3=new Course("React","125","2200");
        Course course4=new Course("PostgreSql","126","2300");
        Course course5=new Course("Oracle","127","2301");
        Course course6=new Course("nodeJs","128","2302");
        Course course7=new Course("MongoDb","129","2303");
        Course course8=new Course("VueJs","130","2304");
        Course course9=new Course("Machine Learning","126","2305");
        Course course10=new Course("PlPgSql","126","2306");




        pi1.getCourseList().add(course1);
        pi2.getCourseList().add(course2);
        pi2.getCourseList().add(course5);
        pi2.getCourseList().add(course6);
        vr1.getCourseList().add(course3);
        vr3.getCourseList().add(course4);
        vr3.getCourseList().add(course7);
        vr3.getCourseList().add(course8);

        student1.getCourseList().add(course1);
        student1.getCourseList().add(course3);
        student2.getCourseList().add(course1);
        student3.getCourseList().add(course3);
        student3.getCourseList().add(course4);

        course1.setInstructor(pi1);
        course2.setInstructor(pi2);
        course3.setInstructor(vr1);
        course4.setInstructor(vr2);





/*
        car1.setCustomer(customer1);
        car2.setCustomer(customer2);
        moto1.setCustomer(customer1);
        moto2.setCustomer(customer3);
        moto3.setCustomer(customer2);

        Accident accident1 = new Accident(LocalDate.of(2022, Month.APRIL, 22));
        Accident accident2 = new Accident(LocalDate.of(2021, Month.AUGUST, 2));
        Accident accident3 = new Accident(LocalDate.of(2020, Month.JANUARY, 22));

        car1.getAccidentList().add(accident1);
        car2.getAccidentList().add(accident1);
        moto1.getAccidentList().add(accident3);
        moto2.getAccidentList().add(accident1);
        moto3.getAccidentList().add(accident2);
*/
        EntityManager em = EntityManagerUtils.getEntityManager("mysqlPU");

        try {
            em.getTransaction().begin();

            em.persist(student1);
            em.persist(student2);
            em.persist(student3);

            em.persist(pi1);
            em.persist(pi2);
            em.persist(vr1);
            em.persist(vr2);
            em.persist(vr3);

            em.persist(course1);
            em.persist(course2);
            em.persist(course3);
            em.persist(course4);
            em.persist(course5);
            em.persist(course6);
            em.persist(course7);
            em.persist(course8);
            em.persist(course9);



           // if(Objects.nonNull(customer1)) throw new RuntimeException("exception occured...");

            em.getTransaction().commit();
            System.out.println("All data persisted...");
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            EntityManagerUtils.closeEntityManager(em);
        }


    }
}
