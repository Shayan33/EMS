package model.service;

import model.common.EntityFactory;
import model.entity.Sessions;
import model.entity.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Service {

    public void register() {

        EntityManager entityManager = EntityFactory.getEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Set<Student> session1 = new HashSet<Student>();
        Set<Student> session2 = new HashSet<Student>();
        Set<Student> session3 = new HashSet<Student>();
        Set<Student> session4 = new HashSet<Student>();
        Set<Student> session5 = new HashSet<Student>();
        Set<Student> session6 = new HashSet<Student>();
        Set<Student> session7 = new HashSet<Student>();
        Set<Student> session8 = new HashSet<Student>();
        Set<Student> session9 = new HashSet<Student>();
        Set<Student> session10 = new HashSet<Student>();
        Set<Student> session11 = new HashSet<Student>();
        Set<Student> session12 = new HashSet<Student>();

        Student student1 = new Student();
        student1.setName("Shayan");
        student1.setFamily("Alipour");
        student1.setMidMark(20);
        student1.setFinalMark(20);
        student1.setRecom(1);

        Student student2 = new Student();
        student2.setName("Sajad");
        student2.setFamily("Ahmadi");
        student2.setMidMark(0);
        student2.setFinalMark(17);
        student2.setRecom(0);

        Student student3 = new Student();
        student3.setName("Reza");
        student3.setFamily("Abdy");
        student3.setMidMark(12);
        student3.setFinalMark(10);
        student3.setRecom(1);

        Student student4 = new Student();
        student4.setName("Parham");
        student4.setFamily("Amanpour");
        student4.setMidMark(2);
        student4.setFinalMark(8);
        student4.setRecom(0);

        Student student5 = new Student();
        student5.setName("Ehsan");
        student5.setFamily("Majlesi");
        student5.setMidMark(0);
        student5.setFinalMark(9);
        student5.setRecom(1);

        Student student6 = new Student();
        student6.setName("Amir");
        student6.setFamily("Tehrani");
        student6.setMidMark(14);
        student6.setFinalMark(0);
        student6.setRecom(1);

        Student student7 = new Student();
        student7.setName("Mahsa");
        student7.setFamily("Moghadam");
        student7.setMidMark(9);
        student7.setFinalMark(11);
        student7.setRecom(0);

        Student student8 = new Student();
        student8.setName("Maedeh");
        student8.setFamily("Asgari");
        student8.setMidMark(14);
        student8.setFinalMark(17);
        student8.setRecom(1);


        Set<Sessions> std1 = new HashSet<Sessions>();
        Set<Sessions> std2 = new HashSet<Sessions>();
        Set<Sessions> std3 = new HashSet<Sessions>();
        Set<Sessions> std4 = new HashSet<Sessions>();
        Set<Sessions> std5 = new HashSet<Sessions>();
        Set<Sessions> std6 = new HashSet<Sessions>();
        Set<Sessions> std7 = new HashSet<Sessions>();
        Set<Sessions> std8 = new HashSet<Sessions>();

        Sessions sessions1 = new Sessions();
        sessions1.setsName("Session SIX");

        Sessions sessions2 = new Sessions();
        sessions2.setsName("Session TWELVE");

        Sessions sessions3 = new Sessions();
        sessions3.setsName("Session TWO");

        Sessions sessions4 = new Sessions();
        sessions4.setsName("Session FOUR");

        Sessions sessions5 = new Sessions();
        sessions5.setsName("Session SEVEN");

        Sessions sessions6 = new Sessions();
        sessions6.setsName("Session THREE");

        Sessions sessions7 = new Sessions();
        sessions7.setsName("Session TEN");

        Sessions sessions8 = new Sessions();
        sessions8.setsName("Session NINE");

        Sessions sessions9 = new Sessions();
        sessions9.setsName("Session ONE");

        Sessions sessions10 = new Sessions();
        sessions10.setsName("Session ELEVEN");

        Sessions sessions11 = new Sessions();
        sessions11.setsName("Session FIVE");

        Sessions sessions12 = new Sessions();
        sessions12.setsName("Session EIGHT");


        std1.add(sessions1);
        std1.add(sessions2);
        std1.add(sessions3);
        std1.add(sessions4);
        std1.add(sessions5);
        std1.add(sessions6);
        std1.add(sessions7);
        std1.add(sessions8);
        std1.add(sessions9);
        std1.add(sessions10);
        std1.add(sessions11);
        std1.add(sessions12);

        //STUDENT2: SAJAD AHMADI, BEING ABSENT IN SESSIONS 3,6,10
        std2.add(sessions1);
        std2.add(sessions2);
        std2.add(sessions4);
        std2.add(sessions5);
        std2.add(sessions7);
        std2.add(sessions8);
        std2.add(sessions9);
        std2.add(sessions11);
        std2.add(sessions12);

        //STUDENT3: REZA ABDY, BEING ABSENT IN SESSIONS 1,5
        std3.add(sessions2);
        std3.add(sessions3);
        std3.add(sessions4);
        std3.add(sessions6);
        std3.add(sessions7);
        std3.add(sessions8);
        std3.add(sessions9);
        std3.add(sessions10);
        std3.add(sessions11);
        std3.add(sessions12);

        //STUDENT4: PARHAM AMANPOUR, BEING ABSENT IN SESSIONS 4,5,7,8
        std4.add(sessions1);
        std4.add(sessions2);
        std4.add(sessions3);
        std4.add(sessions6);
        std4.add(sessions9);
        std4.add(sessions10);
        std4.add(sessions11);
        std4.add(sessions12);

        //STUDENT5: EHSAN MAJLESI, BEING ABSENT IN SESSIONS 6,10
        std5.add(sessions1);
        std5.add(sessions2);
        std5.add(sessions3);
        std5.add(sessions4);
        std5.add(sessions5);
        std5.add(sessions9);
        std5.add(sessions7);
        std5.add(sessions8);
        std5.add(sessions11);
        std5.add(sessions12);


        //STUDENT6: AMIR TEHRANI, BEING ABSENT IN SESSIONS 8,12
        std6.add(sessions1);
        std6.add(sessions2);
        std6.add(sessions3);
        std6.add(sessions4);
        std6.add(sessions5);
        std6.add(sessions6);
        std6.add(sessions7);
        std6.add(sessions9);
        std6.add(sessions10);
        std6.add(sessions11);

        //STUDENT7: MAHSA MOGHADAM, BEING ABSENT IN SESSION 4
        std7.add(sessions1);
        std7.add(sessions2);
        std7.add(sessions3);
        std7.add(sessions5);
        std7.add(sessions6);
        std7.add(sessions7);
        std7.add(sessions8);
        std7.add(sessions9);
        std7.add(sessions10);
        std7.add(sessions11);
        std7.add(sessions12);

        std8.add(sessions1);
        std8.add(sessions2);
        std8.add(sessions3);
        std8.add(sessions4);
        std8.add(sessions5);
        std8.add(sessions6);
        std8.add(sessions7);
        std8.add(sessions8);
        std8.add(sessions9);
        std8.add(sessions10);
        std8.add(sessions11);
        std8.add(sessions12);


        //SESSION1
        session1.add(student1);
        session1.add(student2);
        session1.add(student4);
        session1.add(student5);
        session1.add(student6);
        session1.add(student7);
        session1.add(student8);

        //SESSION2
        session2.add(student1);
        session2.add(student2);
        session2.add(student3);
        session2.add(student4);
        session2.add(student5);
        session2.add(student6);
        session2.add(student7);
        session2.add(student8);

        //SESSION3
        session3.add(student1);
        session3.add(student3);
        session3.add(student4);
        session3.add(student5);
        session3.add(student6);
        session3.add(student7);
        session3.add(student8);

        //SESSION4
        session4.add(student1);
        session4.add(student2);
        session4.add(student3);
        session4.add(student5);
        session4.add(student6);
        session4.add(student8);

        //SESSION5
        session5.add(student1);
        session5.add(student2);
        session5.add(student3);
        session5.add(student5);
        session5.add(student6);
        session5.add(student7);
        session5.add(student8);

        //SESSION6
        session6.add(student1);
        session6.add(student3);
        session6.add(student4);
        session6.add(student6);
        session6.add(student7);
        session6.add(student8);

        //SESSION7
        session7.add(student1);
        session7.add(student2);
        session7.add(student3);
        session7.add(student5);
        session7.add(student6);
        session7.add(student7);
        session7.add(student8);

        //SESSION8
        session8.add(student1);
        session8.add(student2);
        session8.add(student3);
        session8.add(student5);
        session8.add(student7);
        session8.add(student8);

        //SESSION9
        session9.add(student1);
        session9.add(student2);
        session9.add(student3);
        session9.add(student4);
        session9.add(student5);
        session9.add(student6);
        session9.add(student7);
        session9.add(student8);

        //SESSION10
        session10.add(student1);
        session10.add(student3);
        session10.add(student4);
        session10.add(student6);
        session10.add(student7);
        session10.add(student8);

        //SESSION11
        session11.add(student1);
        session11.add(student2);
        session11.add(student3);
        session11.add(student4);
        session11.add(student5);
        session11.add(student6);
        session11.add(student7);
        session11.add(student8);

        //SESSION12
        session12.add(student1);
        session12.add(student2);
        session12.add(student3);
        session12.add(student4);
        session12.add(student5);
        session12.add(student7);
        session12.add(student8);


        student1.setSessionses(std1);
        student2.setSessionses(std2);
        student3.setSessionses(std3);
        student4.setSessionses(std4);
        student5.setSessionses(std5);
        student6.setSessionses(std6);
        student7.setSessionses(std7);
        student8.setSessionses(std8);

        sessions1.setStudents(session1);
        sessions2.setStudents(session2);
        sessions3.setStudents(session3);
        sessions4.setStudents(session4);
        sessions5.setStudents(session5);
        sessions6.setStudents(session6);
        sessions7.setStudents(session7);
        sessions8.setStudents(session8);
        sessions9.setStudents(session9);
        sessions10.setStudents(session10);
        sessions11.setStudents(session11);
        sessions12.setStudents(session12);

        //PERSIST ALL DATA
        entityManager.persist(student1);
        entityManager.persist(student2);
        entityManager.persist(student3);
        entityManager.persist(student4);
        entityManager.persist(student5);
        entityManager.persist(student6);
        entityManager.persist(student7);
        entityManager.persist(student8);

        entityManager.persist(sessions1);
        entityManager.persist(sessions2);
        entityManager.persist(sessions3);
        entityManager.persist(sessions4);
        entityManager.persist(sessions5);
        entityManager.persist(sessions6);
        entityManager.persist(sessions7);
        entityManager.persist(sessions8);
        entityManager.persist(sessions9);
        entityManager.persist(sessions10);
        entityManager.persist(sessions11);
        entityManager.persist(sessions12);

        entityTransaction.commit();
        entityManager.close();

    }

}
