package com.seon.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.seon.project.model.CalendarVO;

@Service
public interface CalendarService {
	public List<CalendarVO> showSchedule() throws Exception;

}
