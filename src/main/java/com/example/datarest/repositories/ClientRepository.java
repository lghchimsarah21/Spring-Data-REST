package com.example.datarest.repositories;

import com.example.datarest.entities.Client;

import com.example.datarest.entities.TypeCompte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client, Long> {
    @RestResource(path = "/byType")
    List<Client> findByComptesType(@Param("t") TypeCompte type);

}
