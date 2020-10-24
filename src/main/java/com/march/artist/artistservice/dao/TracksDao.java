package com.march.artist.artistservice.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.march.artist.artistservice.model.Tracks;


@Component
@Transactional
public class TracksDao {
	
	@PersistenceContext	
	private EntityManager entityManager;
	
	
	//@Override
	public void saveTracts(Tracks tracks) {
		entityManager.merge(tracks);
		entityManager.flush();

	}

	@SuppressWarnings("unchecked")
	public List<Tracks>  getAllTracts() {
		List<Tracks> tr = entityManager.createQuery("from Tracks").getResultList();
		return tr;

	}
	
	@SuppressWarnings("unchecked")
	public Tracks  getTractsById(Integer id) {
		Tracks tr = entityManager.find(Tracks.class, id);
		
		//List<Tracks> tr = entityManager.createQuery("from Tracks").getResultList();
		return tr;

	}
}
