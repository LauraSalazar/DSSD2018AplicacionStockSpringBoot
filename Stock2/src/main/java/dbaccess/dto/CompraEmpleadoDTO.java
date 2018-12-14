package dbaccess.dto;

import javax.persistence.Column;

import model.CompraEmpleado;
import model.CompraProducto;

public class CompraEmpleadoDTO {
	private Integer id;

	private Integer idProducto;
	
	private Integer idEmpleado;

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

	public CompraEmpleadoDTO(Integer id, Integer idProducto, Integer idEmpleado, String fecha) {
		super();
		this.id = id;
		this.idProducto = idProducto;
		this.idEmpleado = idEmpleado;
		this.fecha = fecha;
		}
	
	public CompraEmpleadoDTO(CompraEmpleado cemp) {
		super();

		this.id = cemp.getId();
		this.fecha = cemp.getFecha();
		this.idEmpleado = cemp.getIdEmpleado();
		this.idProducto = cemp.getIdProducto();
	}
}
