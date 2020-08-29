package com.instisys.prime.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="tbl_leave",schema = "school")
@Setter
@Getter
@ToString

public class Leave {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="faculty_name")
    private String facultyName;

    @Column(name="student_name")
    private String studentName;

    @Column(name="reg_no")
    private Long regNo;

    @Column(name="faculty_id")
    private Long facultyId;

    @Column(name="from_date")
    private Date fromDate;

    @Column(name="to_date")
    private Date toDate;

    @Column(name="leave_type")
    private String leaveType;

    private String description;


    @Column(name="date_created")
    private Date createdOn;

    @Column(name="last_updated")
    private Date updatedOn;
}
