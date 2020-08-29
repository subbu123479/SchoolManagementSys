package com.instisys.prime.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="tbl_subject",schema = "school")
@Setter
@Getter
@ToString

public class Subject {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name="sub_name")
    private String subName;

    @Column(name="sub_code")
    private String subcode;

    @Column(name="faculty_id")
    private Long facultyId;

    @Column(name="date_created")
    private Date createdOn;

    @Column(name="last_updated")
    private Date updatedOn;

    @ManyToOne
    @JoinColumn(name="standard_id", nullable=false)
    private Standard standard1;
}
