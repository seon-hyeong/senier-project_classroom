package com.seon.project.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.seon.project.model.AssignVO;
import com.seon.project.model.ClassVO;
import com.seon.project.model.User;

@Repository
public class MemberDAOImpl implements MemberDAO{
	
	@Autowired
	SqlSession sqlSession;
	
	private static String namespace = "com.seon.project.mybatis.mappers.MemberMapper";
	
	
	@Override
	public void register(User user) {
		sqlSession.insert(namespace+".register", user);
		
	}
	
	@Override
	public User loginUser(User user) {
		return sqlSession.selectOne(namespace + ".loginUser", user);
		
	}
	
	@Override
	public List<ClassVO> myList(String userId){
		return sqlSession.selectList(namespace+".myList",userId);
	}
	
	@Override
	public List<ClassVO> proList(String proId){
		return sqlSession.selectList(namespace+".proList",proId);
	}	
}
