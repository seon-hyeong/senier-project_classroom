package com.seon.project.service;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seon.project.dao.MemberDAO;
import com.seon.project.model.AssignVO;
import com.seon.project.model.ClassVO;
import com.seon.project.model.User;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	MemberDAO dao;
	
	@Override
	public void register(User user) {
		dao.register(user);
	}

	@Override
	public User loginUser(User user) {
		return dao.loginUser(user);
	}
	
	@Override
	public List<ClassVO> myList(String userId){
		return dao.myList(userId);
	}
	
	@Override
	public List<ClassVO> proList(String proId){
		return dao.proList(proId);
		
	}
}
