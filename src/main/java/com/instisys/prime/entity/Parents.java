package com.instisys.prime.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="tbl_parents",schema = "school")
@Setter
@Getter
@ToString

public class Parents {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    @Column(name="mobile_no")
    private Long mobileNo;

    @Column(name="std_name_studying")
    private String stdNameStudying;

    @Column(name="date_created")
    private Date createdOn;

    @Column(name="last_updated")
    private Date updatedOn;
}
