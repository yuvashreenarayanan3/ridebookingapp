package com.app.ridebookingapp.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "feedback")
public class Feedback {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer feedbackId;
	
	private String comments;
	private int rating;
	private long userId;
	
	
	public Feedback() {}
	

	public Feedback(String comments, int rating, long userId) {
		super();
		this.comments = comments;
		this.rating = rating;
		this.userId = userId;
	}
	public Integer getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(Integer feedbackId) {
		this.feedbackId = feedbackId;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public long getUserName() {
		return userId;
	}
	public void setUserName(long userId) {
		this.userId = userId;
	}
}
