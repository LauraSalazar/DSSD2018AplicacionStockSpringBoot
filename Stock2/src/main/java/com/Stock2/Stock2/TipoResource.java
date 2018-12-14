package com.Stock2.Stock2;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpCookie;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dbaccess.dto.TipoProductoDTO;
import web.service.TipoProductoService;

@RestController
public class TipoResource {
	
	TipoProductoService tipoProductoService;

	public TipoResource() {
		super();
		 tipoProductoService = new TipoProductoService();
	}
	@CrossOrigin
	@RequestMapping(value = "/listadoTipoProductos",produces = "application/json")
	public List<TipoXml> getTipoProductos() {

		TipoXml tipoXml = null;
		List<TipoProductoDTO> tipoProductoDTOs = tipoProductoService.getTipos();
		
		List<TipoXml> tipoXmls = new ArrayList<TipoXml>();
		if (tipoProductoDTOs != null) {
			tipoXmls = new ArrayList<TipoXml>();
			for (TipoProductoDTO tipoProductoDTO : tipoProductoDTOs) {
			//System.out.println("Antes de ProductoXml");
			tipoXml = new TipoXml();
			tipoXml.setId(tipoProductoDTO.getId());
			tipoXml.setDescription(tipoProductoDTO.getDescription());
			tipoXml.setInitials(tipoProductoDTO.getInitials());
			tipoXmls.add(tipoXml);
			}
		}
		return tipoXmls;
	}
	
	@CrossOrigin
	@RequestMapping(value = "/tipoProductoPorId/{tipoProductoId}",produces = "application/json")
	public TipoXml getproducto(@PathVariable("tipoProductoId") Integer id) {

		TipoXml tipoProdXml = new TipoXml();
		TipoProductoDTO tipoProductoDTO = tipoProductoService.getById(id);
		//List<ProductoXml> productosXml = null;
		if (tipoProductoDTO != null) {
			System.out.println("Antes de ProductoXml");
			//productosXml = new ArrayList<ProductoXml>();
			tipoProdXml = new TipoXml();
			tipoProdXml.setId(tipoProductoDTO.getId());
			tipoProdXml.setDescription(tipoProductoDTO.getDescription());
			tipoProdXml.setInitials(tipoProductoDTO.getInitials());
			//productosXml.add(prodXml);
		}
		return tipoProdXml;
	}
	

	
	
	
}
