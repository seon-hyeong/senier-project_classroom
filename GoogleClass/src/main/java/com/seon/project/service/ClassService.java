package com.seon.project.service;

import java.util.List;

import java.util.Map;

import javax.activation.CommandMap;

import org.springframework.stereotype.Service;

import com.seon.project.model.ClassVO;
import com.seon.project.model.ClassmemVO;
import com.seon.project.model.User;

@Service
public interface ClassService {
	
	// 수업목록
	public List<ClassVO> classList(String userId);
	
	public void classRegister(ClassmemVO classmem);
	
	public ClassVO classDetail(String classNum);


}
