package com.socrates.repository;

import com.socrates.domain.Doctor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "doctors",exported = false)
public interface DoctorRepository extends PagingAndSortingRepository<Doctor, Long> {


}
