package model;

public class Preferences {
	private String email;
	private int codesub;
	public Preferences(String email, int codesub) {
		super();
		this.email = email;
		this.codesub = codesub;
	}
        public Preferences() {
		super();
		this.email = "";
		this.codesub = -1;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCodesub() {
		return codesub;
	}
	public void setCodesub(int codesub) {
		this.codesub = codesub;
	}
	
}
