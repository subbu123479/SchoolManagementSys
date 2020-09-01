package com.instisys.prime.repository;

import com.instisys.prime.entity.Book;
import com.instisys.prime.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource(collectionResourceRel="user", path="user")
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("FROM User u WHERE u.role=:role  and u.active = true")
    List<User> findByRoleAndActive(@Param("role") String role);

}
