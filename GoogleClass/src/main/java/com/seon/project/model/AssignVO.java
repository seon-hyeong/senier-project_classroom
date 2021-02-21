package com.seon.project.model;

import org.springframework.web.multipart.MultipartFile;

public class AssignVO {
	private String assignId;
	private String assignName;
	private String assignDes;
	private String assignDead;
	private String assignGrade;
	private String classNum;
	private String assignFile;
	private String userId;
	private MultipartFile uploadFile;

	public MultipartFile getUploadFile() {
		return uploadFile;
	}
	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}
	public String getAssignId() {
		return assignId;
	}
	public void setAssignId(String assignId) {
		this.assignId = assignId;
	}
	public String getAssignName() {
		return assignName;
	}
	public void setAssignName(String assignName) {
		this.assignName = assignName;
	}
	public String getAssignDes() {
		return assignDes;
	}
	public void setAssignDes(String assignDes) {
		this.assignDes = assignDes;
	}
	public String getAssignDead() {
		return assignDead;
	}
	public void setAssignDead(String assignDead) {
		this.assignDead = assignDead;
	}
	public String getAssignGrade() {
		return assignGrade;
	}
	public void setAssignGrade(String assignGrade) {
		this.assignGrade = assignGrade;
	}
	
	public String getClassNum() {
		return classNum;
	}
	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}
	
	public String getAssignFile() {
		return assignFile;
	}
	public void setAssignFile(String assignFile) {
		this.assignFile = assignFile;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "AssignVO [assignId=" + assignId + ", assignName=" + assignName + ", assignDes=" + assignDes
				+ ", assignDead=" + assignDead + ", assignGrade=" + assignGrade + ", classNum=" + classNum
				+ ", assignFile=" + assignFile + ", userId=" + userId + ", uploadFile=" + uploadFile + "]";
	}
}
