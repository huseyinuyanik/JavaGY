package com.turkcell.TeknikServis.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum EnItemType {

	TYPE1("CPU"),
	TYPE2("GPU"),
	TYPE3("RAM"),
	TYPE4("MOTHERBOARD");
	
	private String code;
	
	private EnItemType(String code) {
		this.code=code;
	}
	
	@JsonCreator
	public static EnItemType decode(final String code) {
		return (EnItemType.values()).filter(targetEnum -> targetEnum.code.equals(code).findFirst().orElse(null));
	}
	
	@JsonValue
	public String getCode() {
		return code;
	}
}