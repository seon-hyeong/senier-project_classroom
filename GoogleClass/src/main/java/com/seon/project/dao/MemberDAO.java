package com.seon.project.dao;

import java.util.List;
import java.util.Map;

import com.seon.project.model.AssignVO;
import com.seon.project.model.ClassVO;
import com.seon.project.model.User;

public interface MemberDAO {
	
	// 회원가입
	public void register(User user);
	
	// 로그인
	public User loginUser(User user);
	
	// 마이페이지
	public List<ClassVO> myList(String userId);
	
	public List<ClassVO> proList(String proId);
		
}
