package com.seon.project;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.seon.project.model.User;
import com.seon.project.service.MemberService;

@Controller
public class HomeController {
	
	MemberService service;
	
	@RequestMapping(value = "/", method=RequestMethod.GET)
	public String home() {
		return "/index";
	}
	
	@RequestMapping(value = "classList", method=RequestMethod.GET)
	public String classList() {
		return "/classList";
	}
	
	@RequestMapping(value = "login", method=RequestMethod.GET)
	public String login() {
		return "/login";
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
	
	@RequestMapping(value = "Chart", method=RequestMethod.GET)
	public String Chart() {
		return "/Chart";
	}
	
}