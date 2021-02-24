package com.example.demoSoa.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoSoa.modelos.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> 
{

}
