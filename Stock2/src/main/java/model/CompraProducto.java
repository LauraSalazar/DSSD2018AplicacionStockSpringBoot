package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="compraNormal")
public class CompraProducto {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	@Column(name="idProducto")
	private Integer idProducto;
	@Column(name="ganancia")
	private Double ganancia;
	@Column(name="fecha")
	private String fecha;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
	public CompraProducto(Integer id, Integer idProducto, Double ganancia, String fecha) {
		super();
		this.id = id;
		this.idProducto = idProducto;
		this.ganancia = ganancia;
		this.fecha = fecha;
	}

	public CompraProducto(){

	}
}
