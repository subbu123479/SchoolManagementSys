package com.instisys.prime.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="tbl_attendance",schema = "school")
@Setter
@Getter
@ToString

public class Attendance {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name="stud_id")
    private Long studId;

    @Column(name="sec_id")
    private Long secId;

    @Column(name="user_id")
    private Long userId;

    private String status;


}
