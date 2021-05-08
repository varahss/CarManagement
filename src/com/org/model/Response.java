package com.org.model;


public class Response {

	private long status;

	private String message;
	
	private Object data;

	public Response() {

	}

	public Response(int status, String message, Object data) {
		this.status = status;
		this.message = message;
		this.data = data;
	}
	
	

	public long getStatus() {
		return status;
	}

	public void setStatus(long status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Response [status=" + status + ", message=" + message + "]";
	}
}

