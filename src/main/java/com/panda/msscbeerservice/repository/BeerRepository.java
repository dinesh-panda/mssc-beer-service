package com.panda.msscbeerservice.repository;

import com.panda.msscbeerservice.model.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {

}
