package com.tongmeng.txyspring.model;
// Generated 2016-3-14 20:59:07 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CommonActInfo generated by hbm2java
 */
@Entity
@Table(name = "common_act_info", catalog = "txyspring")
public class CommonActInfo implements java.io.Serializable {

	private Integer id;
	private ActCode actCode;
	private SchCode schCode;
	private String title;
	private Date startDate;
	private Date endDate;
	private Date pubTime;
	private String location;
	private Integer peopleNumber;
	private Integer numRead;
	private Integer numFavo;
	private String covImgUri;
	private String intro;
	private String ctPerTel;
	private String ctPerMail;
	private String ctPerQq;
	private String outLink;
	private Integer statCode;
	private JobExtraInfo jobExtraInfo;
	private ActExtraInfo actExtraInfo;
	private PostExtraInfo postExtraInfo;

	public CommonActInfo() {
	}

	public CommonActInfo(String title, Date startDate, Date endDate, Date pubTime) {
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
		this.pubTime = pubTime;
	}

	public CommonActInfo(ActCode actCode, SchCode schCode, String title, Date startDate, Date endDate, Date pubTime,
			String location, Integer peopleNumber, Integer numRead, Integer numFavo, String covImgUri, String intro,
			String ctPerTel, String ctPerMail, String ctPerQq, String outLink, Integer statCode,
			JobExtraInfo jobExtraInfo, ActExtraInfo actExtraInfo, PostExtraInfo postExtraInfo) {
		this.actCode = actCode;
		this.schCode = schCode;
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
		this.pubTime = pubTime;
		this.location = location;
		this.peopleNumber = peopleNumber;
		this.numRead = numRead;
		this.numFavo = numFavo;
		this.covImgUri = covImgUri;
		this.intro = intro;
		this.ctPerTel = ctPerTel;
		this.ctPerMail = ctPerMail;
		this.ctPerQq = ctPerQq;
		this.outLink = outLink;
		this.statCode = statCode;
		this.jobExtraInfo = jobExtraInfo;
		this.actExtraInfo = actExtraInfo;
		this.postExtraInfo = postExtraInfo;
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
	@JoinColumns({ @JoinColumn(name = "Act_Type", referencedColumnName = "Act_Type"),
			@JoinColumn(name = "Act_subtype", referencedColumnName = "Act_Subtype") })
	public ActCode getActCode() {
		return this.actCode;
	}

	public void setActCode(ActCode actCode) {
		this.actCode = actCode;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "Sch_Code", referencedColumnName = "Sch_Code"),
			@JoinColumn(name = "Area_Code", referencedColumnName = "Area_Code") })
	public SchCode getSchCode() {
		return this.schCode;
	}

	public void setSchCode(SchCode schCode) {
		this.schCode = schCode;
	}

	@Column(name = "Title", nullable = false, length = 65535)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Start_Date", nullable = false, length = 19)
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "End_Date", nullable = false, length = 19)
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Pub_Time", nullable = false, length = 19)
	public Date getPubTime() {
		return this.pubTime;
	}

	public void setPubTime(Date pubTime) {
		this.pubTime = pubTime;
	}

	@Column(name = "Location", length = 65535)
	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Column(name = "People_Number")
	public Integer getPeopleNumber() {
		return this.peopleNumber;
	}

	public void setPeopleNumber(Integer peopleNumber) {
		this.peopleNumber = peopleNumber;
	}

	@Column(name = "NumRead")
	public Integer getNumRead() {
		return this.numRead;
	}

	public void setNumRead(Integer numRead) {
		this.numRead = numRead;
	}

	@Column(name = "NumFavo")
	public Integer getNumFavo() {
		return this.numFavo;
	}

	public void setNumFavo(Integer numFavo) {
		this.numFavo = numFavo;
	}

	@Column(name = "CovImg_Uri", length = 65535)
	public String getCovImgUri() {
		return this.covImgUri;
	}

	public void setCovImgUri(String covImgUri) {
		this.covImgUri = covImgUri;
	}

	@Column(name = "Intro", length = 65535)
	public String getIntro() {
		return this.intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	@Column(name = "CtPer_Tel", length = 100)
	public String getCtPerTel() {
		return this.ctPerTel;
	}

	public void setCtPerTel(String ctPerTel) {
		this.ctPerTel = ctPerTel;
	}

	@Column(name = "CtPer_Mail", length = 100)
	public String getCtPerMail() {
		return this.ctPerMail;
	}

	public void setCtPerMail(String ctPerMail) {
		this.ctPerMail = ctPerMail;
	}

	@Column(name = "CtPer_QQ", length = 100)
	public String getCtPerQq() {
		return this.ctPerQq;
	}

	public void setCtPerQq(String ctPerQq) {
		this.ctPerQq = ctPerQq;
	}

	@Column(name = "OutLink", length = 65535)
	public String getOutLink() {
		return this.outLink;
	}

	public void setOutLink(String outLink) {
		this.outLink = outLink;
	}

	@Column(name = "Stat_Code")
	public Integer getStatCode() {
		return this.statCode;
	}

	public void setStatCode(Integer statCode) {
		this.statCode = statCode;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "commonActInfo")
	public JobExtraInfo getJobExtraInfo() {
		return this.jobExtraInfo;
	}

	public void setJobExtraInfo(JobExtraInfo jobExtraInfo) {
		this.jobExtraInfo = jobExtraInfo;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "commonActInfo")
	public ActExtraInfo getActExtraInfo() {
		return this.actExtraInfo;
	}

	public void setActExtraInfo(ActExtraInfo actExtraInfo) {
		this.actExtraInfo = actExtraInfo;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "commonActInfo")
	public PostExtraInfo getPostExtraInfo() {
		return this.postExtraInfo;
	}

	public void setPostExtraInfo(PostExtraInfo postExtraInfo) {
		this.postExtraInfo = postExtraInfo;
	}

}