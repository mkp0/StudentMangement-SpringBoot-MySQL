package com.student.student.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_info")
public class StudentEntity {
    @Id
    @Column(name = "sid")
    private int id;

    @Column(name= "sname")
    private String sName;

    @Column(name= "sphone")
    private String sPhone;

    @Column(name = "scity")
    private String sCity;


    public int getId() {
        return id;
    }
    public String getsName() {
        return sName;
    }
    public String getsPhone() {
        return sPhone;
    }
    public String getsCity() {
        return sCity;
    }

    @Override
    public String toString() {
        return "StudentEntity [id=" + id + ", sName=" + sName + ", sPhone=" + sPhone + ", sCity=" + sCity + "]";
    }
    public StudentEntity() {
    }
    public StudentEntity(int id, String sName, String sPhone, String sCity) {
        this.id = id;
        this.sName = sName;
        this.sPhone = sPhone;
        this.sCity = sCity;
    }

    
       
}
