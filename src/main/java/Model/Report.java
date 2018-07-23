package model;

public class Report {
	private String reported,reporting;
	private int anno;
	public Report(String reported, String reporting, int anno) {
		super();
		this.reported = reported;
		this.reporting = reporting;
		this.anno = anno;
	}
        public Report() {
		super();
		this.reported = "";
		this.reporting = "";
		this.anno = -1;
	}
	public String getReported() {
		return reported;
	}
	public void setReported(String reported) {
		this.reported = reported;
	}
	public String getReporting() {
		return reporting;
	}
	public void setReporting(String reporting) {
		this.reporting = reporting;
	}
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	
}
