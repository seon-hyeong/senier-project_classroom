package com.seon.project.dao;

import java.util.List;

import com.seon.project.model.CalendarVO;

public interface CalendarDAO {
	
	public List<CalendarVO> showSchedule() throws Exception;
}
