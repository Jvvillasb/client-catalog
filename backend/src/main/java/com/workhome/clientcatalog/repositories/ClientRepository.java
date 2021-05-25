package com.workhome.clientcatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workhome.clientcatalog.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
