package com.formacionbdi.springboot.app.item.models.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.formacionbdi.springboot.app.item.clientes.ProductoClienteRest;
import com.formacionbdi.springboot.app.item.models.Item;
import com.formacionbdi.springboot.app.commons.models.entity.Producto;

@Service("serviceFeing")
@Primary
public class ItemServiceFeing implements ItemService {
	
	@Autowired
	private ProductoClienteRest ClienteFeing;

	@Override
	public List<Item> findAll() {

		return ClienteFeing.listar().stream().map(p -> new Item(p,1)).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id, Integer cantidad) {
		System.out.println("hola dos veces");
		return new Item(ClienteFeing.Detalle(id), cantidad);
	}

	@Override
	public Producto save(Producto producto) {
		
		return ClienteFeing.crear(producto);
	}

	@Override
	public Producto update(Producto producto, Long id) {
		// TODO Auto-generated method stub
		return ClienteFeing.update(producto, id);
	}

	@Override
	public void delete(Long id) {
		
		ClienteFeing.eliminar(id);
	}

}
