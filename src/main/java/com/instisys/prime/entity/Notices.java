package com.instisys.prime.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="tbl_notices",schema = "school")
@Setter
@Getter
@ToString

public class Notices {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="notice_name")
    private String noticeName;

    private String subject;
    @Column(name="date_of_issue")
    private Date dateOfIssue;

    private String classes;

    private String place;

    private String venue;

    @Column(name="authorised_sign")
    private String authorisedSignatory;

    @Column(name="date_created")
    private Date createdOn;

    @Column(name="last_updated")
    private Date updatedOn;
}
