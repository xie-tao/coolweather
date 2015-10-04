/**
 * 
 */
package com.coolweather.app.model;

/**
 * @author Ð»ÌÎ
 * @version 1.0
 * @date 2015-10-4  ÏÂÎç1:48:55
 */
public class County {
	private Integer id;
	private String countyName;
	private String countyCode;
	private Integer cityId;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the countyName
	 */
	public String getCountyName() {
		return countyName;
	}
	/**
	 * @param countyName the countyName to set
	 */
	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}
	/**
	 * @return the contyCode
	 */
	public String getCountyCode() {
		return countyCode;
	}
	/**
	 * @param contyCode the contyCode to set
	 */
	public void setCountyCode(String contyCode) {
		this.countyCode = contyCode;
	}
	/**
	 * @return the cityId
	 */
	public Integer getCityId() {
		return cityId;
	}
	/**
	 * @param cityId the cityId to set
	 */
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	
}
