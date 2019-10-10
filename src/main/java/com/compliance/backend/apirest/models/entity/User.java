package com.compliance.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="users")
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idUser;
	private String taxId;
	private String password;
	private String name;
	private String patSurame;
	private String matSurame;
	private String email;	
	private String tel;
	private int type;
	private String roles;
	
	@Column(name="created_at")
	@Temporal(TemporalType.DATE)
	private Date createdAd;
	
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public String getTaxId() {
		return taxId;
	}
	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPatSurame() {
		return patSurame;
	}
	public void setPatSurame(String patSurame) {
		this.patSurame = patSurame;
	}
	public String getMatSurame() {
		return matSurame;
	}
	public void setMatSurame(String matSurame) {
		this.matSurame = matSurame;
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
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public Date getCreatedAd() {
		return createdAd;
	}
	public void setCreatedAd(Date createdAd) {
		this.createdAd = createdAd;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
