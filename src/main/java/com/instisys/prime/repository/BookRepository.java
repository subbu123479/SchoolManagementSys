package com.instisys.prime.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.instisys.prime.entity.Book;

public interface BookRepository extends PagingAndSortingRepository<Book, Long>{
	


	@RestResource(path = "categoryid")
	Page<Book> findByCategoryId(@Param("id") Long id, Pageable pageable);
	


	@RestResource(path = "searchbykeyword")
	Page<Book> findByNameContaining(@Param("name") String keyword, Pageable pageable);
}
