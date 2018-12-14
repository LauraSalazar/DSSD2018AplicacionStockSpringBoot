package dbaccess.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;

import dbaccess.dto.ProductoDTO;
import model.Producto;

public class ProductoDAO  extends GenericDAO{


	public Integer create(Producto prod){
		this.getEntityManager().getTransaction().begin();
		this.getEntityManager().persist(prod);
		this.getEntityManager().getTransaction().commit();
		return prod.getId();

	} 
	
	//Recupera un productoDTO con un id dado
	public ProductoDTO getProducto(Integer id){
		Producto producto = null;
		ProductoDTO productoDTO = null;
		System.out.println("valor de id antes de la query: " + id);
		String query = "from Product a where a.id = :id ";
		try {
		if (!this.getEntityManager().createQuery(query).setParameter("id", id).getResultList().isEmpty()){
		producto = (Producto)this.getEntityManager().createQuery(query).setParameter("id", id).getSingleResult();
		}
		if (producto != null){
			this.getEntityManager().refresh(producto);
			 productoDTO = new ProductoDTO(producto);
					}
		//System.out.println("valor de nombre de productoDTO despues de la query" + productoDTO.getName());
		}
		catch(NoResultException e) {
			return null;
		}
		return productoDTO;
		
	}
	
	public Producto findById(Integer id){	
		String query = "from Product a where a.id = :id ";
		Producto prod = null;
		try {
		  prod = (Producto) this.getEntityManager().createQuery(query).setParameter("id", id).getSingleResult();
		}
		catch(NoResultException e) {
			return null;
		}
		return prod;
	}
	
	//Retorna todos los productos de un tipo en especifico
	
	public List<ProductoDTO> getByType(Integer typeProduct){
		List<Producto> products = null;
		List<ProductoDTO> productsDTO = null;
		String query = "from Product p where p.tipoProducto.id = :typeProduct  ";
		try {
        
		products = (List<Producto>)this.getEntityManager().createQuery(query).setParameter("typeProduct", typeProduct).getResultList();
		productsDTO = new ArrayList<ProductoDTO>();
		for(Producto a : products){
			this.getEntityManager().refresh(a);
			productsDTO.add(new ProductoDTO(a));
		}
		}
		catch(NoResultException e) {
			return null;
		}
		return productsDTO;
	
	}
	
	public List<ProductoDTO> getAll(){
		List<Producto> products = null;
		List<ProductoDTO> productsDTO = null;
		String query = "from Product ";
		try {
		products = (List<Producto>)this.getEntityManager().createQuery(query).getResultList();
		productsDTO = new ArrayList<ProductoDTO>();
		for(Producto a : products){
			this.getEntityManager().refresh(a);
			productsDTO.add(new ProductoDTO(a));
		}
		}
		catch(NoResultException e) {
			return null;
		}
		return productsDTO;
	}

}
