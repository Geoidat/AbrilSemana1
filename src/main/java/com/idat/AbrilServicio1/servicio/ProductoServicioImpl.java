package com.idat.AbrilServicio1.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.AbrilServicio1.modelo.Productos;
import com.idat.AbrilServicio1.repositorio.ProductoRepositorio;

@Service
public class ProductoServicioImpl implements ProductoServicio {

	@Autowired
	public ProductoRepositorio repositorio;
	
	@Override
	public void guardarProducto(Productos producto) {
		repositorio.save(producto);		
	}

	@Override
	public void editarProducto(Productos producto) {
		repositorio.saveAndFlush(producto);		
	}

	@Override
	public void eliminarProducto(Integer id) {
		repositorio.deleteById(id);		
	}

	@Override
	public List<Productos> listarProductos() {
		return repositorio.findAll();
	}

	@Override
	public Productos obtenerProductoId(Integer id) {
		return repositorio.findById(id).orElse(null);
	}
}
