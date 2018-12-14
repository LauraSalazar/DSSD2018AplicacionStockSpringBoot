package dbaccess.dao.impl;

import org.springframework.transaction.annotation.Transactional;


import dbaccess.dto.CompraProductoDTO;

import model.CompraProducto;

public class CompraProductoDAO extends GenericDAO{

	@Transactional
	public CompraProductoDTO create(Integer idProducto, Double ganancia,String strDate) {

		CompraProducto cprod = new CompraProducto();
		cprod.setFecha(strDate);
		cprod.setGanancia(ganancia);
		cprod.setIdProducto(idProducto);
		this.getEntityManager().getTransaction().begin();
		this.getEntityManager().persist(cprod);
		this.getEntityManager().getTransaction().commit();
		
		return new CompraProductoDTO(cprod);
	}
}
