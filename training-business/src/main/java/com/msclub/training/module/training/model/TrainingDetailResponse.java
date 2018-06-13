package com.msclub.training.module.training.model;

import java.sql.Date;

public class TrainingDetailResponse {

	private Integer id;
	private Integer trainingPlanId;
	private Integer trainingStateInd;
	private String trainingTitle;
	private Date trainingStartTime;
	private Date trainingEndTime;
	private Integer trainingDuration;
	private String trainingLocation;
	private String trainingDescription;
	private String trainer;
	private String trainingMaterial;
	private String trainingVideo;
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

	public Integer getTrainingPlanId() {
		return trainingPlanId;
	}

	public void setTrainingPlanId(Integer trainingPlanId) {
		this.trainingPlanId = trainingPlanId;
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

	public Integer getTrainingDuration() {
		return trainingDuration;
	}

	public void setTrainingDuration(Integer trainingDuration) {
		this.trainingDuration = trainingDuration;
	}

	public String getTrainingLocation() {
		return trainingLocation;
	}

	public void setTrainingLocation(String trainingLocation) {
		this.trainingLocation = trainingLocation;
	}

	public String getTrainingDescription() {
		return trainingDescription;
	}

	public void setTrainingDescription(String trainingDescription) {
		this.trainingDescription = trainingDescription;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
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

	public String getTrainingMaterial() {
		return trainingMaterial;
	}

	public void setTrainingMaterial(String trainingMaterial) {
		this.trainingMaterial = trainingMaterial;
	}

	public String getTrainingVideo() {
		return trainingVideo;
	}

	public void setTrainingVideo(String trainingVideo) {
		this.trainingVideo = trainingVideo;
	}

	
}
