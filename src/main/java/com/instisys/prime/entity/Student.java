package com.instisys.prime.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="tbl_student",schema = "school")
@Setter
@Getter
@ToString

public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;


    @Column(name="admission_id")
    private Long admissionId;

    @Column(name="student_name")
    private String stdName;

    @Column(name="father_name")
    private String fatherName;

    @Column(name="mother_name")
    private String motherName;

    @Column(name="mobile_no")
    private Long mobileNo;

    @Column(name="emergency_contact_no")
    private Long emergencyContactNo;

    @Column(name="father_occupation")
    private String fatherOcuupation;

    @Column(name="permanenet_address")
    private String permanentAddress;

    @Column(name="current_address")
    private String currentAddress;

    private String standard;

    private String section;

    @Column(name="joining_date")
    private Date joiningDate;

    @Column(name="digital_sign")
    private String digitalSign;

    @Column(name="date_created")
    private Date createdOn;

    @Column(name="last_updated")
    private Date updatedOn;

}
