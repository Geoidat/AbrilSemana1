package com.idat.AbrilServicio1.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.AbrilServicio1.dto.ProductoDTORequest;
import com.idat.AbrilServicio1.dto.ProductoDTOResponse;
import com.idat.AbrilServicio1.modelo.Productos;
import com.idat.AbrilServicio1.repositorio.ProductoRepositorio;

@Service
public class ProductoServicioImpl implements ProductoServicio {

	@Autowired
	public ProductoRepositorio repositorio;
	
	@Override
	public void guardarProducto(ProductoDTORequest producto) {
		Productos p = new Productos();
		p.setDescripcion(producto.getDescripcionDTO());
		p.setIdproducto(producto.getIdproductoDTO());
		p.setNombreproducto(producto.getNombreproductoDTO());
		p.setPrecio(producto.getPrecioDTO());
		p.setStock(producto.getStockDTO());
		repositorio.save(p);		
	}

	@Override
	public void editarProducto(ProductoDTORequest producto) {
		Productos p = new Productos();
		p.setDescripcion(producto.getDescripcionDTO());
		p.setIdproducto(producto.getIdproductoDTO());
		p.setNombreproducto(producto.getNombreproductoDTO());
		p.setPrecio(producto.getPrecioDTO());
		p.setStock(producto.getStockDTO());		
		repositorio.saveAndFlush(p);		
	}

	@Override
	public void eliminarProducto(Integer id) {
		repositorio.deleteById(id);		
	}

	@Override
	public List<ProductoDTOResponse> listarProductos() {
		
		List<ProductoDTOResponse> lista = new ArrayList<ProductoDTOResponse>();
		ProductoDTOResponse p = null; 
		
		for (Productos producto : repositorio.findAll()) {
			p = new ProductoDTOResponse();
			p.setDescripcionDTO(producto.getDescripcion());
			p.setIdproductoDTO(producto.getIdproducto());
			p.setNombreproductoDTO(producto.getNombreproducto());
			p.setPrecioDTO(producto.getPrecio());
			p.setStockDTO(producto.getStock());
			lista.add(p);
		}		
		return lista;
	}

	@Override
	public ProductoDTOResponse obtenerProductoId(Integer id) {
		
		Productos producto = repositorio.findById(id).orElse(null);
		
		ProductoDTOResponse p = new ProductoDTOResponse();
		p.setDescripcionDTO(producto.getDescripcion());
		p.setIdproductoDTO(producto.getIdproducto());
		p.setNombreproductoDTO(producto.getNombreproducto());
		p.setPrecioDTO(producto.getPrecio());
		p.setStockDTO(producto.getStock());
		return p;
	}
}
