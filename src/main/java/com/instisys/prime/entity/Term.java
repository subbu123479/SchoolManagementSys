package com.instisys.prime.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="tbl_term",schema = "school")
@Setter
@Getter
@ToString

public class Term {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="start_date")
    private Date startDate;

    @Column(name="end_date")
     private Date endDate;


    @Column(name="date_created")
    private Date createdOn;

    @Column(name="last_updated")
    private Date updatedOn;

    @OneToMany(cascade=CascadeType.ALL, mappedBy="term")
    private Set<Standard> term;

}
