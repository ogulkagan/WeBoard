package model;

public class Category {

	private String cname;
	private int codecat;
	public Category(String cname, int codecat) {
		super();
		this.cname = cname;
		this.codecat = codecat;
	}
        public Category() {
		super();
		this.cname = "";
		this.codecat = -1;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCodecat() {
		return codecat;
	}
	public void setCodecat(int codecat) {
		this.codecat = codecat;
	}
	
}
