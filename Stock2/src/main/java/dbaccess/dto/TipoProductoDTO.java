package dbaccess.dto;

import model.TipoProducto;

public class TipoProductoDTO {
	
	private Integer id;
	private String initials;
	private String description;


	public String toString() {
		return (" Tipo Producto id: " + this.getId() + " Tipo Producto initials " + this.getInitials());
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getInitials() {
		return initials;
	}



	public void setInitials(String initials) {
		this.initials = initials;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public TipoProductoDTO(TipoProducto tipoProd) {
		super();

		this.id = tipoProd.getId();
		this.initials = tipoProd.getInitials();
		this.description = tipoProd.getDescription();

	}



}
