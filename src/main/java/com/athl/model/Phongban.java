package com.athl.model;
// Generated Dec 6, 2017 10:05:40 PM by Hibernate Tools 5.2.3.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Phongban generated by hbm2java
 */
@Entity
@Table(name = "phongban", catalog = "billings")
public class Phongban implements java.io.Serializable {

	private String phongbanId;
	private Congty congty;
	private String tenPhongban;
	private Set<Extension> extensions = new HashSet<Extension>(0);

	public Phongban() {
	}

	public Phongban(String phongbanId) {
		this.phongbanId = phongbanId;
	}

	public Phongban(String phongbanId, Congty congty, String tenPhongban, Set<Extension> extensions) {
		this.phongbanId = phongbanId;
		this.congty = congty;
		this.tenPhongban = tenPhongban;
		this.extensions = extensions;
	}

	@Id

	@Column(name = "phongbanID", unique = true, nullable = false, length = 10)
	public String getPhongbanId() {
		return this.phongbanId;
	}

	public void setPhongbanId(String phongbanId) {
		this.phongbanId = phongbanId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "congtyID")
	public Congty getCongty() {
		return this.congty;
	}

	public void setCongty(Congty congty) {
		this.congty = congty;
	}

	@Column(name = "ten_phongban", length = 65535)
	public String getTenPhongban() {
		return this.tenPhongban;
	}

	public void setTenPhongban(String tenPhongban) {
		this.tenPhongban = tenPhongban;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "phongban")
	public Set<Extension> getExtensions() {
		return this.extensions;
	}

	public void setExtensions(Set<Extension> extensions) {
		this.extensions = extensions;
	}

}