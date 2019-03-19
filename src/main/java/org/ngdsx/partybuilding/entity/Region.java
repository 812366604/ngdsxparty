package org.ngdsx.partybuilding.entity;

public class Region {
	
	private Long regionId;
	private String regionName;
	private String regionShortName;
	private String regionCode;
	private Long regionParentId;
	private int regionLevel;
	public Long getRegionId() {
		return regionId;
	}
	public void setRegionId(Long regionId) {
		this.regionId = regionId;
	}
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	public String getRegionShortName() {
		return regionShortName;
	}
	public void setRegionShortName(String regionShortName) {
		this.regionShortName = regionShortName;
	}
	public String getRegionCode() {
		return regionCode;
	}
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}
	public Long getRegionParentId() {
		return regionParentId;
	}
	public void setRegionParentId(Long regionParentId) {
		this.regionParentId = regionParentId;
	}
	public int getRegionLevel() {
		return regionLevel;
	}
	public void setRegionLevel(int regionLevel) {
		this.regionLevel = regionLevel;
	}
	
	

}
