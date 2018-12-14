package dbaccess.dao.impl;

import model.Producto;
import model.TipoProducto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;

import dbaccess.dto.ProductoDTO;
import dbaccess.dto.TipoProductoDTO;

public class TipoProductoDAO extends GenericDAO {

	public Integer create(Producto prod) {
		this.getEntityManager().getTransaction().begin();
		this.getEntityManager().persist(prod);
		this.getEntityManager().getTransaction().commit();
		return prod.getId();

	}

	public TipoProductoDTO findById(Integer id) {
		String query = "from productType a where a.id = :id ";
		TipoProducto tipoProducto = null;
		try {
		tipoProducto = (TipoProducto) this.getEntityManager().createQuery(query).setParameter("id", id)
				.getSingleResult();
		}
		catch(NoResultException e) {
			return null;
		}
		return new TipoProductoDTO(tipoProducto);
	}

	public List<TipoProductoDTO> getTipos() {
		String query = "from productType ";
		List<TipoProductoDTO> tipoProductosDTO = null;
		try {
		List<TipoProducto> tipoProductos = (List<TipoProducto>) this.getEntityManager().createQuery(query)
				.getResultList();
		if (tipoProductos != null) {
			tipoProductosDTO = new ArrayList<TipoProductoDTO>();
			for (TipoProducto a : tipoProductos) {
				this.getEntityManager().refresh(a);
				tipoProductosDTO.add(new TipoProductoDTO(a));
			}
		}
		}
		catch(NoResultException e) {
			return null;
		}
		return tipoProductosDTO;
	}

}
