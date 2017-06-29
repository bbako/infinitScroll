package org.cg.per;

import java.util.List;

import org.cg.dom.adVO;

public interface AdmakerDAO {

	public void insert(adVO vo);
	
	public List<adVO> all();
	
	public int gettotal(); 

	public List<adVO> getlist(String count);
	
}
