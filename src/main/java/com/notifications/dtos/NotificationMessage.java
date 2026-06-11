package com.notifications.dtos;

public class NotificationMessage {
	private String title;
	private String body;
	private String type;

	public NotificationMessage() {
	}

	public NotificationMessage(String title, String body, String type) {
		this.title = title;
		this.body = body;
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}