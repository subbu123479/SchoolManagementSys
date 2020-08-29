package com.instisys.prime.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="tbl_section",schema = "school")
@Setter
@Getter
@ToString

public class Section {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="section_name")
    private String sectionName;

    @Column(name="class_id")
    private Long classId;

    @Column(name="faculty_id")
    private Long facultyId;

    @Column(name="term_id")
    private Long termId;


    @Column(name="date_created")
    private Date createdOn;

    @Column(name="last_updated")
    private Date updatedOn;


    @ManyToOne
    @JoinColumn(name="standard_id", nullable=false)
    private Standard standard;
}
