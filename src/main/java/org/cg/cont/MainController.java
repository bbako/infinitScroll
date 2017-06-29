package org.cg.cont;

import java.util.List;

import javax.inject.Inject;

import org.cg.dom.adVO;
import org.cg.per.AdmakerDAO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

@Controller
@RequestMapping("/main")
public class MainController {

	@Inject
	AdmakerDAO dao;

	@GetMapping("/g2")
	public void main2(Model model) {
		System.out.println("11111111");
		dao.gettotal();
		model.addAttribute("list", dao.all());
		dao.gettotal();

	}

	@PostMapping("/g2")
	public ResponseEntity<List<adVO>> employeelist(@RequestParam("bno") String bno) {
		
		System.out.println("들어옴 ?");
		System.out.println(bno);
	
		
		//System.out.println(dao.all());
		/*model.addAttribute("list", dao.all());
		String json = gson.toJson(dao.all());
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject(json);*/
		ResponseEntity<List<adVO>> entity = null;
		try{
			entity= new ResponseEntity<>(dao.getlist(bno),HttpStatus.OK);
		}catch (Exception e) {
			entity= new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		 System.out.println(entity);

		return entity;
	}

}
