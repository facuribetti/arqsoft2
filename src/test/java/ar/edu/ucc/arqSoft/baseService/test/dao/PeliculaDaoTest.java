package ar.edu.ucc.arqSoft.baseService.test.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ar.edu.ucc.arqSoft.baseService.dao.PeliculaDao;
import ar.edu.ucc.arqSoft.baseService.model.Pelicula;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml", "classpath:/spring/applicationContext.xml" })
@Transactional 
public class PeliculaDaoTest {

	private static final Logger logger = LogManager.getLogger(SocioDaoTest.class);

	@Autowired
	private PeliculaDao peliculaDao;
	
	@Test
	public void testInsert() {
		logger.info("test de insert de una pelicula");
		
		Pelicula pelicula = new Pelicula();
		pelicula.setTitulo("the dark knight");
		pelicula.setAnio(2008);
		pelicula.setSinopsis("sertsera");
	
		
		peliculaDao.insert(pelicula);
		
		//Assert.assertEquals("the dark knight", pelicula.getTitulo());
		Assert.assertEquals(3, pelicula.getId().longValue());
		
		return;
	}
	
	
	@Test
	public void testFinfById() {
		logger.info("test de busqueda de un socio por su ID");
		Pelicula pelicula = peliculaDao.load((long)1);
		logger.info(pelicula);
		Assert.assertEquals("IT", pelicula.getTitulo());
	}
	
	@Test
	public void testUpdate() {
	
		logger.info("Test de actulización de un socio");
		Pelicula pelicula = peliculaDao.load((long) 1);
		pelicula.setTitulo("batman");
		peliculaDao.update(pelicula);
		
		Pelicula pelicula1 = peliculaDao.load((long) 1);
		Assert.assertEquals("batman", pelicula1.getTitulo());
		return;
	}
	
	@Test
	public void testGetAll() {
		
		logger.info("Test de busqueda de todos los socios");
		List<Pelicula> peliculas= peliculaDao.getAll();
		Assert.assertNotNull(peliculas);
		return;
	}
}
