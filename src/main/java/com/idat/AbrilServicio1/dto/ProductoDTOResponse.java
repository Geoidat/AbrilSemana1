package com.idat.AbrilServicio1.dto;

public class ProductoDTOResponse {
	
	private Integer idproductoDTO;
	private String nombreproductoDTO;
	private String descripcionDTO;
	private Double precioDTO;
	private Integer stockDTO;
	
	public Integer getIdproductoDTO() {
		return idproductoDTO;
	}
	public void setIdproductoDTO(Integer idproductoDTO) {
		this.idproductoDTO = idproductoDTO;
	}
	public String getNombreproductoDTO() {
		return nombreproductoDTO;
	}
	public void setNombreproductoDTO(String nombreproductoDTO) {
		this.nombreproductoDTO = nombreproductoDTO;
	}
	public String getDescripcionDTO() {
		return descripcionDTO;
	}
	public void setDescripcionDTO(String descripcionDTO) {
		this.descripcionDTO = descripcionDTO;
	}
	public Double getPrecioDTO() {
		return precioDTO;
	}
	public void setPrecioDTO(Double precioDTO) {
		this.precioDTO = precioDTO;
	}
	public Integer getStockDTO() {
		return stockDTO;
	}
	public void setStockDTO(Integer stockDTO) {
		this.stockDTO = stockDTO;
	}
}



