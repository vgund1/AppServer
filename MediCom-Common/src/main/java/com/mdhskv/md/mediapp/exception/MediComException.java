package com.mdhskv.md.mediapp.exception;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.context.NoSuchMessageException;


public class MediComException extends RuntimeException {

  private static final long serialVersionUID = 1L;
  private int codeNum = 0;
  private String code = "";
  private List<?> objects;
  private Map<String, ?> params;

  public MediComException() {
  }

  public MediComException(Throwable cause) {
    super(cause);
  }

  public MediComException(int codeNum, String context) {
    super(context);
    this.codeNum = codeNum;
  }
  
  public MediComException(int codeNum, String context, Throwable cause) {
    super(context, cause);
    this.codeNum = codeNum;
  }

  public MediComException(String code) {
    super(code);
    this.code = code;
  }
  
  public MediComException(String code, List<Object> objects) {
    super(code);
    this.code = code;
    this.objects = objects;
  }
  
  public MediComException(String code, Object obj1) {
	    super(code);
	    this.code = code;
	    this.objects = Arrays.asList(obj1);
  }
  
  public MediComException(String code, Throwable cause) {
    super(cause);
    this.code = code;
  }
  
  public MediComException(String code, Object[] objects){
    super(code);
    this.code = code;
    this.objects = Arrays.asList(objects);  	
  }

  /**
	 * @param code
	 * @param params
	 */
	public MediComException(String code, Map<String, ?> params) {
		super();
		this.code = code;
		this.params = params;
	}

	/**
	 * @param code
	 * @param objects
	 * @param params
	 */
	public MediComException(String code, List<?> objects,
			Map<String, ?> params) {
		super();
		this.code = code;
		this.objects = objects;
		this.params = params;
	}

	public String getCode() {
    if(codeNum == 0){
      return code;
    } else {
      return Integer.toString(codeNum);
    }
  }
  public void setCode(String code) {
    this.code = code;
  }

  public List<?> getObjects() {
    return objects;
  }

  public void setObjects(List<?> objects) {
    this.objects = objects;
  }
	public Map<String, ?> getParams() {
		return params;
	}

	/**
	 * @param params the params to set
	 */
	public void setParams(Map<String, Object> params) {
		this.params = params;
	}
}
