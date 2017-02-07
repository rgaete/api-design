package com.socrates.repository;

import com.socrates.domain.Slot;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "slots")
public interface SlotRepository extends PagingAndSortingRepository<Slot, Long> {


}
