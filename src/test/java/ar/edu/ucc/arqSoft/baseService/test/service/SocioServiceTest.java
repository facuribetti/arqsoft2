package ar.edu.ucc.arqSoft.baseService.test.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ar.edu.ucc.arqSoft.baseService.dto.SocioRequestDto;
import ar.edu.ucc.arqSoft.baseService.dto.SocioResponseDto;
import ar.edu.ucc.arqSoft.baseService.service.SocioService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml", "classpath:/spring/applicationContext.xml" })
public class SocioServiceTest {
	@Autowired
	private SocioService socioService;
	
	@Test
	public void testInsert() {
		SocioRequestDto request = new SocioRequestDto();
		
		request.setNombre("Facundo");
		request.setApellido("Ribetti");
		request.setDni(40417597);
		request.setEmail("1705317@ucc.edu.ar");
		
		SocioResponseDto response = socioService.insertSocio(request);
		
		Assert.assertEquals("Facundo", response.getNombre());
		Assert.assertEquals("Ribetti", response.getApellido());
		return;
	}
}
