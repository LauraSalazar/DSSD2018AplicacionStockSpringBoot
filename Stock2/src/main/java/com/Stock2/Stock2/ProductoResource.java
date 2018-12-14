package com.Stock2.Stock2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dbaccess.dto.ProductoDTO;
import web.service.ProductoService;

@CrossOrigin
@RestController
public class ProductoResource {
	
	ProductoService productoService;

	public ProductoResource() {
		super();
		productoService = new ProductoService();
	}
	

	/*@GET
	@Path("/{productoId}")*/
	@CrossOrigin
	@RequestMapping(value = "/productoPorId/{productoId}",produces = "application/json")
	public ProductoXml getproducto(@PathVariable("productoId") Integer id) {

		ProductoXml prodXml = new ProductoXml();
		ProductoDTO productoDTO = productoService.getProducto(id);
		//List<ProductoXml> productosXml = null;
		if (productoDTO != null) {
			System.out.println("Antes de ProductoXml");
			//productosXml = new ArrayList<ProductoXml>();
			prodXml = new ProductoXml();
			prodXml.setId(productoDTO.getId());
			prodXml.setCostPrice(productoDTO.getCostPrice());
			prodXml.setSalePrice(productoDTO.getSalePrice());
			prodXml.setName(productoDTO.getName());
			prodXml.setTipoProducto(productoDTO.getTipoProducto());
			//productosXml.add(prodXml);
		}
		return prodXml;
	}
	
	//Listado Productos por tipo
/*	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/listadoproductosportipo")*/
	@CrossOrigin
	@RequestMapping(value = "/listadoproductosportipo/{tipoProducto}",produces = "application/json")
	public List<ProductoXml> getproductosportipo(@PathVariable("tipoProducto") Integer tipoProducto) {

		List<ProductoXml> productosXml =  new ArrayList<ProductoXml>();
		List<ProductoDTO> productosDTO;
        ProductoXml prodXml = null;
			productosDTO = productoService.getByType(tipoProducto);
			
			if (productosDTO != null) {

				for (ProductoDTO productoDTO : productosDTO) {
					System.out.println("Este es el id de productoDTO en ProductoResource" + productoDTO.getId());
					prodXml = new ProductoXml();
					prodXml.setId(productoDTO.getId());
					prodXml.setCostPrice(productoDTO.getCostPrice());
					prodXml.setSalePrice(productoDTO.getSalePrice());
					prodXml.setName(productoDTO.getName());
					prodXml.setTipoProducto(productoDTO.getTipoProducto());
					productosXml.add(prodXml);
				}
			} 

		return productosXml;

	}





}
