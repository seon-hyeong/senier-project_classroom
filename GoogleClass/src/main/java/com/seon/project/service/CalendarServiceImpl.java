package com.seon.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.seon.project.dao.CalendarDAO;
import com.seon.project.model.CalendarVO;


@Repository
public class CalendarServiceImpl implements CalendarService{
	@Autowired
	CalendarDAO dao;
	
	public List<CalendarVO> showSchedule() throws Exception{
		return dao.showSchedule();
	}

}
