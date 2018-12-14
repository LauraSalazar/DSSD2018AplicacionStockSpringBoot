package com.Stock2.Stock2;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TipoXml {

	@XmlElement
	private Integer id;
	@XmlElement
	private String description;
	@XmlElement
	private String initials;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getInitials() {
		return initials;
	}
	public void setInitials(String initials) {
		this.initials = initials;
	}
	
	public TipoXml() {
	}
	
	public TipoXml(Integer id, String description, String initials) {
		super();
		this.id = id;
		this.description = description;
		this.initials = initials;
	}
	
}
