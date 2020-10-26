package ar.edu.ucc.arqSoft.baseService.test.service;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ar.edu.ucc.arqSoft.baseService.dao.PeliculaDao;
import ar.edu.ucc.arqSoft.baseService.dto.PeliculaRequestDto;
import ar.edu.ucc.arqSoft.baseService.dto.PeliculaResponseDto;
import ar.edu.ucc.arqSoft.baseService.service.PeliculaService;
import ar.edu.ucc.arqSoft.baseService.test.dao.PeliculaDaoTest;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml", "classpath:/spring/applicationContext.xml" })
public class PeliculaServiceTest {

	private static final Logger logger = LogManager.getLogger(PeliculaDaoTest.class);
	
	@Autowired
	private PeliculaService peliculaService;
	
	@Test
	public void testFindById() {
		
		logger.info("Test de encontrar una pelicula por su ID");
		
		PeliculaResponseDto response = peliculaService.getPeliculaById((long)1);
		
		Assert.assertEquals("IT", response.getTitulo());
		
		return;
	}
	
}
