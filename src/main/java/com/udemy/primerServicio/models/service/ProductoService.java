package com.udemy.primerServicio.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.udemy.primerServicio.models.entity.Producto;
import com.udemy.primerServicio.models.repository.ProductoRepository;

@Service
public class ProductoService implements IProductoService{

	@Autowired
	private ProductoRepository productorepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		return (List<Producto>) productorepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long id) {
		return productorepository.findById(id).orElse(null);
	}

}
