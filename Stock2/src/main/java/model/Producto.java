package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name="Product")
public class Producto {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="costprice")
	private Double costPrice;
	@Column(name="saleprice")
	private Double salePrice;
	@ManyToOne(optional=false)
	private TipoProducto tipoProducto;


	public Producto(String name, Double costPrice, Double salePrice, TipoProducto tipoProducto) {
	
		super();

		this.name = name;
		this.costPrice = costPrice;
		this.salePrice = salePrice;
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

	public TipoProducto getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(TipoProducto tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public Producto(){

	}
}
