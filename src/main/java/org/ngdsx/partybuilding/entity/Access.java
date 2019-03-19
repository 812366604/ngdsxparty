package org.ngdsx.partybuilding.entity;
import java.util.Date;

public class Access {

	private int accessId;
	private String title;
	private String uris;
	private int status;
	private Date createTime;
	private Date updateTime;
	public int getAccessId() {
		return accessId;
	}
	public void setAccessId(int accessId) {
		this.accessId = accessId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUris() {
		return uris;
	}
	public void setUris(String uris) {
		this.uris = uris;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
