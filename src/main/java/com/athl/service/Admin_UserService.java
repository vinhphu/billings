package com.athl.service;

import java.util.ArrayList;
import com.athl.model.TaikhoanNguoidung;

public interface Admin_UserService {

	public boolean insert(TaikhoanNguoidung user);

	public boolean edit(TaikhoanNguoidung user);

	public boolean delete(String username);

	// Tim User
	public TaikhoanNguoidung findUser(String username);

	// Lay danh sach User
	public ArrayList<TaikhoanNguoidung> getAll();
	
}
