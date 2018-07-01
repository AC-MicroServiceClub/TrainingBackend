package com.msclub.training.module.user.dto;

import java.sql.Date;

public class TrainerResponse {

	private Integer id;
	// `TRAINER_EID` int NOT NULL,
	// @Column(name = "TRAINER_EID")
	private Integer trainerEid;
	// @Column(name = "Training_STATE_IND")
	private Integer trainingStateInd;
	// @Column(name = "TRAINER_DESCRIPTION")
	private String trainerDescription;
	// `CREATOR_ID` int NOT NULL DEFAULT 0,
	// @Column(name = "CREATOR_ID")
	private Integer creatorId;
	// `CREATOR` varchar(45) NOT NULL DEFAULT '',
	// @Column(name = "CREATOR")
	private String creator;
	// `CREATE_DATE` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
	// @Column(name = "CREATE_DATE")
	private Date createDate;
	// `UPDATED_BY_ID` int NOT NULL DEFAULT 0,
	// @Column(name = "UPDATED_BY_ID")
	private Integer updatedById;
	// `UPDATED_BY` varchar(45) NOT NULL DEFAULT '',
	// @Column(name = "UPDATED_BY")
	private String updatedBy;
	// `LAST_UPDATE_DATE` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
	// @Column(name = "LAST_UPDATE_DATE")
	private Date lastUpdateDate;
	// `DELETED_IND` int NOT NULL DEFAULT 0,
	// @Column(name = "DELETED_IND")
	private Integer deletedInd;
	// `DELETED_BY` varchar(45) NOT NULL DEFAULT '',
	// @Column(name = "DELETED_BY")
	private String deletedBy;
	// `DELETED_BY_ID` int NOT NULL DEFAULT 0,
	// @Column(name = "DELETED_BY_ID")
	private Integer deletedById;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getTrainerEid() {
		return trainerEid;
	}
	public void setTrainerEid(Integer trainerEid) {
		this.trainerEid = trainerEid;
	}
	public Integer getTrainingStateInd() {
		return trainingStateInd;
	}
	public void setTrainingStateInd(Integer trainingStateInd) {
		this.trainingStateInd = trainingStateInd;
	}
	public String getTrainerDescription() {
		return trainerDescription;
	}
	public void setTrainerDescription(String trainerDescription) {
		this.trainerDescription = trainerDescription;
	}
	public Integer getCreatorId() {
		return creatorId;
	}
	public void setCreatorId(Integer creatorId) {
		this.creatorId = creatorId;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Integer getUpdatedById() {
		return updatedById;
	}
	public void setUpdatedById(Integer updatedById) {
		this.updatedById = updatedById;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	public Integer getDeletedInd() {
		return deletedInd;
	}
	public void setDeletedInd(Integer deletedInd) {
		this.deletedInd = deletedInd;
	}
	public String getDeletedBy() {
		return deletedBy;
	}
	public void setDeletedBy(String deletedBy) {
		this.deletedBy = deletedBy;
	}
	public Integer getDeletedById() {
		return deletedById;
	}
	public void setDeletedById(Integer deletedById) {
		this.deletedById = deletedById;
	}



}
