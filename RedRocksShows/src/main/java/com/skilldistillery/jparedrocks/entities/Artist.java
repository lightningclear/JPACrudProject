package com.skilldistillery.jparedrocks.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Artist {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	
	@Column(name = "show_date")
	private String show_date;
	
	private String genre;
	
	private int price;
	
	@Column(name = " show_time")
	private String showTime;
	
	

	public Artist () {
		super();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShow_date() {
		return show_date;
	}

	public void setShow_date(String show_date) {
		this.show_date = show_date;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getShowTime() {
		return showTime;
	}

	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}

	@Override
	public String toString() {
		return "Artist [id=" + id + ", name=" + name + ", show_date=" + show_date + ", genre=" + genre + ", price="
				+ price + ", showTime=" + showTime + "]";
	}
	
}
