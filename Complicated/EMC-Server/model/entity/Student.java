package model.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;


@Entity (name = "student")
@Table (name = "STUDENT")
public class Student implements Serializable {

    @Id
    @SequenceGenerator(name = "studentSeq", sequenceName = "STUDENT_SEQ")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "studentSeq")
    @Column(name = "STD_ID", unique = true, nullable = false)
    private long id;
    @Column(name = "NAME", columnDefinition = "VARCHAR2(33)")
    private String name;
    @Column(name = "FAMILY", columnDefinition = "VARCHAR2(33)")
    private String family;
    @Column(name = "MID", columnDefinition = "INT")
    private int midMark;
    @Column(name = "FIN", columnDefinition = "INT")
    private int finalMark;
    @Column(name = "RECOM", columnDefinition = "INT")
    private int recom;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "students")
    //@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    //@JoinTable(name = "SS",
    //        joinColumns = {@JoinColumn(name = "StID", referencedColumnName = "id") }, inverseJoinColumns = {@JoinColumn(name = "SeID", referencedColumnName = "id") })

    private Set<Sessions> sessionses;

    public Set<Sessions> getSessionses() {
        return sessionses;
    }

    public void setSessionses(Set<Sessions> sessionses) {
        this.sessionses = sessionses;
    }

    public int getRecom() {
        return recom;
    }

    public int isRecom() {
        return recom;
    }

    public void setRecom(int recom) {
        this.recom = recom;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getMidMark() {
        return midMark;
    }

    public void setMidMark(int midMark) {
        this.midMark = midMark;
    }

    public int getFinalMark() {
        return finalMark;
    }

    public void setFinalMark(int finalMark) {
        this.finalMark = finalMark;
    }
}
