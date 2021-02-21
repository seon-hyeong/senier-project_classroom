package com.seon.project.model;

import org.springframework.web.multipart.MultipartFile;

public class AssignFileVO {
	private String id;
	private String assignName;
	private String assignFile;
	private String assignGrade;
	private String userId;
	private MultipartFile uploadFile;

	public MultipartFile getUploadFile() {
		return uploadFile;
	}
	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAssignName() {
		return assignName;
	}
	public void setAssignName(String assignName) {
		this.assignName = assignName;
	}
	public String getAssignFile() {
		return assignFile;
	}
	public void setAssignFile(String assignFile) {
		this.assignFile = assignFile;
	}
	public String getAssignGrade() {
		return assignGrade;
	}
	public void setAssignGrade(String assignGrade) {
		this.assignGrade = assignGrade;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "AssignFileVO [id=" + id + ", assignName=" + assignName + ", assignFile=" + assignFile + ", assignGrade="
				+ assignGrade + ", userId=" + userId + "]";
	}
}
