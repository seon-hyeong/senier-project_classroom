package com.seon.project.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.seon.project.model.CalendarVO;

@Repository
public class CalendarDAOImpl implements CalendarDAO{
	@Autowired
	SqlSession sqlSession;
	
	private static String namespace = "com.seon.project.mybatis.mappers.CalendarMapper";
	
	public List<CalendarVO> showSchedule() throws Exception{
		return sqlSession.selectList(namespace + ".showSchedule");
	}
}
