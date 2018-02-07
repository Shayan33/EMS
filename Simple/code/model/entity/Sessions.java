package model.entity;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@Entity (name = "sessions")
@Table (name = "SESSIONS")
public class Sessions implements Serializable {

    @Id
    @SequenceGenerator(name = "sessionSeq", sequenceName = "SESSIONS_SEQ")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "sessionSeq")
    @Column(name = "SESSION_ID", unique = true, nullable = false)
    private long id;

    @Column(name = "SessionName", columnDefinition = "VARCHAR2(33)")
    private String sName;

    @ManyToMany
    @JoinTable(name = "SS",
            joinColumns = {@JoinColumn(name = "SESSION_ID", referencedColumnName = "SESSION_ID") },
            inverseJoinColumns = {@JoinColumn(name = "STD_ID", referencedColumnName = "STD_ID") })

    private Set<Student> students;

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
}
