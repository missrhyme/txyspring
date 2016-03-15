package com.tongmeng.txyspring.model;
// Generated 2016-3-14 20:59:07 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ActCodeId generated by hbm2java
 */
@Embeddable
public class ActCodeId implements java.io.Serializable {

	private int actType;
	private int actSubtype;

	public ActCodeId() {
	}

	public ActCodeId(int actType, int actSubtype) {
		this.actType = actType;
		this.actSubtype = actSubtype;
	}

	@Column(name = "Act_Type", nullable = false)
	public int getActType() {
		return this.actType;
	}

	public void setActType(int actType) {
		this.actType = actType;
	}

	@Column(name = "Act_Subtype", nullable = false)
	public int getActSubtype() {
		return this.actSubtype;
	}

	public void setActSubtype(int actSubtype) {
		this.actSubtype = actSubtype;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ActCodeId))
			return false;
		ActCodeId castOther = (ActCodeId) other;

		return (this.getActType() == castOther.getActType()) && (this.getActSubtype() == castOther.getActSubtype());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getActType();
		result = 37 * result + this.getActSubtype();
		return result;
	}

}