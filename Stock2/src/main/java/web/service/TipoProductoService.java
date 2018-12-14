package web.service;

import java.util.List;

import dbaccess.dao.impl.TipoProductoDAO;
import dbaccess.dto.TipoProductoDTO;
import model.TipoProducto;

public class TipoProductoService {

	TipoProductoDAO tipoProductoDAO;

	public TipoProductoService() {
		super();
		tipoProductoDAO = new TipoProductoDAO();
	}

	public TipoProductoDTO getById(Integer id) {
		return (tipoProductoDAO.findById(id));
	}
	
	public List<TipoProductoDTO> getTipos( ) {
		return (tipoProductoDAO.getTipos());
	}
}
