package com.instisys.prime.repository;
import com.instisys.prime.entity.Admission;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AdmissionRepository extends JpaRepository<Admission, Long> {
}
