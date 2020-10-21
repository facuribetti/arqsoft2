package ar.edu.ucc.arqSoft.baseService.dao;

import java.util.List;

import ar.edu.ucc.arqSoft.baseService.model.Pelicula;
import ar.edu.ucc.arqSoft.common.dao.GenericDao;

public interface PeliculaDao extends GenericDao<Pelicula, Long> {

	public List<Pelicula> findByTitulo(String titulo);
	
}
