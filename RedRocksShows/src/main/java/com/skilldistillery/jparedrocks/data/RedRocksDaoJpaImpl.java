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
	public RedRocks findShowByKeyword(String name) {
		RedRocks redrocks = new RedRocks();
		redrocks.getName(RedRocks.class, name);
		return em.find(RedRocks.class, name);
	}
	

	@Override
	public RedRocks createDate(RedRocks redRockShow) {
		RedRocks redrocks = new RedRocks();
		redrocks.setShowDate(redrocks.getShowDate());
		return em.find(RedRocks.class, redRockShow);
	}

	@Override
	public RedRocks saveDate(RedRocks redRockShow) {
		RedRocks redrocks = new RedRocks();
		redrocks.setShowDate(redrocks.getShowDate());
		em.persist(redrocks);
		return em.find(RedRocks.class, redRockShow);
	}

	@Override
	public RedRocks deleteDate(RedRocks redRockShow) {
		RedRocks redrocks = em.find(RedRocks.class, redRockShow)
		return em.find(RedRocks.class, redRockShow);
	}

	
}
