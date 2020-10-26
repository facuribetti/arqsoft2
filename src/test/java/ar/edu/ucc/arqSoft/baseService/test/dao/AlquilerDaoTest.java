package ar.edu.ucc.arqSoft.baseService.test.dao;

import java.util.Date;

import javax.transaction.Transactional;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ar.edu.ucc.arqSoft.baseService.dao.AlquilerDao;
import ar.edu.ucc.arqSoft.baseService.model.Alquiler;
import ar.edu.ucc.arqSoft.baseService.model.Pelicula;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml", "classpath:/spring/applicationContext.xml" })
@Transactional 
public class AlquilerDaoTest {

	private static final Logger logger = LogManager.getLogger(AlquilerDaoTest.class);

	@Autowired
	private AlquilerDao alquilerDao;
	
	@Test
	public void testInsert() {
		logger.info("test de insert de un alquiler");
		
		Alquiler alquiler = new Alquiler();
		
		@SuppressWarnings("deprecation")
		Date date = new Date(2020,1,1);
		alquiler.setFechaAlquiler(date);
	

		alquilerDao.insert(alquiler);
		
		Assert.assertEquals(date,alquiler.getFechaAlquiler());
		
		return;
	}
}
