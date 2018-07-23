package model;

public class Subcategory {
	private String sname;
	private int codecat,codesub;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getCodecat() {
		return codecat;
	}
	public void setCodecat(int codecat) {
		this.codecat = codecat;
	}
	public int getCodesub() {
		return codesub;
	}
	public void setCodesub(int codesub) {
		this.codesub = codesub;
	}
	public Subcategory(String sname, int codecat, int codesub) {
		super();
		this.sname = sname;
		this.codecat = codecat;
		this.codesub = codesub;
	}
	public Subcategory() {
		super();
		this.sname = "";
		this.codecat = -1;
		this.codesub = -1;
	}
	
}
