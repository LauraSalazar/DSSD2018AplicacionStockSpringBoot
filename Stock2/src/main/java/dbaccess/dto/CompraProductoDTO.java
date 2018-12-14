package dbaccess.dto;

import javax.persistence.Column;

import model.CompraProducto;
import model.Producto;

public class CompraProductoDTO {
	private Integer id;

	private Integer idProducto;

	private Double ganancia;

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

	public CompraProductoDTO(Integer id, Integer idProducto, Double ganancia, String fecha) {
		super();
		this.id = id;
		this.idProducto = idProducto;
		this.ganancia = ganancia;
		this.fecha = fecha;
	}
	
	public CompraProductoDTO(CompraProducto cprod) {
		super();

		this.id = cprod.getId();
		this.fecha= cprod.getFecha();
		this.ganancia = cprod.getGanancia();
		this.idProducto = cprod.getIdProducto();
	}
}
