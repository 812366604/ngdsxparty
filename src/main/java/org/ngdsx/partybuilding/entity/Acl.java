package org.ngdsx.partybuilding.entity;
import java.util.Date;

/**
 * 权限表
 * @author jaogun
 *
 */
public class Acl {

	private int aclId;
	private String aclCode;//权限码
	private String aclName;//权限名称
	private int aclModuleId;//权限所在的权限模块id
	private String aclUrl;//请求的url，可以填正则表达式
	private int aclType;//类型：1菜单2按钮3其他
	private int aclStatus;//状态：1正常2冻结
	private int aclSeq;//权限在当前模块下的排序
	private String aclRemark;//备注
	private String operator;//操作者
	private Date operatorTime;//操作时间
	private String operatorIp;//操作最后一个ip
	public int getAclId() {
		return aclId;
	}
	public void setAclId(int aclId) {
		this.aclId = aclId;
	}
	public String getAclCode() {
		return aclCode;
	}
	public void setAclCode(String aclCode) {
		this.aclCode = aclCode;
	}
	public String getAclName() {
		return aclName;
	}
	public void setAclName(String aclName) {
		this.aclName = aclName;
	}
	public int getAclModuleId() {
		return aclModuleId;
	}
	public void setAclModuleId(int aclModuleId) {
		this.aclModuleId = aclModuleId;
	}
	public String getAclUrl() {
		return aclUrl;
	}
	public void setAclUrl(String aclUrl) {
		this.aclUrl = aclUrl;
	}
	public int getAclType() {
		return aclType;
	}
	public void setAclType(int aclType) {
		this.aclType = aclType;
	}
	public int getAclStatus() {
		return aclStatus;
	}
	public void setAclStatus(int aclStatus) {
		this.aclStatus = aclStatus;
	}
	public int getAclSeq() {
		return aclSeq;
	}
	public void setAclSeq(int aclSeq) {
		this.aclSeq = aclSeq;
	}
	public String getAclRemark() {
		return aclRemark;
	}
	public void setAclRemark(String aclRemark) {
		this.aclRemark = aclRemark;
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
