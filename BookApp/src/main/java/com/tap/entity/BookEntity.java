package com.tap.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Book")
public class BookEntity {
	@Id
	@Column(name="bid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bid;
	
	@Column(name="book_name")
	private String bname;
	
	@Column(name="book_author")
	private String bauthor;
	
	@Override
	public String toString() {
		return "BookEntity [bid=" + bid + ", bname=" + bname + ", bauthor=" + bauthor + "]";
	}
	public int getBid() {
		return bid;
	}
	public BookEntity( String bname, String bauthor) {
		super();
		this.bname = bname;
		this.bauthor = bauthor;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
	public BookEntity() {
		super();
	}
	public String getBname() {
		return bname;
	}
	public String getBauthor() {
		return bauthor;
	}
	
}
