package com.instisys.prime.repository;

import com.instisys.prime.entity.Parents;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentRepository extends JpaRepository<Parents, Long> {
}
