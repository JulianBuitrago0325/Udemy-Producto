package com.udemy.primerServicio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.primerServicio.models.entity.Producto;
import com.udemy.primerServicio.models.service.ProductoService;

@RestController
public class ProductoController {

	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/listar")
	public List<Producto> listar() {
		return productoService.findAll();
	}
	
	@GetMapping("/ver/{id}")
	public Producto detalle(@PathVariable Long id) {
		return productoService.findById(id);
	}
}
