package com.instisys.prime.repository;

import com.instisys.prime.entity.Book;
import com.instisys.prime.entity.Section;
import com.instisys.prime.entity.Standard;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(collectionResourceRel="Standard", path="Standard")
public interface StandardRepository extends JpaRepository<Standard, Long> {

   /* @RestResource(path = "sectionid")
    Page<Standard> findBySectionId(@Param("id") Long id, Pageable pageable);

    *//*
     * list of books by name contains
     * *//*
    @RestResource(path = "searchbykeyword")
    Page<Standard> findByNameContaining(@Param("name") String keyword, Pageable pageable);*/

}
