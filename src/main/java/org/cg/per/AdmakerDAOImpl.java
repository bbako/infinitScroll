package org.cg.per;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.cg.dom.adVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AdmakerDAOImpl implements AdmakerDAO {
	
	private static final String namespace = "org.cg.per";
	
	@Inject
	SqlSessionTemplate sess;

	@Override
	public void insert(adVO vo) {
		sess.insert(namespace+".dummy", vo);
	}



	@Override
	public List<adVO> all() {
		return sess.selectList(namespace+".all");
	}



	@Override
	public int gettotal() {

		return sess.selectOne(namespace+".gettotal");
	}



	@Override
	public List<adVO> getlist(String count) {
		return sess.selectList(namespace+".getlist", count);
	}





	

}
