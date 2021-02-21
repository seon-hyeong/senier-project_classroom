package com.seon.project.dao;

import java.util.List;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.seon.project.model.AssignFileVO;
import com.seon.project.model.AssignVO;

@Repository
public class AssignDAOImpl implements AssignDAO{
	@Autowired
	SqlSession sqlSession;
	
	private static String namespace = "com.seon.project.mybatis.mappers.AssignMapper";
	
	@Override
	public void assignRegister(AssignVO Assign) {
		sqlSession.insert(namespace+".assignRegister", Assign);
	}
	
	@Override
	public List<AssignVO> assignList(String classNum){
		return sqlSession.selectList(namespace+".assignList", classNum);
	}

	@Override
	public AssignVO assignDetail(String assignName){
		return sqlSession.selectOne(namespace+".assignDetail", assignName);
	}
	@Override
	public AssignFileVO assignfileDetail(AssignFileVO AssignFile) {
		return sqlSession.selectOne(namespace+".assignfileDetail", AssignFile);
	}
	@Override
	public void assignGrade(AssignFileVO AssignFile) {
		sqlSession.update(namespace +".assignGrade", AssignFile);
	}
	
	@Override
	public AssignFileVO getGrade(AssignFileVO AssignFile){
		return sqlSession.selectOne(namespace+".getGrade", AssignFile);
	}
	
	@Override
	public void insertFile(AssignFileVO AssignFile) {
		sqlSession.insert(namespace +".insertFile",AssignFile);
	}
	
}
