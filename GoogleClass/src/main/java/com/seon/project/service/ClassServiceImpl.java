package com.seon.project.service;

import java.util.List;

import java.util.Map;

import javax.activation.CommandMap;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.seon.project.dao.ClassDAO;
import com.seon.project.model.ClassVO;
import com.seon.project.model.ClassmemVO;
import com.seon.project.model.User;

@Repository
public class ClassServiceImpl implements ClassService{
	
	@Autowired
	ClassDAO dao;
	
	@Override
	public List<ClassVO> classList(String userId){
		return dao.classList(userId);
	}
	
	@Override
	public void classRegister(ClassmemVO classmem) {
		dao.classRegister(classmem);
	}

	
	@Override
	public ClassVO classDetail(String classNum){
		return dao.classDetail(classNum);
	}
	

}
