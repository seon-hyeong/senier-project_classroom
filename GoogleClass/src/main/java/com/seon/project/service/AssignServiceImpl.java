package com.seon.project.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.seon.project.dao.AssignDAO;
import com.seon.project.model.AssignFileVO;
import com.seon.project.model.AssignVO;


@Repository
public class AssignServiceImpl implements AssignService{
	
	@Autowired
	AssignDAO dao;
	
	@Override
	public void assignRegister(AssignVO Assign) {
		dao.assignRegister(Assign);
	}
	
	@Override
	public List<AssignVO> assignList(String classNum){
		return dao.assignList(classNum);
	}
	
	@Override
	public AssignVO assignDetail(String assignName){
		return dao.assignDetail(assignName);
	}
	
	@Override
	public AssignFileVO assignfileDetail(AssignFileVO AssignFile){
		return dao.assignfileDetail(AssignFile);
	}
	
	@Override
	public void assignGrade(AssignFileVO AssignFile) {
		dao.assignGrade(AssignFile);
	}
	
	@Override
	public AssignFileVO getGrade(AssignFileVO AssignFile){
		return dao.getGrade(AssignFile);
	}
	
	@Override
	public void insertFile(AssignFileVO AssignFile) {
		dao.insertFile(AssignFile);
	}
}
