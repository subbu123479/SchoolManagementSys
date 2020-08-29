package com.instisys.prime.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="tbl_admission",schema = "school")
@Setter
@Getter
@ToString

public class Admission {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name="class_number")
     private int classNumber;

    @Column(name="date_of_birth")
     private Date dateofBirth;

    @Column(name="term_id")
     private Long termId;
     


    @Column(name="date_created")
    private Date createdOn;

    @Column(name="last_updated")
    private Date updatedOn;
}
