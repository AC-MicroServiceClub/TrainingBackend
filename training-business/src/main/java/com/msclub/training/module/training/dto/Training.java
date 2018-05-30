package com.msclub.training.module.training.dto;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Training")
public class Training implements Serializable {

	private static final long serialVersionUID = 1L;
	
	// `ID` int NOT NULL,
	@Id
	private Integer id;
//	// `Training_Plan_ID` int NOT NULL,
//	// @Column(name = "Training_Plan_ID")
//	private Integer trainingPlanId;
//	// `Training_STATE_IND` INT NOT NULL DEFAULT 0 comment '0-planned
//	// 1-in-progress 2-cancelled 3-confirmed 4-train started 5-train finished
//	// 6-send feedback to trainee/completed',
//	// @Column(name = "Training_STATE_IND")
//	private Integer trainingStateInd;
//	// `Training_TITLE` VARCHAR(200) NOT NULL DEFAULT '',
//	// @Column(name = "Training_TITLE")
//	private String trainingTitle;
//	// `Training_START_TIME` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
//	// @Column(name = "Training_START_TIME")
//	private Date trainingStartTime;
//	// `Training_END_TIME` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
//	// @Column(name = "Training_END_TIME")
//	private Date trainingEndTime;
//	// `Training_DURATION` INT NOT NULL DEFAULT 0 comment 'this is calculated by
//	// minutes',
//	// @Column(name = "Training_DURATION")
//	private Integer trainingDuration;
//	// `Training_LOCATION` VARCHAR(200) NOT NULL DEFAULT '',
//	// @Column(name = "Training_LOCATION")
//	private String trainingLocation;
//	// `Training_DESCRIPTION` TEXT NOT NULL,
//	// @Column(name = "Training_DESCRIPTION")
//	private String trainingDescription;
//	// `Trainier` VARCHAR(500) NOT NULL DEFAULT '' comment 'e.g.
//	// trainer1_ID:trainer_name|trainer2_ID:trainer_name',
//	// @Column(name = "Trainier")
//	private String trainer;
//	// `CREATOR_ID` int NOT NULL DEFAULT 0,
//	// @Column(name = "CREATOR_ID")
//	private Integer creatorId;
//	// `CREATOR` varchar(45) NOT NULL DEFAULT '',
//	// @Column(name = "CREATOR")
//	private String creator;
//	// `CREATE_DATE` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
//	// @Column(name = "CREATE_DATE")
//	private Date createDate;
//	// `UPDATED_BY_ID` int NOT NULL DEFAULT 0,
//	// @Column(name = "UPDATED_BY_ID")
//	private Integer updateById;
//	// `UPDATED_BY` varchar(45) NOT NULL DEFAULT '',
//	// @Column(name = "UPDATED_BY")
//	private String updateBy;
//	// `LAST_UPDATE_DATE` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
//	// @Column(name = "LAST_UPDATE_DATE")
//	private Date lastUpdateDate;
//	// `DELETED_IND` int NOT NULL DEFAULT 0,
//	// @Column(name = "DELETED_IND")
//	private Integer deleteInd;
//	// `DELETED_BY` varchar(45) NOT NULL DEFAULT '',
//	// @Column(name = "DELETED_BY")
//	private String deleteBy;
//	// `DELETED_BY_ID` int NOT NULL DEFAULT 0,
//	// @Column(name = "DELETED_BY_ID")
//	private Integer deleteById;
//
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public Integer getTrainingPlanId() {
//		return trainingPlanId;
//	}
//
//	public void setTrainingPlanId(Integer trainingPlanId) {
//		this.trainingPlanId = trainingPlanId;
//	}
//
//	public Integer getTrainingStateInd() {
//		return trainingStateInd;
//	}
//
//	public void setTrainingStateInd(Integer trainingStateInd) {
//		this.trainingStateInd = trainingStateInd;
//	}
//
//	public String getTrainingTitle() {
//		return trainingTitle;
//	}
//
//	public void setTrainingTitle(String trainingTitle) {
//		this.trainingTitle = trainingTitle;
//	}
//
//	public Date getTrainingStartTime() {
//		return trainingStartTime;
//	}
//
//	public void setTrainingStartTime(Date trainingStartTime) {
//		this.trainingStartTime = trainingStartTime;
//	}
//
//	public Date getTrainingEndTime() {
//		return trainingEndTime;
//	}
//
//	public void setTrainingEndTime(Date trainingEndTime) {
//		this.trainingEndTime = trainingEndTime;
//	}
//
//	public Integer getTrainingDuration() {
//		return trainingDuration;
//	}
//
//	public void setTrainingDuration(Integer trainingDuration) {
//		this.trainingDuration = trainingDuration;
//	}
//
//	public String getTrainingLocation() {
//		return trainingLocation;
//	}
//
//	public void setTrainingLocation(String trainingLocation) {
//		this.trainingLocation = trainingLocation;
//	}
//
//	public String getTrainingDescription() {
//		return trainingDescription;
//	}
//
//	public void setTrainingDescription(String trainingDescription) {
//		this.trainingDescription = trainingDescription;
//	}
//
//	public String getTrainer() {
//		return trainer;
//	}
//
//	public void setTrainer(String trainer) {
//		this.trainer = trainer;
//	}
//
//	public Integer getCreatorId() {
//		return creatorId;
//	}
//
//	public void setCreatorId(Integer creatorId) {
//		this.creatorId = creatorId;
//	}
//
//	public String getCreator() {
//		return creator;
//	}
//
//	public void setCreator(String creator) {
//		this.creator = creator;
//	}
//
//	public Date getCreateDate() {
//		return createDate;
//	}
//
//	public void setCreateDate(Date createDate) {
//		this.createDate = createDate;
//	}
//
//	public Integer getUpdateById() {
//		return updateById;
//	}
//
//	public void setUpdateById(Integer updateById) {
//		this.updateById = updateById;
//	}
//
//	public String getUpdateBy() {
//		return updateBy;
//	}
//
//	public void setUpdateBy(String updateBy) {
//		this.updateBy = updateBy;
//	}
//
//	public Date getLastUpdateDate() {
//		return lastUpdateDate;
//	}
//
//	public void setLastUpdateDate(Date lastUpdateDate) {
//		this.lastUpdateDate = lastUpdateDate;
//	}
//
//	public Integer getDeleteInd() {
//		return deleteInd;
//	}
//
//	public void setDeleteInd(Integer deleteInd) {
//		this.deleteInd = deleteInd;
//	}
//
//	public String getDeleteBy() {
//		return deleteBy;
//	}
//
//	public void setDeleteBy(String deleteBy) {
//		this.deleteBy = deleteBy;
//	}
//
//	public Integer getDeleteById() {
//		return deleteById;
//	}
//
//	public void setDeleteById(Integer deleteById) {
//		this.deleteById = deleteById;
//	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
}
