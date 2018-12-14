package com.Stock2.Stock2;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProductoXml {

	@XmlElement
	private Integer id;
	@XmlElement
	private String name;
	@XmlElement
	private Double costPrice;
	@XmlElement
	private Double salePrice;

	@XmlElement
	// Nombre del tipo de producto
	private Integer tipoProducto;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(Double costPrice) {
		this.costPrice = costPrice;
	}

	public Double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

	public Integer getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(Integer tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public ProductoXml() {
	}

	public ProductoXml(Integer id, String name, Double salePrice, Double costPrice, Integer tipoProducto) {
		super();
		this.id = id;
		this.name = name;
		this.salePrice = salePrice;
		this.costPrice = costPrice;
		this.tipoProducto = tipoProducto; 

	}

}
