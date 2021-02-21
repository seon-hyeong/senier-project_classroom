package com.seon.project.service;

import java.util.List;
import java.util.Map;

import com.seon.project.model.AssignVO;
import com.seon.project.model.ClassVO;
import com.seon.project.model.User;

public interface MemberService {
	
	public void register(User user);
	
	public User loginUser(User user);
	
	public List<ClassVO> myList(String userId);
	
	public List<ClassVO> proList(String proId);
	

}
