package com.skilldistillery.jparedrocks.data;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.jparedrocks.entities.RedRocks;

@Service
@Transactional
public class RedRocksDaoJpaImpl implements RedRocksDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public RedRocks findByID(int redRocksId) {
		
		return em.find(RedRocks.class, redRocksId);
	}

	@Override
	public RedRocks findShowByKeyword(String keyword) {
		return em.find(RedRocks.class, keyword);
	}

	@Override
	public RedRocks createDate(RedRocks show) {
		return em.find(RedRocks.class, show);
	}

	@Override
	public RedRocks saveDate(RedRocks show) {
		return em.find(RedRocks.class, show);
	}

	@Override
	public RedRocks deleteDate(RedRocks show) {
		return em.find(RedRocks.class, show);
	}

	
}
