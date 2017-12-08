package com.athl.DAO;

import java.util.List;

import com.athl.model.*;

public interface PhongBanDao {
	public void add(Phongban phongban);
	public void edit(Phongban phongban);
	public void delete(String phongbanid);
	public Phongban getPhongBan(String phongbanid);
	public List getAllPhongBan();

}
