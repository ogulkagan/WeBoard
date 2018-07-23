/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public class User {
    
  	private String email,tel,name,surname,password,detailad;
	private byte[] picture;
	private int report_no,addressno;
	private boolean telflag,complete_sign;
        
	public User(String email, String tel, String name, String surname, String password, String detailad, byte[] picture,
			int report_no, int addressno, boolean telflag, boolean complete_sign) {
		super();
		this.email = email;
		this.tel = tel;
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.detailad = detailad;
		this.picture = picture;
		this.report_no = report_no;
		this.addressno = addressno;
		this.telflag = telflag;
		this.complete_sign = complete_sign;
	}
        	public User() {
		super();
		this.email = "";
		this.tel = "";
		this.name = "";
		this.surname = "";
		this.password = "";
		this.detailad = "";
		this.report_no = 0;
		this.addressno =0;
		this.telflag = false;
		this.complete_sign = false;
	}
	
	public User(String email, String tel, String name, String surname, String password, String detailad, int report_no,
			int addressno, boolean telflag, boolean complete_sign) {
		super();
		this.email = email;
		this.tel = tel;
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.detailad = detailad;
		this.report_no = report_no;
		this.addressno = addressno;
		this.telflag = telflag;
		this.complete_sign = complete_sign;
	}

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDetailad() {
		return detailad;
	}
	public void setDetailad(String detailad) {
		this.detailad = detailad;
	}
	public int getReport_no() {
		return report_no;
	}
	public void setReport_no(int report_no) {
		this.report_no = report_no;
	}
	public int getAddressno() {
		return addressno;
	}
	public void setAddressno(int addressno) {
		this.addressno = addressno;
	}
	public boolean isTelflag() {
		return telflag;
	}
	public void setTelflag(boolean telflag) {
		this.telflag = telflag;
	}
	public boolean isComplete_sign() {
		return complete_sign;
	}
	public void setComplete_sign(boolean complete_sign) {
		this.complete_sign = complete_sign;
	}
	
	

	
	
	
	
}


