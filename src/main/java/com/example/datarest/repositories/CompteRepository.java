package com.example.datarest.repositories;

import com.example.datarest.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface CompteRepository extends JpaRepository<Compte, Long> {
}