package com.socrates.repository;

import com.socrates.domain.Post;
import com.socrates.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {


}
