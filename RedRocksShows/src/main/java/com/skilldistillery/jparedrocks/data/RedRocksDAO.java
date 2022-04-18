package com.skilldistillery.jparedrocks.data;

import java.util.List;

import com.skilldistillery.jparedrocks.entities.RedRocks;

public interface RedRocksDAO {
	RedRocks findByID(int redRocksId);
	
	List<RedRocks> displayAll();
	
	RedRocks createDate(RedRocks createShow);
	
	RedRocks updateDate(RedRocks updateShow, int id);
	
//	RedRocks saveDate(RedRocks saveShow);
	
	boolean deleteDate(RedRocks redrocks, int id);
}
	