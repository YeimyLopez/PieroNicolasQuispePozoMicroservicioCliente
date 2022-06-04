package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.modelo.Cliente;
import com.example.demo.servicio.ClienteServicio;

@Controller
@RequestMapping("/cliente/v1")
public class ClienteController {
	@Autowired
	private ClienteServicio service;
	
	@GetMapping(path = "/listar")
	public @ResponseBody List<Cliente> listar(){
		return service.listar();
	}

}
