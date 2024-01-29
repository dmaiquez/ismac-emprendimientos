package com.distribuida.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "login_user")

public class Loginuser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id; 
	@Column(name = "user")
	private String user;
	@Column(name = "pasword")
	private int pasword;
	@Column(name = "new_pasword")
	private int new_pasword;
	@Column(name = "confirm_pasword")
	private int confirm_pasword;
	@Column(name = "login_correo")
	private String login_correo;
	@Column(name = "login_token")
	private String login_token;
	@Column(name = "Session_time_In")
	private Date Session_time_In;
	@Column(name = "Session_time_OUT")
	private Date Session_time_OUT;
	@Column(name = "Session_tiempo")
	private int Session_tiempo;
	
	public Loginuser () {}
	
	
	
	
	public Loginuser(int id, String user, int pasword, int new_pasword, int confirm_pasword, String login_correo,
			String login_token, Date session_time_In, Date session_time_OUT, int session_tiempo) {
		this.id = id;
		this.user = user;
		this.pasword = pasword;
		this.new_pasword = new_pasword;
		this.confirm_pasword = confirm_pasword;
		this.login_correo = login_correo;
		this.login_token = login_token;
		this.Session_time_In = session_time_In;
		this.Session_time_OUT = session_time_OUT;
		this.Session_tiempo = session_tiempo;
	}




	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public int getPasword() {
		return pasword;
	}
	public void setPasword(int pasword) {
		this.pasword = pasword;
	}
	public int getNew_pasword() {
		return new_pasword;
	}
	public void setNew_pasword(int new_pasword) {
		this.new_pasword = new_pasword;
	}
	public int getConfirm_pasword() {
		return confirm_pasword;
	}
	public void setConfirm_pasword(int confirm_pasword) {
		this.confirm_pasword = confirm_pasword;
	}
	public String getLogin_correo() {
		return login_correo;
	}
	public void setLogin_correo(String login_correo) {
		this.login_correo = login_correo;
	}
	public String getLogin_token() {
		return login_token;
	}
	public void setLogin_token(String login_token) {
		this.login_token = login_token;
	}
	public Date getSession_time_In() {
		return Session_time_In;
	}
	public void setSession_time_In(Date session_time_In) {
		Session_time_In = session_time_In;
	}
	public Date getSession_time_OUT() {
		return Session_time_OUT;
	}
	public void setSession_time_OUT(Date session_time_OUT) {
		Session_time_OUT = session_time_OUT;
	}
	public int getSession_tiempo() {
		return Session_tiempo;
	}
	public void setSession_tiempo(int session_tiempo) {
		Session_tiempo = session_tiempo;
	}
	@Override
	public String toString() {
		return "login_user [id=" + id + ", user=" + user + ", pasword=" + pasword + ", new_pasword=" + new_pasword
				+ ", confirm_pasword=" + confirm_pasword + ", login_correo=" + login_correo + ", login_token="
				+ login_token + ", Session_time_In=" + Session_time_In + ", Session_time_OUT=" + Session_time_OUT
				+ ", Session_tiempo=" + Session_tiempo + "]";
	}
	
}
