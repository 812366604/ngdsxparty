package org.ngdsx.partybuilding.dao;

import java.util.List;
import org.ngdsx.partybuilding.entity.Region;

public interface RegionDao {

	/**
	 * 列出区域
	 * @return
	 */
	List<Region> queryRegion();
	
	/**
	 * 新增区域
	 * @param region
	 * @return
	 */
	int insertRegion(Region region);
	
	/**
	 * 更新区域
	 * @param region
	 * @return
	 */
	int updateRegion(Region region);
	
	/**
	 * 删除区域
	 * @param region
	 * @return
	 */
	int deleteRegion(Region region);
	
	/**
	 * 批量删除区域
	 * @param regionList
	 * @return
	 */
	int batchDeleteRegion(List<Long> regionList);
}
