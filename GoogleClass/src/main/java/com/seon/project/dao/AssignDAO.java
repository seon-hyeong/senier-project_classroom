package com.seon.project.dao;

import java.util.List;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.seon.project.model.AssignFileVO;
import com.seon.project.model.AssignVO;

public interface AssignDAO {
	
	//과제 등록
	public void assignRegister(AssignVO Assign);
	
	//과제 목록
	public List<AssignVO> assignList(String classNum);
	
	//과제 상세
	public AssignVO assignDetail(String assignName);
	
	//교수 점수 줄 부분
	public AssignFileVO assignfileDetail(AssignFileVO AssignFile);
	
	public void assignGrade(AssignFileVO AssignFile);
	
	public AssignFileVO getGrade(AssignFileVO AssignFile);
	
	public void insertFile(AssignFileVO AssignFile);
	

}
