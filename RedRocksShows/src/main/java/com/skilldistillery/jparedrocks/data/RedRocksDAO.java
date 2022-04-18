package com.skilldistillery.jparedrocks.data;

import com.skilldistillery.jparedrocks.entities.RedRocks;

public interface RedRocksDAO {
	RedRocks findByID(int redRocksId);
}
