package com.instisys.prime.repository;

import com.instisys.prime.entity.Faculty;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.instisys.prime.entity.Book;

import java.util.List;
@RepositoryRestResource(collectionResourceRel="book", path="book")
public interface BookRepository extends JpaRepository<Book, Long>{
	


	@RestResource(path = "categoryid")
	Page<Book> findByCategoryId(@Param("id") Long id, Pageable pageable);
	


	@RestResource(path = "searchbykeyword")
	Page<Book> findByNameContaining(@Param("name") String keyword, Pageable pageable);

	@Query("FROM Book b WHERE b.active = true")
	List<Book> findByActive();

	@Query("FROM Book b WHERE b.unitsInStock > 0 and b.active = true")
	List<Book> findByUnitsInStockAndActive();


}
