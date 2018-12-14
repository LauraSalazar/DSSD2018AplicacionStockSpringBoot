package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="compraEmpleado")
public class CompraEmpleado {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	@Column(name="idProducto")
	private Integer idProducto;
	@Column(name="idEmpleado")
	private Integer idEmpleado;
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
	public CompraEmpleado(Integer id, Integer idProducto, Integer idEmpleado, String fecha) {
		super();
		this.id = id;
		this.idProducto = idProducto;
		this.idEmpleado = idEmpleado;
		this.fecha = fecha;
	}
	public CompraEmpleado(){

	}
}
