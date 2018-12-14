package web.service;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import dbaccess.dao.impl.CompraProductoDAO;
import dbaccess.dto.CompraProductoDTO;

public class CompraProductoService {
	
	CompraProductoDAO compraProductoDAO;
	
	public CompraProductoService(){
		super();
		compraProductoDAO = new CompraProductoDAO();
	}
	
	public CompraProductoDTO addCompraProducto(Integer idProducto,Double ganancia) {
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String strDate = dateFormat.format(date);
		return compraProductoDAO.create(idProducto,ganancia,strDate);
	}

}
