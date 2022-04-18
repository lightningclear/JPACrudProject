package com.skilldistillery.jparedrocks.data;

import com.skilldistillery.jparedrocks.entities.RedRocks;

public interface RedRocksDAO {
	RedRocks findByID(int redRocksId);
	
	RedRocks findShowByKeyword(String keyword);
	
	RedRocks createDate(RedRocks show);
	
	RedRocks boolean saveDate(RedRocks show);
	
	RedRocks boolean deleteDate(RedRocks show);
}
	