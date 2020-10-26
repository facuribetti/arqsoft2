package ar.edu.ucc.arqSoft.baseService.test.service;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ar.edu.ucc.arqSoft.baseService.dto.AlquilerRequestDto;
import ar.edu.ucc.arqSoft.baseService.dto.AlquilerResponseDto;
import ar.edu.ucc.arqSoft.baseService.service.AlquilerService;
import ar.edu.ucc.arqSoft.baseService.test.dao.AlquilerDaoTest;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml", "classpath:/spring/applicationContext.xml" })
public class AlquilerServiceTest {

	private static final Logger logger = LogManager.getLogger(AlquilerDaoTest.class);
	
	@Autowired
	private AlquilerService alquilerService;
	
	@Test 
	public void testInsert() {
		
		logger.info("test de alquilerService");
		
		AlquilerRequestDto request = new AlquilerRequestDto();
		request.setPeliculaId((long)1);
		request.setSocioId((long)1);
		
		AlquilerResponseDto response = alquilerService.registrarAlquiler(request);
		
		Assert.assertEquals("IT", response.getTitulo());
		Assert.assertEquals("Ribetti", response.getApellido());
		
		return;
	}

	
	
	
}
