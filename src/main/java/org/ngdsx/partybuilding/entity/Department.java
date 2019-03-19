package org.ngdsx.partybuilding.entity;

import java.util.Date;
import java.util.List;

public class Department {

	private int departmentId;
	private String departmentName;
	private String departmentLevel; //级别字符串
	private int parentId; //父级主键id
	private int seq; //排序号
	private String departmentTemplate; //部门模板
	private Date mtime;
	private Date ctime;
	private int muserId;
	private int cuserId;
	//子节点
	private List<Department> childNode;
	public List<Department> getChildNode() {
		return childNode;
	}
	public void setChildNode(List<Department> childNode) {
		this.childNode = childNode;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentLevel() {
		return departmentLevel;
	}
	public void setDepartmentLevel(String departmentLevel) {
		this.departmentLevel = departmentLevel;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public Date getMtime() {
		return mtime;
	}
	public void setMtime(Date mtime) {
		this.mtime = mtime;
	}
	public Date getCtime() {
		return ctime;
	}
	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}
	public int getMuserId() {
		return muserId;
	}
	public void setMuserId(int muserId) {
		this.muserId = muserId;
	}
	public int getCuserId() {
		return cuserId;
	}
	public void setCuserId(int cuserId) {
		this.cuserId = cuserId;
	}
	public String getDepartmentTemplate() {
		return departmentTemplate;
	}
	public void setDepartmentTemplate(String departmentTemplate) {
		this.departmentTemplate = departmentTemplate;
	}
}
