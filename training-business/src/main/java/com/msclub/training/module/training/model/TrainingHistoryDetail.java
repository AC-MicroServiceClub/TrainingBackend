package com.msclub.training.module.training.model;

import java.sql.Date;

public class TrainingHistoryDetail {

	private Integer id;
	private Integer trainingId;
	private Integer trainingStateInd;
	private String trainingTitle;
	private String trainer;
	private Date trainingStartTime;
	private Date trainingEndTime;
	private Integer duration;
	private String location;
	private String traineeId;
	private String traineeStateInd;
	private Integer creatorId;
	private String creator;

	private Date createDate;

	private Integer updatedById;

	private String updatedBy;

	private Date lastUpdateDate;

	private Integer deletedInd;

	private String deletedBy;

	private Integer deletedById;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(Integer trainingId) {
		this.trainingId = trainingId;
	}

	public Integer getTrainingStateInd() {
		return trainingStateInd;
	}

	public void setTrainingStateInd(Integer trainingStateInd) {
		this.trainingStateInd = trainingStateInd;
	}

	public String getTrainingTitle() {
		return trainingTitle;
	}

	public void setTrainingTitle(String trainingTitle) {
		this.trainingTitle = trainingTitle;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public Date getTrainingStartTime() {
		return trainingStartTime;
	}

	public void setTrainingStartTime(Date trainingStartTime) {
		this.trainingStartTime = trainingStartTime;
	}

	public Date getTrainingEndTime() {
		return trainingEndTime;
	}

	public void setTrainingEndTime(Date trainingEndTime) {
		this.trainingEndTime = trainingEndTime;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(String traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeStateInd() {
		return traineeStateInd;
	}

	public void setTraineeStateInd(String traineeStateInd) {
		this.traineeStateInd = traineeStateInd;
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
