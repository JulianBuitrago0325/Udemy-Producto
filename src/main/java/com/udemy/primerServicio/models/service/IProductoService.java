package com.udemy.primerServicio.models.service;

import java.util.List;

import com.udemy.primerServicio.models.entity.Producto;

public interface IProductoService {
	
	public List<Producto> findAll();
	public Producto findById(Long id);
}
