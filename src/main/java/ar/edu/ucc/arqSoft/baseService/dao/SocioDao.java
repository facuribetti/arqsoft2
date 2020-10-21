package ar.edu.ucc.arqSoft.baseService.dao;

import java.util.List;

import ar.edu.ucc.arqSoft.baseService.model.Socio;
import ar.edu.ucc.arqSoft.common.dao.GenericDao;

public interface SocioDao extends GenericDao<Socio, Long> {

	public List<Socio> findByName(String name);
	
}
