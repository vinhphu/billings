package com.athl.service;

import java.util.List;

import com.athl.model.Congty;

public interface CongTyService {
	public void add(Congty congty);
	public void edit(Congty congty);
	public void delete(String congtyid);
	public Congty getCongTy(String congtyid);
	public List getAllCongTy();
}
