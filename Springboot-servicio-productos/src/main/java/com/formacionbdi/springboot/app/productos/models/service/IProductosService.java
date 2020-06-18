package com.formacionbdi.springboot.app.productos.models.service;

import java.util.List;

import com.formacionbdi.springboot.app.commons.models.entity.Producto;

public interface IProductosService {
	
	public List<Producto> findAll();
	public Producto findById( Long id );
	
	public Producto save(Producto producto);
	public void deleteById(Long id);

}