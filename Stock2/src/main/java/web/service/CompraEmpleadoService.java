package web.service;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import dbaccess.dao.impl.CompraEmpleadoDAO;
import dbaccess.dao.impl.ProductoDAO;
import dbaccess.dto.CompraEmpleadoDTO;


public class CompraEmpleadoService {
	
	CompraEmpleadoDAO compraEmpleadoDAO;
	
	public CompraEmpleadoService(){
		super();
		compraEmpleadoDAO = new CompraEmpleadoDAO();
	}

	public CompraEmpleadoDTO addCompraEmpleado(Integer idProducto,Integer idEmpleado) {
		
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String strDate = dateFormat.format(date);
		return compraEmpleadoDAO.create(idProducto,idEmpleado,strDate);
	}

}