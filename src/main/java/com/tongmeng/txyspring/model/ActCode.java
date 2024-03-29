package com.tongmeng.txyspring.model;
// Generated 2016-4-2 14:20:28 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ActCode generated by hbm2java
 */
@Entity
@Table(name = "act_code", catalog = "txyspring")
public class ActCode implements java.io.Serializable {

	private int actSubtype;
	private String descriptionSubtype;
	private Set<CommonActInfo> commonActInfos = new HashSet<CommonActInfo>(0);

	public ActCode() {
	}

	public ActCode(int actSubtype) {
		this.actSubtype = actSubtype;
	}

	public ActCode(int actSubtype, String descriptionSubtype, Set<CommonActInfo> commonActInfos) {
		this.actSubtype = actSubtype;
		this.descriptionSubtype = descriptionSubtype;
		this.commonActInfos = commonActInfos;
	}

	@Id

	@Column(name = "Act_Subtype", unique = true, nullable = false)
	public int getActSubtype() {
		return this.actSubtype;
	}

	public void setActSubtype(int actSubtype) {
		this.actSubtype = actSubtype;
	}

	@Column(name = "Description_Subtype", length = 100)
	public String getDescriptionSubtype() {
		return this.descriptionSubtype;
	}

	public void setDescriptionSubtype(String descriptionSubtype) {
		this.descriptionSubtype = descriptionSubtype;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "actCode")
	public Set<CommonActInfo> getCommonActInfos() {
		return this.commonActInfos;
	}

	public void setCommonActInfos(Set<CommonActInfo> commonActInfos) {
		this.commonActInfos = commonActInfos;
	}

}
