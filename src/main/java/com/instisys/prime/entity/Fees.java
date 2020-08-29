package com.instisys.prime.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="tbl_fees",schema = "school")
@Setter
@Getter
@ToString

public class Fees {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name="fee_name")
    private String feeName;

    @Column(name="school_id")
    private String schoolId;

    @Column(name="user_id")
    private String userId;

    @Column(name="fee_amt")
    private Long feeAmount;

    @Column(name="paid_on")
    private Date paidOn;

    @Column(name="date_created")
    private Date createdOn;

    @Column(name="last_updated")
    private Date updatedOn;
}
