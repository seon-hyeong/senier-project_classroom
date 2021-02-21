package com.seon.project;

import java.util.ArrayList;

import java.util.HashMap;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.seon.project.model.ClassVO;
import com.seon.project.model.ClassmemVO;
import com.seon.project.model.User;
import com.seon.project.service.ClassService;
import com.seon.project.service.MemberService;

@Controller
@RequestMapping("/class/")
public class ClassController {

	// class service 가 사용하는 함수 mapping
	@Autowired
	ClassService service;
	
	// 수업목록 get
	@RequestMapping(value = "/classList", method = RequestMethod.GET)
	public ModelAndView classList(Model model,User user,HttpServletRequest request) throws Exception{	
		ModelAndView view = new ModelAndView();
		view.setViewName("classList");
	
		HttpSession session = request.getSession();
		String userId = (String) session.getAttribute("userName");
		
		model.addAttribute("list", service.classList(userId));
		System.out.println("사용자 아이디" + userId);
		
		return view;
	}

	// 수업등록 get(교수,학생)
	@RequestMapping(value = "/classRegister", method = RequestMethod.GET)
	public ModelAndView getRegiser(ClassVO Class,HttpServletRequest request) throws Exception {
		ModelAndView view = new ModelAndView();
		
		HttpSession session = request.getSession();
		String isMaster = (String) session.getAttribute("isMaster");
				
		view.setViewName("classRegister");


		return view;
	}

	// 수업등록 post(교수,학생)
	@RequestMapping(value = "/classRegister", method = RequestMethod.POST)
	public ModelAndView postRegister(ClassmemVO classmem, HttpServletRequest request) throws Exception {	
		ModelAndView view = new ModelAndView();
	
		view.setViewName("redirect:/");
				
		service.classRegister(classmem);
		System.out.println("class: " + classmem);
		

		return view;
	}
	
	@RequestMapping(value ="/classDetail", method = RequestMethod.GET)
	public ModelAndView getDetail(@RequestParam("classNum") String classNum, Model model) throws Exception {
		ModelAndView view = new ModelAndView();
		ClassVO detail = service.classDetail(classNum);
		model.addAttribute("detail", detail);
		view.setViewName("classDetail");
		
		System.out.println(detail);
		
		return view;
		
	}
	
	@RequestMapping(value = "myRoom", method=RequestMethod.GET)
	public ModelAndView myRoom(User user, HttpSession session) {
		ModelAndView view = new ModelAndView();
		view.setViewName("myRoom");
		
		return view;
	}
	
	@RequestMapping(value = "Calendar", method=RequestMethod.GET)
	public String Calendar() {
		return "/Calendar";
	}

}
