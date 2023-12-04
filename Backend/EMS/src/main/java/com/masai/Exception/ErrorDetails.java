package com.masai.Exception;

import java.time.LocalDateTime;

public class ErrorDetails {
	
	private LocalDateTime timestamp;
	private String message;
	private String uri;
	public ErrorDetails(LocalDateTime timestamp, String message, String uri) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.uri = uri;
	}
	
	public ErrorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	
	

}
