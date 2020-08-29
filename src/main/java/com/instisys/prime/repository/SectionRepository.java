package com.instisys.prime.repository;

import com.instisys.prime.entity.Book;
import com.instisys.prime.entity.Section;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;


public interface SectionRepository extends JpaRepository<Section, Long> {


   /* @RestResource(path = "categoryid")
    Page<Book> findByCategoryId(@Param("id") Long id, Pageable pageable);



    @RestResource(path = "searchbykeyword")
    Page<Book> findByNameContaining(@Param("name") String keyword, Pageable pageable);*/
}
