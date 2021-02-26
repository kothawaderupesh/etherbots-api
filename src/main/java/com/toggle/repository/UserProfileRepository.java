package com.toggle.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.toggle.model.UserProfile;

@RepositoryRestResource(collectionResourceRel = "user_profile", path = "user_profile")
public interface UserProfileRepository extends CrudRepository<UserProfile, Integer> {

}