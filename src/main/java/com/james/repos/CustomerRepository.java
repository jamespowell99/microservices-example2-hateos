package com.james.repos;

import com.james.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

/**
 * Created by jpowel on 15/03/2017.
 */
@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long>{
    Optional<Customer> findByName(@Param("name") String name);
}
