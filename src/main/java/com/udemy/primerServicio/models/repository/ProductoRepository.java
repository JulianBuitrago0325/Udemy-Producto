package com.udemy.primerServicio.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.udemy.primerServicio.models.entity.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long>{

}