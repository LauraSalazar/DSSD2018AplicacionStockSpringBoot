package dbaccess.dao.impl;

import org.springframework.transaction.annotation.Transactional;

import dbaccess.dto.CompraEmpleadoDTO;
import model.CompraEmpleado;


public class CompraEmpleadoDAO extends GenericDAO{

	@Transactional
	public CompraEmpleadoDTO create(Integer idProducto,Integer idEmpleado,String strDate) {

		System.out.println("Llega al dao de compra empleado");
		CompraEmpleado cemp = new CompraEmpleado();
		cemp.setFecha(strDate);
		cemp.setIdEmpleado(idEmpleado);
		cemp.setIdProducto(idProducto);
		this.getEntityManager().getTransaction().begin();
		this.getEntityManager().persist(cemp);
		this.getEntityManager().getTransaction().commit();
		
		return new CompraEmpleadoDTO(cemp);
	}
	
}
