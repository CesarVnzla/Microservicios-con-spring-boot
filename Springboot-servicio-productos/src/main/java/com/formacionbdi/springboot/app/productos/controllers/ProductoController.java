package com.formacionbdi.springboot.app.productos.controllers;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.formacionbdi.springboot.app.commons.models.entity.Producto;
import com.formacionbdi.springboot.app.productos.models.service.IProductosService;

@RestController
public class ProductoController {
	
	//@Autowired
	//private Environment envirome;
	
	@Value("${server.port}")
	private Integer port;
	
	@Autowired
	private IProductosService productoService;
	
	
	@GetMapping("/listar")
	public List<Producto> Listar() {
		
		
		return productoService.findAll().stream().map(producto -> {
			//producto.setPort(Integer.parseInt( envirome.getProperty("local.server.port")));
			producto.setPort(port);
			return producto;
		}).collect( Collectors.toList());
		
	}
	
	
	@GetMapping("/ver/{id}")
	public Producto Detalle(@PathVariable Long id ) {
		
		Producto producto = productoService.findById(id);
		
		//producto.setPort(Integer.parseInt( envirome.getProperty("local.server.port")));
		producto.setPort(port);
		
		//boolean ok = false;
		
		/*if (ok == false ) {
			
			throw new Exception("no se pudo cargar el producto");
		}*/
		
		/*try {
			Thread.sleep(4000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		return producto;
	}
	
	@PostMapping("/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public Producto crear(@RequestBody Producto producto) {
		
		return productoService.save(producto);
	}
	
	@PutMapping("/editar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Producto editar(@RequestBody Producto producto, @PathVariable Long id) {
		
		Producto productoBd = productoService.findById(id);
		
		productoBd.setNombre(producto.getNombre());
		productoBd.setPrecio(producto.getPrecio());
		
		return productoService.save(productoBd);
		
	}
	
	@DeleteMapping("/eliminar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar(@PathVariable Long id) {
		
		productoService.deleteById(id);
	 
	}
	
	
	
	

}
