package com.seon.project.service;

import java.util.List;



import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.seon.project.model.AssignFileVO;
import com.seon.project.model.AssignVO;

@Service
public interface AssignService {
	
	public void assignRegister(AssignVO Assign);
	
	public List<AssignVO> assignList(String classNum);
	
	public AssignVO assignDetail(String assignName);
	
	public AssignFileVO assignfileDetail(AssignFileVO AssignFile);
	
	public void assignGrade(AssignFileVO AssignFile);
	
	public AssignFileVO getGrade(AssignFileVO AssignFile);
	
	public void insertFile(AssignFileVO AssignFile);
	

}
