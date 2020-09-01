package com.instisys.prime.repository;

import com.instisys.prime.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource(collectionResourceRel="student", path="student-search")
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("from Student  where stdName = :student_name")
    List<Student> findByStdName(@Param("student_name") String stdName);

    @Query("FROM Student s WHERE s.standard =:standard and s.section=:section")
    List<Student> findByStandardAndSection(@Param("standard") String standard, @Param("section") String section);

    @Query("select s from Student s join Leave s1 on s.stdName = s1.studentName")
    List<Student> findAllByStdName();

    @Query("FROM Student s WHERE  s.currentAddress=:current_address")
    List<Student> findByCurrentAddress( @Param("current_address") String currentAddress);


}

