package web.service;

import java.util.List;

import dbaccess.dao.impl.ProductoDAO;
import dbaccess.dto.ProductoDTO;
import model.Producto;
import model.TipoProducto;

public class ProductoService {

	ProductoDAO productoDAO;
	
	public ProductoService(){
		super();
		productoDAO = new ProductoDAO();
	}

public ProductoDTO getProducto(Integer id){
return (productoDAO.getProducto(id));
}

public List<ProductoDTO> getAll(){
List<ProductoDTO> productosDTO = productoDAO.getAll();
return (productosDTO);
}

public List<ProductoDTO> getByType(Integer type){

List<ProductoDTO> productosDTO = productoDAO.getByType(type);
return (productosDTO);

}

public Integer create(String name,Double costPrice,Double salePrice,TipoProducto tipoProducto){
return productoDAO.create(new Producto(name, costPrice,salePrice,tipoProducto));
}



}
