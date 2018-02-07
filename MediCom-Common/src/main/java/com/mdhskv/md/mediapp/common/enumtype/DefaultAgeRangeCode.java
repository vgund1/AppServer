package com.mdhskv.md.mediapp.common.enumtype;

public enum DefaultAgeRangeCode {
	AGE1("0-5"),
	AGE2("6-10"),
	AGE3("10-17"),
	AGE4("18-24"),
	AGE5("25-34"),
	AGE6("35-44"),
	AGE7("45-54"),
	AGE8("55-64"),
	AGE9("65-74"),
	AGE10("75-");
	
	private String code;
	
	DefaultAgeRangeCode(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return this.code;
	}
	
	public boolean checkAgeGroup(int age) {
		String ageRangeCode = this.getCode();
		String[] split = ageRangeCode.split("-");
		int start = Integer.valueOf(split[0]);
		int end = Integer.MAX_VALUE;
		if(split.length == 2) end = Integer.valueOf(split[1]);
		if ( age >= start && age <= end ) return true;
		else return false;
	}
}
