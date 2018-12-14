package com.Stock2.Stock2;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CompraProductoXml {
	@XmlElement
	private Integer id;
	@XmlElement
	private Integer idProducto;
	@XmlElement
	private Double ganancia;
	@XmlElement
	private String fecha;
	public Integer getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	public Double getGanancia() {
		return ganancia;
	}
	public void setGanancia(Double ganancia) {
		this.ganancia = ganancia;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public CompraProductoXml(Integer id, Integer idProducto, Double ganancia, String fecha) {
		super();
		this.id = id;
		this.idProducto = idProducto;
		this.ganancia = ganancia;
		this.fecha = fecha;
	}
	

}
