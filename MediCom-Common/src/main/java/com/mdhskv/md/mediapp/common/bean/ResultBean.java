package com.mdhskv.md.mediapp.common.bean;
public class ResultBean {

	protected Result result = new Result();

	public ResultBean() {
	}
	
	public ResultBean(Result result) {
		this.result = result;
	}

	/** @return the result */
	public Result getResult() {
		return result;
	}

	/**
	 * @param result
	 *          the result to set
	 */
	public void setResult(Result result) {
		this.result = result;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ResultBean [result=");
		builder.append(result);
		builder.append("]");
		return builder.toString();
	}

}
