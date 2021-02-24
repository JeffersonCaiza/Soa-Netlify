package com.example.demoSoa.services;

import java.util.List;

import com.example.demoSoa.modelos.Cliente;

public interface IClienteService 
{
	Cliente create (Cliente c);
	
	Cliente update (Cliente c);
	
	Cliente findById (Integer id);
	
	List<Cliente> findall ();
	
	void delete(Integer id);

}