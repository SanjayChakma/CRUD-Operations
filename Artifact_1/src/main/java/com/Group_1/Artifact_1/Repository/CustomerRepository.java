package com.Group_1.Artifact_1.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Group_1.Artifact_1.Entity.Customers;

@Repository
public interface CustomerRepository extends CrudRepository<Customers, Integer> {

}
