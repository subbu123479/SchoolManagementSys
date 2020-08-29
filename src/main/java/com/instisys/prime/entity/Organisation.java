package com.instisys.prime.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="tbl_organisation",schema = "school")
@Setter
@Getter
@ToString

public class Organisation {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="org_name")
    private String orgName;

    @Column(name="established_year")
    private String establishedYear;

    private String about;

    private String medium;

    @Column(name="school_code")
    private String schoolCode;

    private String accredition;

    private String branch;


    @Column(name="date_created")
    private Date createdOn;

    @Column(name="last_updated")
    private Date updatedOn;


}
