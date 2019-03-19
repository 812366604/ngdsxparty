package org.ngdsx.partybuilding.dao;

import static org.junit.Assert.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.ngdsx.partybuilding.BaseTest;
import org.ngdsx.partybuilding.entity.Region;
import org.springframework.beans.factory.annotation.Autowired;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegionDaoTest extends BaseTest{

	@Autowired
	private RegionDao regionDao;
	
	@Test
	public void testinsertRegion() throws Exception{
		Region region = new Region();
		region.setRegionName("山西省");
		region.setRegionShortName("晋");
		region.setRegionCode("030000");
		region.setRegionParentId(0000000L);
		region.setRegionLevel(0);
		int result = regionDao.insertRegion(region);
		assertEquals(1,result);
	}

}
