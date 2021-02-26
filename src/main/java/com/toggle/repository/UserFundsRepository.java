package com.toggle.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.toggle.model.Feature;

@RepositoryRestResource(collectionResourceRel = "user_funds", path = "user_funds")
public interface UserFundsRepository extends CrudRepository<Feature, Integer> {
}