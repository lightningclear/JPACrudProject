package com.skilldistillery.jparedrocks.data;

import java.util.List;

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
	public List<RedRocks> displayAll() {
		String jpql = " SELECT * FROM red_rocks_shows ";
		return em.createQuery(jpql,RedRocks.class).getResultList();
	}

	@Override
	public RedRocks createDate(RedRocks redRockShow) {
		RedRocks redrocks = new RedRocks();
		redrocks.setPrice(redrocks.getPrice());
		em.persist(redrocks);
		return em.find(RedRocks.class, redRockShow);
	}

	@Override
	public RedRocks updateDate(RedRocks updateShow, int id) {
		RedRocks updatedRedRocks = em.find(RedRocks.class, id);
		updatedRedRocks.setName(updateShow.getName());
		updatedRedRocks.setShowDate(updateShow.getShowDate());
		updatedRedRocks.setPrice(updateShow.getPrice());
		updatedRedRocks.setShowTime(updateShow.getShowTime());
		updatedRedRocks.setGenre(updateShow.getGenre());
		return updatedRedRocks;
	}

//	@Override
//	public RedRocks saveDate(RedRocks redRockShow) {
//		RedRocks saveRedRocks = new RedRocks();
//		saveRedRocks.setName(redrocks.getName());
//		redrocks.setShowDate(redrocks.getShowDate());
//		redrocks.setPrice(redrocks.getPrice());
//		redrocks.setShowTime(redrocks.getShowTime());
//		redrocks.setGenre(redrocks.getGenre());
//		em.persist(redrocks);
//		return em.find(RedRocks.class, redRockShow);
//	}

	@Override
	public boolean deleteDate(RedRocks redrocks, int id) {
		boolean deletedShow = false;
		redrocks = em.find(RedRocks.class, id);
		if(redrocks != null) {
			em.remove(redrocks);
			em.flush();
			deletedShow = !em.contains(redrocks);
		}
		return deletedShow;
	}



}
