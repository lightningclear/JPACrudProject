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
	
}
