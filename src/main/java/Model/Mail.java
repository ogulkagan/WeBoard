package model;

public class Mail {
	private String sender,reciever,message,mdatetime;
	private int anno;
	private Boolean flag;
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReciever() {
		return reciever;
	}
	public void setReciever(String reciever) {
		this.reciever = reciever;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMdatetime() {
		return mdatetime;
	}
	public void setMdatetime(String mdatetime) {
		this.mdatetime = mdatetime;
	}
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	public Boolean getFlag() {
		return flag;
	}
	public void setFlag(Boolean flag) {
		this.flag = flag;
	}
	public Mail(String sender, String reciever, String message, String mdatetime, int anno, Boolean flag) {
		super();
		this.sender = sender;
		this.reciever = reciever;
		this.message = message;
		this.mdatetime = mdatetime;
		this.anno = anno;
		this.flag = flag;
	}
	public Mail() {
		super();
		this.sender = "";
		this.reciever = "";
		this.message = "";
		this.mdatetime = "";
		this.anno = -1;
		this.flag = false;
	}
	
}
