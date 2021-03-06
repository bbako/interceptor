package org.zerock.web;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.UserVO;
import org.zerock.dto.LoginDTO;
import org.zerock.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Inject
	private UserService service;
	
	@GetMapping("/login")
	public void loginGET(@ModelAttribute("dto") LoginDTO dto){
		
	}
	
	@PostMapping("/loginPost")
	public void loginPOST(LoginDTO dto,HttpSession session,Model model) throws Exception{
		
		UserVO vo = service.login(dto);
		
		if(vo == null){
			return;
		}
		
		model.addAttribute("userVO", vo);
		
		
	}
	
	
	
	
	
	
	
}
