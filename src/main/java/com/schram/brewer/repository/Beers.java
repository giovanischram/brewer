package com.schram.brewer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.schram.brewer.model.Beer;

@Repository
public interface Beers extends JpaRepository<Beer, Long> {

	
}