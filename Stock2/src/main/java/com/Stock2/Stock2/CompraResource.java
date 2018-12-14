package com.Stock2.Stock2;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import web.service.CompraEmpleadoService;
import web.service.CompraProductoService;


@CrossOrigin
@RestController
public class CompraResource {
	
	CompraProductoService compraProductoService;
	CompraEmpleadoService compraEmpeladoService;
	
	public CompraResource() {
		super();
		
		 compraProductoService = new CompraProductoService();
		 compraEmpeladoService = new CompraEmpleadoService();
	}
	
	@CrossOrigin
	@RequestMapping(value = "/compraNormal/{idProducto}/{ganancia}",produces = "application/json")
	public void guardarCompraNormal(@PathVariable("idProducto") Integer idProducto
			,@PathVariable("ganancia") Double ganancia){
		System.out.println("Entra en servicio compra empleado con parametros idProducto " + idProducto + " y ganancia" + ganancia);
		compraProductoService.addCompraProducto(idProducto,ganancia);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/compraEmpleado/{idProducto}/{idEmpleado}",produces = "application/json")
	public void guardarCompraEmpleado(@PathVariable("idProducto") Integer idProducto
			,@PathVariable("idEmpleado") Integer idEmpleado){
		System.out.println("Entra en servicio compra empleado con parametros idProducto" + idProducto + "idEmpleado" + idEmpleado);
		compraEmpeladoService.addCompraEmpleado(idProducto,idEmpleado);
	}

}
