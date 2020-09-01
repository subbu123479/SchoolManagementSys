package com.instisys.prime.repository;

import com.instisys.prime.entity.Faculty;
import com.instisys.prime.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource(collectionResourceRel="faculty", path="faculty")
public interface FacultyRepository extends JpaRepository<Faculty, Long> {

    @Query("FROM Faculty f WHERE f.standard =:standard and f.section=:section")
    List<Faculty> findByStandardAndSection(@Param("standard") String standard, @Param("section") String section);

    @Query("FROM Faculty f WHERE f.department =:department and f.designation=:designation")
    List<Faculty> findByDepartmentAndDesignation(@Param("department") String standard, @Param("designation") String designation);

    @Query("FROM Faculty f WHERE f.className =:class_name and f.standard=:standard")
    List<Faculty> findByClassNameAndStandard(@Param("class_name") String className, @Param("standard") String standard);
}

