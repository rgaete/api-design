package com.socrates.repository;

import com.socrates.domain.Post;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "comments")
public interface CommentRepository extends PagingAndSortingRepository<Post, Long> {


}
