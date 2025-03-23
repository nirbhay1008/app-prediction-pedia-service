package com.PredictionWebApp.repo;

import com.PredictionWebApp.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ItemRepo extends JpaRepository<Item,Long> {
}
