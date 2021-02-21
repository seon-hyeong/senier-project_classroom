package com.seon.project.dao;

import java.util.List;

import com.seon.project.model.ClassVO;
import com.seon.project.model.ClassmemVO;
import com.seon.project.model.User;


public interface ClassDAO {
	
	// 1. 수업목록
	public List<ClassVO> classList(String userId);
	
	// 2. 수업등록 (교수, 학생)
	public void classRegister(ClassmemVO classmem);

		
	// 3. 수업상세
	public ClassVO classDetail(String classNum);
	
}
