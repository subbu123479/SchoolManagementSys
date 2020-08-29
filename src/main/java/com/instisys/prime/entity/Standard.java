package com.instisys.prime.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="tbl_standard",schema = "school")
@Setter
@Getter
@ToString

public class Standard {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name="class_number")
    private Long classNumber;


    @Column(name="date_created")
    private Date createdOn;

    @Column(name="last_updated")
    private Date updatedOn;

    @OneToMany(cascade=CascadeType.ALL, mappedBy="standard")
    private Set<Section> section;

    @ManyToOne
    @JoinColumn(name="term_id", nullable=false)
    private Term term;

    @OneToMany(cascade=CascadeType.ALL, mappedBy="standard1")
    private Set<Subject> subject;


}
