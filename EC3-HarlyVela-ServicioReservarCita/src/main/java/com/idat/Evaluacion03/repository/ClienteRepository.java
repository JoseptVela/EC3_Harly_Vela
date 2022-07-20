package com.idat.Evaluacion03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.Evaluacion03.model.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer>{

}
