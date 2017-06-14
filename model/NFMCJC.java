package com.hkjc.model;

import com.hkjc.utils.BooleanUtils;

/**
 * MCJC - indicate whether Cable/Perform TV for next 48 hour
 * @author powerjgzhou
 *
 */
public class NFMCJC {
	
	private String cable;
	private String perform;
	private String img ;

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	public boolean isImg(){
		return BooleanUtils.valueOf(img);
	}
	public String getCable() {
		return cable;
	}
	public void setCable(String cable) {
		this.cable = cable;
	}
	public String getPerform() {
		return perform;
	}
	public void setPerform(String perform) {
		this.perform = perform;
	}
	
	public boolean isCable(){
		return BooleanUtils.valueOf(cable);
	}

	public boolean isPerform(){
		return BooleanUtils.valueOf(perform);
	}

	@Override
	public String toString() {
		return "NFMCJC [cable=" + cable + ", perform=" + perform + ", img=" + img + "]";
	}

}
