package org.cg.cont;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.cg.per.AdmakerDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class LibraryTest {
	
	private static final Logger logger =Logger.getLogger(LibraryTest.class) ;
	
	private static final String namespace = "org.cg.per";

	@Inject
	SqlSessionTemplate sess;
	
	@Inject
	AdmakerDAO dao;
	
	@Test
	public void libTest() throws Exception{
		
		dao.all();
		
	}
	
	
}
