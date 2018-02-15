package com.mdhskv.md.mediapp.exception;

import java.util.Arrays;

public class ResourceNotFoundException extends RuntimeException {
 
    private Long resourceId;
 
    public ResourceNotFoundException(Long resourceId, String message) {
        super(message);
        this.resourceId = resourceId;
    }

	public Long getResourceId() {
		return resourceId;
	}

	public void setResourceId(Long resourceId) {
		this.resourceId = resourceId;
	}

	@Override
	public String toString() {
		return "ResourceNotFoundException [resourceId=" + resourceId + ", getMessage()=" + getMessage()
				+ ", getLocalizedMessage()=" + getLocalizedMessage() + ", getCause()=" + getCause() + ", toString()="
				+ super.toString() + ", fillInStackTrace()=" + fillInStackTrace() + ", getStackTrace()="
				+ Arrays.toString(getStackTrace()) 
				+ ", getSuppressed()=" + Arrays.toString(getSuppressed()) + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
    
}