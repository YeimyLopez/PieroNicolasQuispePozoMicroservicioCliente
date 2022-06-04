package com.example.demo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Cliente;
import com.example.demo.repository.ClienteRepository;
@Service
public class ClienteServiceImpl implements ClienteServicio {


	@Autowired
	private ClienteRepository repository;
	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
