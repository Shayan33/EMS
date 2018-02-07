package model;

import javafx.beans.property.SimpleStringProperty;

public class Student {

    private final SimpleStringProperty name;
    private final SimpleStringProperty last;
    private final SimpleStringProperty id;
    private final SimpleStringProperty status;


    public Student(String name,String last, String id, String status){
        this.name = new SimpleStringProperty(name);
        this.last = new SimpleStringProperty(last);
        this.id = new SimpleStringProperty(id);
        this.status = new SimpleStringProperty(status);

    }

    public String getName() {
        return name.get();
    }

    public void setName(String nam) {
        name.set(nam);
    }

    public String getLast() {
        return last.get();
    }

    public void setLast(String las) {
        last.set(las);
    }

    public String getId() {
        return id.get();
    }

    public void setId(String stID) {
        id.set(stID);
    }

    public String getStatus() {
        return status.get();
    }

    public void setStatus(String statuss) {
        status.set(statuss);
    }




}