package com.socrates.repository;

import com.socrates.domain.Post;
import com.socrates.domain.Tag;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "tags")
public interface TagRepository extends PagingAndSortingRepository<Tag, Long> {


}
