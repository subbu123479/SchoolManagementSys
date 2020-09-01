package com.instisys.prime.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.awt.*;
import java.util.Date;

@Entity
@Table(name="tbl_faculty",schema = "school")
@Setter
@Getter
@ToString

public class Faculty {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="faculty_name")
    private String facultyName;

    @Column(name="class_name")
    private String className;

    @Column(name="class_id")
    private Long classId;

    private String designation;

    private String department;

    @Column(name="joining_date")
    private Date joiningDate;

    private String gender;

    @Column(name="mobile_no")
    private Long mobileNo;

    @Column(name="emergency_contact_no")
    private Long emergencyContactNo;

    @Column(name="father_occupation")
    private String fatherOccupation;

    @Column(name="permanent_address")
    private String permanentAddress;

    @Column(name="current_address")
    private String curentAddress;

    private String standard;

    private String section;



    @Column(name="digital_sign")
    private String digitalSignPath;


    @Column(name="date_created")
    private Date createdOn;

    @Column(name="last_updated")
    private Date updatedOn;
}
