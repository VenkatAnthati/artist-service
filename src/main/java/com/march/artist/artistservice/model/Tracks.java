package com.march.artist.artistservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Tracks {
 
	@Id
	private int tid;
	
	private int traid;
	
	private String title;
	
	@ManyToOne
	@JoinColumn(name = "artist", referencedColumnName = "id")
	private Artists artist;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public int getTraid() {
		return traid;
	}

	public void setTraid(int traid) {
		this.traid = traid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Artists getArtist() {
		return artist;
	}

	public void setArtist(Artists artist) {
		this.artist = artist;
	}
	
	
}
