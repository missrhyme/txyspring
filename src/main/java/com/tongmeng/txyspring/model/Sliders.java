package com.tongmeng.txyspring.model;
// Generated 2016-3-6 23:54:46 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;
import com.tongmeng.txyspring.ajaxmodel.AjaxJsonViews;

/**
 * Sliders generated by hbm2java
 */
@Entity
@Table(name = "SLIDERS", catalog = "txyspring")
public class Sliders implements java.io.Serializable {

	@JsonView(AjaxJsonViews.Public.class)
	private Integer id;
	
	@JsonView(AjaxJsonViews.Public.class)
	private String title;
	
	@JsonView(AjaxJsonViews.Public.class)
	private String image;
	
	@JsonView(AjaxJsonViews.Public.class)
	private String link;

	public Sliders() {
	}

	public Sliders(String title, String image,String link) {
		this.title = title;
		this.image = image;
		this.link = link;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "TITLE", nullable = false, length = 100)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "IMAGE", nullable = false, length = 65535)
	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	@Column(name = "LINK", nullable = false, length = 65535)
	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

}
