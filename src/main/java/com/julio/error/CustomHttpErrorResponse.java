package com.julio.error;

import java.util.Map;

public class CustomHttpErrorResponse {

	private Integer status;
	private String path;
	private String errorMessage;
	private String timeStamp;
	private String trace;

	public CustomHttpErrorResponse(int status, Map<String, Object> errorAttributes) {
		this.setStatus(status);
		this.setPath((String) errorAttributes.get("path"));
		this.setErrorMessage((String) errorAttributes.get("message"));
		this.setTimeStamp(errorAttributes.get("timestamp").toString());
		this.setTrace((String) errorAttributes.get("trace"));
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getTrace() {
		return trace;
	}

	public void setTrace(String trace) {
		this.trace = trace;
	}

}