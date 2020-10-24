package com.march.artist.artistservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.march.artist.artistservice.dao.TracksDao;
import com.march.artist.artistservice.model.Tracks;

@RestController
public class ArtistController {

	@Autowired
	public TracksDao tracksdao;
	
	@GetMapping("/artist/all")
	public List<Tracks> getAllTracks() {
		
		List<Tracks> trr =tracksdao.getAllTracts();
		return trr;
		
	}
	
	@GetMapping("/artist/{id}")
	public Tracks getTracksById(@PathVariable int id) {
		
		Tracks trr =tracksdao.getTractsById(id);
		return trr;
		
	}
}
