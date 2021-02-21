package com.seon.project.dao;

import java.util.List;

import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.seon.project.model.ClassVO;
import com.seon.project.model.ClassmemVO;
import com.seon.project.model.User;

@Repository
public class ClassDAOImpl implements ClassDAO{
	
	@Autowired
	SqlSession sqlSession;
	
	private static String namespace = "com.seon.project.mybatis.mappers.ClassMapper";
	
	// 수업목록
	@Override
	public List<ClassVO> classList(String userId){
		return sqlSession.selectList(namespace+".classList",userId);
	}
	
	@Override
	public void classRegister(ClassmemVO classmem) {
		sqlSession.insert(namespace+".classRegister", classmem);		
	}

	
	@Override
	public ClassVO classDetail(String classNum){
		return sqlSession.selectOne(namespace+".classDetail", classNum);
	}
	
}
