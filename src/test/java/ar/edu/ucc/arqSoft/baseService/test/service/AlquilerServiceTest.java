package ar.edu.ucc.arqSoft.baseService.test.service;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ar.edu.ucc.arqSoft.baseService.dao.AlquilerDao;
import ar.edu.ucc.arqSoft.baseService.test.dao.AlquilerDaoTest;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml", "classpath:/spring/applicationContext.xml" })
public class AlquilerServiceTest {

	private static final Logger logger = LogManager.getLogger(AlquilerDaoTest.class);
	
	@Autowired
	private AlquilerDao alquilerDao;
}
