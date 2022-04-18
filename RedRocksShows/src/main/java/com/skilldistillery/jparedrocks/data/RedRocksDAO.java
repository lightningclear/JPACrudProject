package com.skilldistillery.jparedrocks.data;

import com.skilldistillery.jparedrocks.entities.RedRocks;

public interface RedRocksDAO {
	RedRocks findByID(int redRocksId);
	
	RedRocks findShowByKeyword(String name);
	
	RedRocks createDate(RedRocks redRockShow);
	
	RedRocks saveDate(RedRocks redRockShow);
	
	RedRocks deleteDate(RedRocks redRockShow);
}
	