package org.ngdsx.partybuilding.entity;

import java.util.Date;
/**
 * 部门架构表
 * @author jaogun
 *
 */
public class Department {

	private int departmentId;
	private String departmentName;//部门名称
	private int parentId; //父级主键id
	private String departmentLevel; //部门层级
	private int seq; //在当前层级的排序
	private String remark;//备注
	private String departmentTemplate; //部门模板
	private String operator;//操作者
	private Date operatorTime;//操作时间
	private String operatorIp;//最后操作ip
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
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public String getDepartmentTemplate() {
		return departmentTemplate;
	}
	public void setDepartmentTemplate(String departmentTemplate) {
		this.departmentTemplate = departmentTemplate;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public Date getOperatorTime() {
		return operatorTime;
	}
	public void setOperatorTime(Date operatorTime) {
		this.operatorTime = operatorTime;
	}
	public String getOperatorIp() {
		return operatorIp;
	}
	public void setOperatorIp(String operatorIp) {
		this.operatorIp = operatorIp;
	}
	
}
