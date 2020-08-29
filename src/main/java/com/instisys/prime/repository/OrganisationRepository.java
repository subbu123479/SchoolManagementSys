package com.instisys.prime.repository;

import com.instisys.prime.entity.Organisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface OrganisationRepository extends JpaRepository<Organisation, Long> {



}
