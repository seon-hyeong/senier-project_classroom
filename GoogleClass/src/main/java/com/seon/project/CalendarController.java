package com.seon.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seon.project.service.CalendarService;

@Controller
public class CalendarController {
	@Autowired
	CalendarService service;
	
	@RequestMapping(value ="/Calendar")
	public String schedule(Model model) throws Exception{
		model.addAttribute("showSchedule", service.showSchedule());
		
		return "/Calendar";
	}

}
