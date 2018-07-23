package model;

public class Anno {
	private int pictureno;
	private String hashtag,codesub;
	private int report,anno;
	private double price;
	private String explanation,editdate,adate;
	private Boolean flag;
	private String header;
	private String email;
	public Anno(int pictureno, String hashtag, String codesub, int report, int anno, double price, String explanation,
			String editdate, String adate, Boolean flag, String header, String email) {
		super();
		this.pictureno = pictureno;
		this.hashtag = hashtag;
		this.codesub = codesub;
		this.report = report;
		this.anno = anno;
		this.price = price;
		this.explanation = explanation;
		this.editdate = editdate;
		this.adate = adate;
		this.flag = flag;
		this.header = header;
		this.email = email;
	}
        public Anno() {
		super();
		this.pictureno = -1;
		this.hashtag = "";
		this.codesub = "";
		this.report = 1;
		this.anno = -1;
		this.price = -1;
		this.explanation = "";
		this.editdate = "";
		this.adate = "";
		this.flag = false;
		this.header = "";
		this.email = "";
	}
	public int getPictureno() {
		return pictureno;
	}
	public void setPictureno(int pictureno) {
		this.pictureno = pictureno;
	}
	public String getHashtag() {
		return hashtag;
	}
	public void setHashtag(String hashtag) {
		this.hashtag = hashtag;
	}
	public String getCodesub() {
		return codesub;
	}
	public void setCodesub(String codesub) {
		this.codesub = codesub;
	}
	public int getReport() {
		return report;
	}
	public void setReport(int report) {
		this.report = report;
	}
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	public String getEditdate() {
		return editdate;
	}
	public void setEditdate(String editdate) {
		this.editdate = editdate;
	}
	public String getAdate() {
		return adate;
	}
	public void setAdate(String adate) {
		this.adate = adate;
	}
	public Boolean getFlag() {
		return flag;
	}
	public void setFlag(Boolean flag) {
		this.flag = flag;
	}
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
