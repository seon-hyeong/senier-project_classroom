package com.seon.project;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.seon.project.model.AssignVO;
import com.seon.project.model.User;
import com.seon.project.service.AssignService;
import com.seon.project.service.ClassService;
import com.seon.project.service.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	@Autowired
	MemberService service;

	// 회원가입 get
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView getRegiser(User user) throws Exception {
		ModelAndView view = new ModelAndView();
		view.setViewName("register");
		//service.register(user);
		
		return view;
	}
	
	// 회원가입 post
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView postRegister(User user, ModelMap model, HttpServletRequest request) throws Exception{
		
		ModelAndView view = new ModelAndView();
		view.setViewName("redirect:/login");
		String isMaster = request.getParameter("isMaster");
		
		HttpSession session = request.getSession();
		session.setAttribute("isMaster", isMaster);
		
		service.register(user);
		System.out.println("user: "+user);
		
		return view;
	}
	
	// 로그인
	@ResponseBody
	@RequestMapping(value = "/loginUser")
	public ModelAndView loginUser(User user, Model model, HttpServletRequest request, RedirectAttributes redirectAttributes){
		ModelAndView view = new ModelAndView();
		User result = service.loginUser(user);

		System.out.println("result: "+result);
		
		String userId = request.getParameter("userId"); //사용자 id값 받아오기
		String passWord = request.getParameter("passWord"); //사용자 pw값 받아오기	
		
		HttpSession session = request.getSession();
		session.setAttribute("userName", userId);

		if(result==null) {
			view.setViewName("redirect:/login");
			//req.setAttribute("message", "틀림");
			//model.addAttribute("message", "틀림");
			redirectAttributes.addFlashAttribute("message","ID나 PW가 틀렸습니다."+ "다시 입력해주세요");
			//model.addAttribute("message", "틀림");
			return view;
			
		}else { //로그인 성공
			session.setAttribute("userName", userId);
			session.setAttribute("userId", result.getUserName());
			session.setAttribute("isMaster",result.getIsMaster());
			
			view.addObject("isMaster",result.getIsMaster());
			
			view.setViewName("redirect:/");

			//view.addObject("message","틀림");
			return view;
		}
	}
	
	 //로그아웃
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public ModelAndView logout(HttpSession session) throws Exception{
		
		session.invalidate();
		
		ModelAndView view = new ModelAndView();
		view.setViewName("redirect:/");
		return view;
	}
	
	//마이룸
	@RequestMapping(value = "/myRoom", method=RequestMethod.GET)
	public ModelAndView myRoom(User user,Model model,HttpServletRequest request) {
		ModelAndView view = new ModelAndView();
		view.setViewName("myRoom");
		
		HttpSession session = request.getSession();
		String userId = (String) session.getAttribute("userName");
		String isMaster = (String) session.getAttribute("isMaster");
		
		model.addAttribute("list", service.myList(userId));
		System.out.println("사용자 아이디" + userId);
		System.out.println("isMaster" + isMaster);
		
		return view;
	}
	
	@RequestMapping(value = "Calendar", method=RequestMethod.GET)
	public String Calendar() {
		return "/Calendar";
	}

}
