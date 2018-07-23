package model;

public class Pictures {
	private int picpk;
	private String email;
	private int anno;
	private byte[] images;
	public Pictures(int picpk, String email, int anno, byte[] images) {
		super();
		this.picpk = picpk;
		this.email = email;
		this.anno = anno;
		this.images = images;
	}
        public Pictures() {
		super();
		this.picpk = -1;
		this.email = "";
		this.anno = -1;
		this.images = null;
	}
	public int getPicpk() {
		return picpk;
	}
	public void setPicpk(int picpk) {
		this.picpk = picpk;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	public byte[] getImages() {
		return images;
	}
	public void setImages(byte[] images) {
		this.images = images;
	}
	
	
}
