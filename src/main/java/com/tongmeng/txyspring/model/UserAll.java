package com.tongmeng.txyspring.model;
// Generated 2016-4-2 14:20:28 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * UserAll generated by hbm2java
 */
@Entity
@Table(name = "user_all", catalog = "txyspring", uniqueConstraints = @UniqueConstraint(columnNames = { "Area_Code","Ori_ID" }))
public class UserAll implements java.io.Serializable {

	private Integer id;
	private SchCode schCode;
	private String psw;
	private String oriId;
	private String oriName;
	private String nickName;
	private Integer age;
	private String major;
	private String tel;
	private String mail;
	private Integer gender;
	private String hdimgUri;
	private Integer typeCode;
	private Set<UserActClt> userActClts = new HashSet<UserActClt>(0);

	public UserAll() {
	}

	public UserAll(SchCode schCode, String oriId) {
		this.schCode = schCode;
		this.oriId = oriId;
	}

	public UserAll(SchCode schCode, String psw, String oriId, String oriName, String nickName, Integer age,
			String major, String tel, String mail, Integer gender, String hdimgUri, Integer typeCode,
			Set<UserActClt> userActClts) {
		this.schCode = schCode;
		this.psw = psw;
		this.oriId = oriId;
		this.oriName = oriName;
		this.nickName = nickName;
		this.age = age;
		this.major = major;
		this.tel = tel;
		this.mail = mail;
		this.gender = gender;
		this.hdimgUri = hdimgUri;
		this.typeCode = typeCode;
		this.userActClts = userActClts;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Area_Code", nullable = false)
	public SchCode getSchCode() {
		return this.schCode;
	}

	public void setSchCode(SchCode schCode) {
		this.schCode = schCode;
	}

	@Column(name = "PSW", length = 100)
	public String getPsw() {
		return this.psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	@Column(name = "Ori_ID", nullable = false, length = 100)
	public String getOriId() {
		return this.oriId;
	}

	public void setOriId(String oriId) {
		this.oriId = oriId;
	}

	@Column(name = "Ori_Name", length = 10)
	public String getOriName() {
		return this.oriName;
	}

	public void setOriName(String oriName) {
		this.oriName = oriName;
	}

	@Column(name = "Nick_Name", length = 100)
	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Column(name = "Age")
	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Column(name = "Major", length = 100)
	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Column(name = "Tel", length = 100)
	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Column(name = "Mail", length = 100)
	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Column(name = "Gender")
	public Integer getGender() {
		return this.gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	@Column(name = "Hdimg_Uri", length = 65535)
	public String getHdimgUri() {
		return this.hdimgUri;
	}

	public void setHdimgUri(String hdimgUri) {
		this.hdimgUri = hdimgUri;
	}

	@Column(name = "Type_code")
	public Integer getTypeCode() {
		return this.typeCode;
	}

	public void setTypeCode(Integer typeCode) {
		this.typeCode = typeCode;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userAll")
	public Set<UserActClt> getUserActClts() {
		return this.userActClts;
	}

	public void setUserActClts(Set<UserActClt> userActClts) {
		this.userActClts = userActClts;
	}

}
