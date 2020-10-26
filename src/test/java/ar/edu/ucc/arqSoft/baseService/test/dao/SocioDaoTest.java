package ar.edu.ucc.arqSoft.baseService.test.dao;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ar.edu.ucc.arqSoft.baseService.dao.SocioDao;
import ar.edu.ucc.arqSoft.baseService.model.Socio;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml", "classpath:/spring/applicationContext.xml" })
public class SocioDaoTest {
	
	private static final Logger logger = LogManager.getLogger(SocioDaoTest.class);

	@Autowired
	private SocioDao socioDao;
	
	@Test
	public void testInsert() {

		logger.info("test de insert de un socio");
		Socio socio = new Socio();
		socio.setNombre("facundo");
		
		socioDao.insert(socio);
		
		Assert.assertEquals(2, socio.getId().longValue());
		return;

	}
	
	@Test
	public void testFinfById() {
		logger.info("test de busqueda de un socio por su ID");
		Socio socio = socioDao.load((long)1);
		logger.info(socio);
		Assert.assertEquals("Facundo", socio.getNombre());
	}
	
	@Test
	public void testUpdate() {
	
		logger.info("Test de actulización de un socio");
		Socio socio = socioDao.load((long) 1);
		socio.setNombre("Agustin");
		socioDao.update(socio);
		
		Socio socio1 = socioDao.load((long) 1);
		Assert.assertEquals("Agustin", socio1.getNombre());
		return;
	}
	
	@Test
	public void testGetAll() {
		
		logger.info("Test de busqueda de todos los socios");
		List<Socio> socios= socioDao.getAll();
		Assert.assertNotNull(socios);
		return;
	}
	
	
	}
