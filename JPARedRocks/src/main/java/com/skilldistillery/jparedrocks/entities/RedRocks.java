package com.skilldistillery.jparedrocks.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="red_rocks_shows")
public class RedRocks {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@Column(name = "show_date")
	private String showDate;
	
	private String genre;
	
	private int price;
	
	@Column(name = "show_time")
	private String showTime;

	public RedRocks() {
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

	public String getShowDate() {
		return showDate;
	}

	public void setShowDate(String showDate) {
		this.showDate = showDate;
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
		return "Artist [id=" + id + ", name=" + name + ", showDate=" + showDate + ", genre=" + genre + ", price="
				+ price + ", showTime=" + showTime + "]";
	}
	
}
