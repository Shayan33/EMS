package model.service;

import model.common.EntityFactory;
import model.entity.Sessions;
import model.entity.Student;
import org.json.simple.*;

import javax.json.*;


import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Methods extends UnicastRemoteObject implements MethodInt, Serializable {


    public Methods() throws RemoteException {
    }

    public List<Student> selectNamesfromStudent() {
        EntityManager entityManager = EntityFactory.getEntityManager();
        Query query = entityManager.
                createQuery("SELECT STD FROM student STD");
        List<Student> stdNames = query.getResultList();
        return stdNames;
    }

    public List<Sessions> returnAllSessions() {
        EntityManager entityManager = EntityFactory.getEntityManager();
        Query query = entityManager.
                createQuery("SELECT SES FROM sessions SES");
        List<Sessions> sessionList = query.getResultList();
        return sessionList;
    }

    public JSONArray absentListInEachSession4Interface(long sessionID) {
        EntityManager entityManager = EntityFactory.getEntityManager();
        Query query = entityManager.
                createQuery("SELECT s.students FROM sessions s JOIN s.students WHERE s.id = :id");
        query.setParameter("id", sessionID);

        List<Student> stdNames = query.getResultList();
        JSONArray jsonArray = new JSONArray();

        int size = (int) Math.sqrt(stdNames.size());
        int counter;

        //print output
        System.out.println("Athendancd List in Session " + sessionID);

        //create JsonArray of Students
        JSONArray studentArray = new JSONArray();

        if(size == 8) {
            for (int i = 0; i < size; i++){
                counter = i + 1;
                JSONObject jsonObject = new JSONObject();
                System.out.println(counter + ". Student ID : " + stdNames.get(i).getId() +
                        " , Student Name : " + stdNames.get(i).getName() + " Was Present");

                jsonObject.put("id", stdNames.get(i).getId());
                jsonObject.put("name", stdNames.get(i).getName());
                jsonObject.put("last", stdNames.get(i).getFamily());
                jsonObject.put("status", "Present");

                studentArray.add(jsonObject);

            }
            System.out.println("So All The Students Were Present!");
            //System.out.println("*****STUDENT ARRAY*****");
            //System.out.println(studentArray.toJSONString());

        }
        else {
            for (long j = 1; j < 9; j++) {
                JSONObject jsonObject = new JSONObject();
                if (stdNames.get(0).getId() == j) {
                    jsonObject.put("id", stdNames.get(0).getId());
                    jsonObject.put("name", stdNames.get(0).getName());
                    jsonObject.put("last", stdNames.get(0).getFamily());
                    jsonObject.put("status", "Present");

                    studentArray.add(jsonObject);
                    /*JSONArray jsonArray1 = new JSONArray();
                    jsonArray1.add(stdNames.get(0).getId());
                    jsonArray1.add(stdNames.get(0).getName());
                    jsonArray1.add("Present");
                    jsonObject.put("Student", jsonArray1);
                    jsonArray.add(jsonObject);*/
                    System.out.println(j + ". Student ID : " + stdNames.get(0).getId() +
                            " , Student Name : " + stdNames.get(0).getName() + " Was Present");
                } else if (stdNames.get(1).getId() == j){

                    jsonObject.put("id", stdNames.get(1).getId());
                    jsonObject.put("name", stdNames.get(1).getName());
                    jsonObject.put("last", stdNames.get(1).getFamily());
                    jsonObject.put("status", "Present");

                    studentArray.add(jsonObject);
                    /*JSONArray jsonArray1 = new JSONArray();
                    jsonArray1.add(stdNames.get(1).getId());
                    jsonArray1.add(stdNames.get(1).getName());
                    jsonArray1.add("Present");
                    jsonObject.put("Student", jsonArray1);
                    jsonArray.add(jsonObject);*/
                    System.out.println(j + ". Student ID : " + stdNames.get(1).getId() +
                            " , Student Name : " + stdNames.get(1).getName() + " Was Present");
                } else if (stdNames.get(2).getId() == j){
                    jsonObject.put("id", stdNames.get(2).getId());
                    jsonObject.put("name", stdNames.get(2).getName());
                    jsonObject.put("last", stdNames.get(2).getFamily());
                    jsonObject.put("status", "Present");

                    studentArray.add(jsonObject);
                    /*JSONArray jsonArray1 = new JSONArray();
                    jsonArray1.add(stdNames.get(2).getId());
                    jsonArray1.add(stdNames.get(2).getName());
                    jsonArray1.add("Present");
                    jsonObject.put("Student", jsonArray1);
                    jsonArray.add(jsonObject);*/
                    System.out.println(j + ". Student ID : " + stdNames.get(2).getId() +
                            " , Student Name : " + stdNames.get(2).getName() + " Was Present");
                } else if (stdNames.get(3).getId() == j){

                    jsonObject.put("id", stdNames.get(3).getId());
                    jsonObject.put("name", stdNames.get(3).getName());
                    jsonObject.put("last", stdNames.get(3).getFamily());
                    jsonObject.put("status", "Present");

                    studentArray.add(jsonObject);
                   /* JSONArray jsonArray1 = new JSONArray();
                    jsonArray1.add(stdNames.get(3).getId());
                    jsonArray1.add(stdNames.get(3).getName());
                    jsonArray1.add("Present");
                    jsonObject.put("Student", jsonArray1);
                    jsonArray.add(jsonObject);*/
                    System.out.println(j + ". Student ID : " + stdNames.get(3).getId() +
                            " , Student Name : " + stdNames.get(3).getName() + " Was Present");
                } else if (stdNames.get(4).getId() == j){

                    jsonObject.put("id", stdNames.get(4).getId());
                    jsonObject.put("name", stdNames.get(4).getName());
                    jsonObject.put("last", stdNames.get(4).getFamily());
                    jsonObject.put("status", "Present");

                    studentArray.add(jsonObject);
                    /*JSONArray jsonArray1 = new JSONArray();
                    jsonArray1.add(stdNames.get(4).getId());
                    jsonArray1.add(stdNames.get(4).getName());
                    jsonArray1.add("Present");
                    jsonObject.put("Student", jsonArray1);
                    jsonArray.add(jsonObject);*/
                    System.out.println(j + ". Student ID : " + stdNames.get(4).getId() +
                            " , Student Name : " + stdNames.get(4).getName() + " Was Present");
                } else if (stdNames.get(5).getId() == j){

                    jsonObject.put("id", stdNames.get(5).getId());
                    jsonObject.put("name", stdNames.get(5).getName());
                    jsonObject.put("last", stdNames.get(5).getFamily());
                    jsonObject.put("status", "Present");

                    studentArray.add(jsonObject);
                    /*JSONArray jsonArray1 = new JSONArray();
                    jsonArray1.add(stdNames.get(5).getId());
                    jsonArray1.add(stdNames.get(5).getName());
                    jsonArray1.add("Present");
                    jsonObject.put("Student", jsonArray1);
                    jsonArray.add(jsonObject);*/
                    System.out.println(j + ". Student ID : " + stdNames.get(5).getId() +
                            " , Student Name : " + stdNames.get(5).getName() + " Was Present");
                } else if (stdNames.get(6).getId() == j){

                    jsonObject.put("id", stdNames.get(6).getId());
                    jsonObject.put("name", stdNames.get(6).getName());
                    jsonObject.put("last", stdNames.get(6).getFamily());
                    jsonObject.put("status", "Present");

                    studentArray.add(jsonObject);
                    /*JSONArray jsonArray1 = new JSONArray();
                    jsonArray1.add(stdNames.get(6).getId());
                    jsonArray1.add(stdNames.get(6).getName());
                    jsonArray1.add("Present");
                    jsonObject.put("Student", jsonArray1);
                    jsonArray.add(jsonObject);*/
                    System.out.println(j + ". Student ID : " + stdNames.get(6).getId() +
                            " , Student Name : " + stdNames.get(6).getName() + " Was Present");
                } else if (stdNames.get(7).getId() == j){

                    jsonObject.put("id", stdNames.get(7).getId());
                    jsonObject.put("name", stdNames.get(7).getName());
                    jsonObject.put("last", stdNames.get(7).getFamily());
                    jsonObject.put("status", "Present");

                    studentArray.add(jsonObject);
                    /*JSONArray jsonArray1 = new JSONArray();
                    jsonArray1.add(stdNames.get(7).getId());
                    jsonArray1.add(stdNames.get(7).getName());
                    jsonArray1.add("Present");
                    jsonObject.put("Student", jsonArray1);
                    jsonArray.add(jsonObject);*/
                    System.out.println(j + ". Student ID : " + stdNames.get(7).getId() +
                            " , Student Name : " + stdNames.get(7).getName() + " Was Present");
                } else if (stdNames.get(8).getId() == j){

                    jsonObject.put("id", stdNames.get(8).getId());
                    jsonObject.put("name", stdNames.get(8).getName());
                    jsonObject.put("last", stdNames.get(8).getFamily());
                    jsonObject.put("status", "Present");

                    studentArray.add(jsonObject);
                    /*JSONArray jsonArray1 = new JSONArray();
                    jsonArray1.add(stdNames.get(8).getId());
                    jsonArray1.add(stdNames.get(8).getName());
                    jsonArray1.add("Present");
                    jsonObject.put("Student", jsonArray1);
                    jsonArray.add(jsonObject);*/
                    System.out.println(j + ". Student ID : " + stdNames.get(8).getId() +
                            " , Student Name : " + stdNames.get(8).getName() + " Was Present");
                } else {
                    List<Student> allNames = selectNamesfromStudent();
                    for (int i = 0; i < size; i++) {
                        if (allNames.get(i).getId() == j) {

                            jsonObject.put("id", allNames.get(i).getId());
                            jsonObject.put("name", allNames.get(i).getName());
                            jsonObject.put("last", allNames.get(i).getFamily());
                            jsonObject.put("status", "Absent");

                            studentArray.add(jsonObject);
                           /* JSONArray jsonArray1 = new JSONArray();
                            jsonArray1.add(stdNames.get(i).getId());
                            jsonArray1.add(stdNames.get(i).getName());
                            jsonArray1.add("Absent");
                            jsonObject.put("Student", jsonArray1);
                            jsonArray.add(jsonObject)*/;
                            System.out.println(j + ". Student ID : " + allNames.get(i).getId() +
                                    " , Student Name : " + allNames.get(i).getName() + " Was Absent");
                        }

                    }

                }
            }

            counter = 8 - size;
            System.out.println("Number of absentees : " + counter);
        }

        return studentArray;
    }

    public void absentList4EachStudent() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter One Of These ID's");
        List<Student> allIDs = selectNamesfromStudent();
        System.out.println("        ------");
        for (Student s: allIDs){
            System.out.println("        |  " + s.getId() + "  |     ");
            System.out.println("        ------");
        }
        long stdID = input.nextLong();
        while (stdID < 1 || stdID > 8) {
            System.out.println("invalid input!, try again...");
            stdID = input.nextLong();
        }


        EntityManager entityManager = EntityFactory.getEntityManager();
        Query query = entityManager.
                createQuery("SELECT s.sessionses FROM student s JOIN s.sessionses WHERE s.id = :id");
        query.setParameter("id", stdID);

        List<Sessions> ses = query.getResultList();

        int size = (int) Math.sqrt(ses.size());
        int counter;

        //print output
        System.out.println("Athendence List for : " + allIDs.get((int) stdID - 1).getName());
        if(size == 12) {
            for (int i = 0; i < size; i++){
                counter = i + 1;
                System.out.println(counter + ". Present In Session ID : " + ses.get(i).getId() +
                        " , Session Name : " + ses.get(i).getsName());
            }
            System.out.println("Present in All Sessions!");
        }

        else {
            for (long j = 1; j < 13; j++) {
                if (ses.get(0).getId() == j) {
                    System.out.println(j + ". Present In Session ID : " + ses.get(0).getId() +
                            " , Session Name : " + ses.get(0).getsName());
                } else if (ses.get(1).getId() == j){
                    System.out.println(j + ". Present In Session ID : " + ses.get(1).getId() +
                            " , Session Name : " + ses.get(1).getsName());
                } else if (ses.get(2).getId() == j){
                    System.out.println(j + ". Present In Session ID : " + ses.get(2).getId() +
                            " , Session Name : " + ses.get(2).getsName());
                } else if (ses.get(3).getId() == j){
                    System.out.println(j + ". Present In Session ID : " + ses.get(3).getId() +
                            " , Session Name : " + ses.get(3).getsName());
                } else if (ses.get(4).getId() == j){
                    System.out.println(j + ". Present In Session ID : " + ses.get(4).getId() +
                            " , Session Name : " + ses.get(4).getsName());
                } else if (ses.get(5).getId() == j){
                    System.out.println(j + ". Present In Session ID : " + ses.get(5).getId() +
                            " , Session Name : " + ses.get(5).getsName());
                } else if (ses.get(6).getId() == j){
                    System.out.println(j + ". Present In Session ID : " + ses.get(6).getId() +
                            " , Session Name : " + ses.get(6).getsName());
                } else if (ses.get(7).getId() == j){
                    System.out.println(j + ". Present In Session ID : " + ses.get(7).getId() +
                            " , Session Name : " + ses.get(7).getsName());
                } else if (ses.get(8).getId() == j){
                    System.out.println(j + ". Present In Session ID : " + ses.get(8).getId() +
                            " , Session Name : " + ses.get(8).getsName());
                }  else if (ses.get(9).getId() == j){
                    System.out.println(j + ". Present In Session ID : " + ses.get(9).getId() +
                            " , Session Name : " + ses.get(9).getsName());
                }  else if (ses.get(10).getId() == j){
                    System.out.println(j + ". Present In Session ID : " + ses.get(10).getId() +
                            " , Session Name : " + ses.get(10).getsName());
                }  else if (ses.get(11).getId() == j){
                    System.out.println(j + ". Present In Session ID : " + ses.get(11).getId() +
                            " , Session Name : " + ses.get(11).getsName());
                }  else if (ses.get(12).getId() == j){
                    System.out.println(j + ". Present In Session ID : " + ses.get(12).getId() +
                            " , Session Name : " + ses.get(12).getsName());
                } else {
                    List<Sessions> allSessions = returnAllSessions();
                    for (int i = 0; i < 12; i++){
                        if (allSessions.get(i).getId() == j)
                            System.out.println(j + ". Absent  In Session ID : " + allSessions.get(i).getId() +
                                    " , Session Name : " + allSessions.get(i).getsName());
                    }
                }

            }
        }

    }

    //Query 3, 4
    public int total(int mid, int fin) {
        int midTemp = (mid*5)/20;
        int finTemp = (fin*15)/20;
        int total = midTemp + finTemp;
        return total;
    }

    public void acceptedList() {
        int counter = 1;
        List<Student> std = selectNamesfromStudent();
        for (int i = 0; i < 8; i++) {
            int mid = std.get(i).getMidMark();
            int fin = std.get(i).getFinalMark();
            int total = total(mid,fin);

            if (total >= 12 || (total < 12 && 11 <= total && std.get(i).getRecom() == 1 )) {
                System.out.println(counter + ". Student ID : " + std.get(i).getId() + ", Student Name : " + std.get(i).getName() + " Passed!");
            }
            else
                System.out.println(counter + ". Student ID : " + std.get(i).getId() + ", Student Name : " + std.get(i).getName() + " Failed!");

            counter++;
        }
    }

    public int acceptedListV1() {
        int acceptanceCounter = 0;
        List<Student> std = selectNamesfromStudent();
        for (int i = 0; i < 8; i++) {
            int mid = std.get(i).getMidMark();
            int fin = std.get(i).getFinalMark();
            int total = total(mid,fin);

            if (total >= 12 || (total < 12 && 11 <= total && std.get(i).getRecom() == 1 )) {
                acceptanceCounter++;
            }
        }
        return acceptanceCounter;
    }

    //Query 5, 6
    public void acceptancePercentage() {
        int accept = acceptedListV1();
        System.out.println(accept);
        float percentage = (accept*100.0f)/8;
        System.out.println(percentage);
        System.out.println("Acceptance Percentage is : " + percentage);
        if (percentage >= 50)
            System.out.println("Such a Effective Class!");
        else
            System.out.println("Oops!, The Class was not Effective!");

    }

    //Query 7
    public int presentCounter = 0;
    public void absentList4EachStudentV2(long stdID) {
        EntityManager entityManager = EntityFactory.getEntityManager();
        Query query = entityManager.
                createQuery("SELECT s.sessionses FROM student s JOIN s.sessionses WHERE s.id = :id");
        query.setParameter("id", stdID);

        List<Sessions> ses = query.getResultList();

        int size = (int) Math.sqrt(ses.size());
        int counter;

        //print output
        if(size == 12) {
            for (int i = 0; i < size; i++) {
                presentCounter = 10;
                counter = i + 1;
                System.out.println(counter + ". Present In Session ID : " + ses.get(i).getId() +
                        " , Session Name : " + ses.get(i).getsName());
            }
            System.out.println("Present in All Sessions!");
        }
        else {
            for (long j = 1; j < 13; j++) {
                if (ses.get(0).getId() == j) {
                    System.out.println(j + ". Present In Session ID : " + ses.get(0).getId() +
                            " , Session Name : " + ses.get(0).getsName());
                } else if (ses.get(1).getId() == j){
                    System.out.println(j + ". Present In Session ID : " + ses.get(1).getId() +
                            " , Session Name : " + ses.get(1).getsName());
                    presentCounter++;
                } else if (ses.get(2).getId() == j){
                    System.out.println(j + ". Present In Session ID : " + ses.get(2).getId() +
                            " , Session Name : " + ses.get(2).getsName());
                    presentCounter++;
                } else if (ses.get(3).getId() == j){
                    System.out.println(j + ". Present In Session ID : " + ses.get(3).getId() +
                            " , Session Name : " + ses.get(3).getsName());
                    presentCounter++;
                } else if (ses.get(4).getId() == j){
                    System.out.println(j + ". Present In Session ID : " + ses.get(4).getId() +
                            " , Session Name : " + ses.get(4).getsName());
                } else if (ses.get(5).getId() == j){
                    System.out.println(j + ". Present In Session ID : " + ses.get(5).getId() +
                            " , Session Name : " + ses.get(5).getsName());
                    presentCounter++;
                } else if (ses.get(6).getId() == j){
                    System.out.println(j + ". Present In Session ID : " + ses.get(6).getId() +
                            " , Session Name : " + ses.get(6).getsName());
                    presentCounter++;
                } else if (ses.get(7).getId() == j){
                    System.out.println(j + ". Present In Session ID : " + ses.get(7).getId() +
                            " , Session Name : " + ses.get(7).getsName());
                    presentCounter++;
                } else if (ses.get(8).getId() == j){
                    System.out.println(j + ". Present In Session ID : " + ses.get(8).getId() +
                            " , Session Name : " + ses.get(8).getsName());
                    presentCounter++;
                }  else if (ses.get(9).getId() == j){
                    System.out.println(j + ". Present In Session ID : " + ses.get(9).getId() +
                            " , Session Name : " + ses.get(9).getsName());
                    presentCounter++;
                }  else if (ses.get(10).getId() == j){
                    System.out.println(j + ". Present In Session ID : " + ses.get(10).getId() +
                            " , Session Name : " + ses.get(10).getsName());
                    presentCounter++;
                }  else if (ses.get(11).getId() == j){
                    System.out.println(j + ". Present In Session ID : " + ses.get(11).getId() +
                            " , Session Name : " + ses.get(11).getsName());
                    presentCounter++;
                } else {
                    List<Sessions> allSessions = returnAllSessions();
                    for (int i = 0; i < 12; i++){
                        if (allSessions.get(i).getId() == j)
                            System.out.println(j + ". Absent  In Session ID : " + allSessions.get(i).getId() +
                                    " , Session Name : " + allSessions.get(i).getsName());
                    }
                }

            }
        }

    }
    public void report() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter One Of These ID's");
        List<Student> std = selectNamesfromStudent();
        System.out.println("        ------");
        for (Student s: std){
            System.out.println("        |  " + s.getId() + "  |     ");
            System.out.println("        ------");
        }


        long stdID = input.nextLong();
        while (stdID < 1 || stdID > 8) {
            System.out.println("invalid input!, try again...");
            stdID = input.nextLong();
        }

        for (int i = 0; i < 8; i++) {
            if (std.get(i).getId() == stdID) {
                System.out.println("Report For : " + std.get(i).getName());
                System.out.println("Student ID : " + std.get(i).getId());
                System.out.println("Student Name : " + std.get(i).getName());
                System.out.println("Student Family : " + std.get(i).getFamily());
                System.out.println("Student Midterm Score : " + std.get(i).getMidMark());
                System.out.println("Student Final Score : " + std.get(i).getFinalMark());
                int total = total(std.get(i).getMidMark(),std.get(i).getFinalMark());
                System.out.println("Student Total Score : " + total);
                System.out.println("Student Present/Absent List : ");
                absentList4EachStudentV2(stdID);
                System.out.println("Total Number of Present Sessions : " + presentCounter);
                System.out.println("Total Number of Absent Sessions : " + (10 - presentCounter));
                presentCounter = 0;
            }
        }
    }

    //Query 8
    public int absentList4EachStudentV3(long stdID) {
        int present = 10;
        EntityManager entityManager = EntityFactory.getEntityManager();
        Query query = entityManager.
                createQuery("SELECT s.sessionses FROM student s JOIN s.sessionses WHERE s.id = :id");
        query.setParameter("id", stdID);

        List<Sessions> ses = query.getResultList();

        int size = (int) Math.sqrt(ses.size());

        if(size == 12)
                present = 10;
        else {
            for (long j = 1; j < size; j++) {
               if ((ses.get(4).getId() == j)||(ses.get(0).getId() == j))
                    present = present -1;
            }
        }
        return present;
    }

    public int absentList4EachStudentV4(long stdID) {

        int present = 10;
        EntityManager entityManager = EntityFactory.getEntityManager();
        Query query = entityManager.
                createQuery("SELECT s.sessionses FROM student s JOIN s.sessionses WHERE s.id = :id");
        query.setParameter("id", stdID);

        List<Sessions> ses = query.getResultList();

        int size = (int) Math.sqrt(ses.size());

        if (size == 12)
            present = 10;

        else {
            for (long j = 1; j < 6; j++) {
                if (ses.get(0).getId() == j) {
                } else if (ses.get(1).getId() == j) {
                } else if (ses.get(2).getId() == j) {
                } else if (ses.get(3).getId() == j) {
                } else if (ses.get(4).getId() == j) {
                } else if (ses.get(5).getId() == j) {
                } else if (ses.get(6).getId() == j) {
                } else if (ses.get(7).getId() == j) {
                } else if (ses.get(8).getId() == j) {
                } else if (ses.get(9).getId() == j) {
                } else if (ses.get(10).getId() == j) {
                } else if (ses.get(11).getId() == j) {
                } else {
                    present--;
                }

            }

            for (long j = 7; j < 12; j++) {
                if (ses.get(0).getId() == j) {
                } else if (ses.get(1).getId() == j) {
                } else if (ses.get(2).getId() == j) {
                } else if (ses.get(3).getId() == j) {
                } else if (ses.get(4).getId() == j) {
                } else if (ses.get(5).getId() == j) {
                } else if (ses.get(6).getId() == j) {
                } else if (ses.get(7).getId() == j) {
                } else if (ses.get(8).getId() == j) {
                } else if (ses.get(9).getId() == j) {
                } else if (ses.get(10).getId() == j) {
                } else if (ses.get(11).getId() == j) {
                } else {
                    present--;
                }

            }
        }
        return present;
    }
    public void verifiedList4FinalExam() {
        List<Student> std = selectNamesfromStudent();
        List<Student> stdVerified = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            int absentCounter = 10 - absentList4EachStudentV4(std.get(i).getId());
            if (absentCounter < 4) {
                stdVerified.add(std.get(i));
                absentCounter = 0;
            }
        }

        System.out.println("Verified List for Final Exam : ");
        System.out.println("        ------");
        for (Student s: stdVerified){
            System.out.println("        |  " + s.getId() + "  |     ");
            System.out.println("        ------");
        }

    }
}
