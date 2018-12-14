package com.Stock2.Stock2;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CompraEmpleadoXml {
	@XmlElement
	private Integer id;
	@XmlElement
	private Integer idProducto;
	@XmlElement
	private Integer idEmpleado;
	@XmlElement
	private String fecha;
	public Integer getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	public Integer getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
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
	public CompraEmpleadoXml(Integer id, Integer idProducto, Integer idEmpleado, String fecha) {
		super();
		this.id = id;
		this.idProducto = idProducto;
		this.idEmpleado = idEmpleado;
		this.fecha = fecha;
	}
	
	
}
