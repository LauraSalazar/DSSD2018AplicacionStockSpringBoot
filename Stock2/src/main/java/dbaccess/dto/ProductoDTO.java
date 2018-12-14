package dbaccess.dto;

import model.Producto;

public class ProductoDTO {

	private Integer id;
	private String name;
	private Double costPrice;
	private Double salePrice;
	private Integer tipoProducto;

	public String toString() {
		return (" Producto id: " + this.getId() + " Producto name " + this.getName());
	}

	public Integer getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(Integer tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

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

	public ProductoDTO(Producto prod) {
		super();

		this.id = prod.getId();
		this.name = prod.getName();
		this.salePrice = prod.getSalePrice();
		this.costPrice = prod.getCostPrice();
		this.tipoProducto = prod.getTipoProducto().getId();
	}

}
