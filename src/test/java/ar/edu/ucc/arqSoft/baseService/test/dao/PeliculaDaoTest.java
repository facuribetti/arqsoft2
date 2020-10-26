package ar.edu.ucc.arqSoft.baseService.test.dao;

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
public class PeliculaDaoTest {

	private static final Logger logger = LogManager.getLogger(SocioDaoTest.class);

	@Autowired
	private PeliculaDao peliculaDao;
	
	@Test
	public void testInsert() {
		logger.info("test de insert de una pelicula");
		
		Pelicula pelicula = new Pelicula();
		pelicula.setTitulo("the dark knight");
		
		peliculaDao.insert(pelicula);
		
		//Assert.assertEquals("the dark knight", pelicula.getTitulo());
		Assert.assertEquals(3, pelicula.getId().longValue());
		
		return;
	}
}
