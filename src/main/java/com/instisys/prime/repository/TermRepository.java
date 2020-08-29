package com.instisys.prime.repository;

import com.instisys.prime.entity.Term;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="standard", path="term")

public interface TermRepository extends JpaRepository<Term, Long> {
}
