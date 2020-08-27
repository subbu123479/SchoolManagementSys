package com.instisys.prime.repository;

import com.instisys.prime.entity.Section;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StandardRepository extends JpaRepository<Section, Long> {
}
