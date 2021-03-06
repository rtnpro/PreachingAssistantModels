package com.giridhari.preachingassistant.rest.model.followupvolunteer;

import com.giridhari.preachingassistant.rest.model.RequestEntity;

public class FollowUpVolunteerDetailRequestEntity extends RequestEntity{

	private Long id;
	private Long programId;
	private Long devoteeId;
	private boolean isFollowupVolunteer;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getProgramId() {
		return programId;
	}
	public void setProgramId(Long programId) {
		this.programId = programId;
	}
	public Long getDevoteeId() {
		return devoteeId;
	}
	public void setDevoteeId(Long devoteeId) {
		this.devoteeId = devoteeId;
	}
	public boolean isFollowupVolunteer() {
		return isFollowupVolunteer;
	}
	public void setFollowupVolunteer(boolean isFollowupVolunteer) {
		this.isFollowupVolunteer = isFollowupVolunteer;
	}
	
	
}
