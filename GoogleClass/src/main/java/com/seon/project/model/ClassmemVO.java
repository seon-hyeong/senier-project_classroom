package com.seon.project.model;

public class ClassmemVO {
	private String class_memId;
	private String class_userId;
	private String class_classNum;
	
	public String getClass_memId() {
		return class_memId;
	}
	public void setClass_memId(String class_memId) {
		this.class_memId = class_memId;
	}
	public String getClass_userId() {
		return class_userId;
	}
	public void setClass_userId(String class_userId) {
		this.class_userId = class_userId;
	}
	public String getClass_classNum() {
		return class_classNum;
	}
	public void setClass_classNum(String class_classNum) {
		this.class_classNum = class_classNum;
	}
	@Override
	public String toString() {
		return "ClassmemVO [class_memId=" + class_memId + ", class_userId=" + class_userId + ", class_classNum="
				+ class_classNum + "]";
	}
	
		
}
