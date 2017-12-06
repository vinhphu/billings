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
 * Extension generated by hbm2java
 */
@Entity
@Table(name = "extension", catalog = "billings")
public class Extension implements java.io.Serializable {

	private String extensionId;
	private Phongban phongban;
	private String tennguoidung;
	private String dausoSudung;
	private Set<LogCall> logCalls = new HashSet<LogCall>(0);

	public Extension() {
	}

	public Extension(String extensionId) {
		this.extensionId = extensionId;
	}

	public Extension(String extensionId, Phongban phongban, String tennguoidung, String dausoSudung,
			Set<LogCall> logCalls) {
		this.extensionId = extensionId;
		this.phongban = phongban;
		this.tennguoidung = tennguoidung;
		this.dausoSudung = dausoSudung;
		this.logCalls = logCalls;
	}

	@Id

	@Column(name = "extensionID", unique = true, nullable = false, length = 20)
	public String getExtensionId() {
		return this.extensionId;
	}

	public void setExtensionId(String extensionId) {
		this.extensionId = extensionId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "phongbanID")
	public Phongban getPhongban() {
		return this.phongban;
	}

	public void setPhongban(Phongban phongban) {
		this.phongban = phongban;
	}

	@Column(name = "tennguoidung", length = 65535)
	public String getTennguoidung() {
		return this.tennguoidung;
	}

	public void setTennguoidung(String tennguoidung) {
		this.tennguoidung = tennguoidung;
	}

	@Column(name = "dauso_sudung", length = 20)
	public String getDausoSudung() {
		return this.dausoSudung;
	}

	public void setDausoSudung(String dausoSudung) {
		this.dausoSudung = dausoSudung;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "extension")
	public Set<LogCall> getLogCalls() {
		return this.logCalls;
	}

	public void setLogCalls(Set<LogCall> logCalls) {
		this.logCalls = logCalls;
	}

}
