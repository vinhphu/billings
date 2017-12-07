package com.athl.imp.serviceImp;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.athl.model.TaikhoanNguoidung;
import com.athl.service.Admin_UserService;
import com.athl.DAO.TaikhoanNguoidungDAO;

public class Admin_UserServiceImpl implements Admin_UserService {

	@Autowired
	TaikhoanNguoiDungDAO TaikhoanNguoidungDAO;

	public boolean insert(TaikhoanNguoidung user) {
		return TaikhoanNguoidungDAO.insert(user);
	}

	public boolean edit(TaikhoanNguoidung user) {
		return TaikhoanNguoidungDAO.edit(user);
	}

	public boolean delete(String username) {
		return TaikhoanNguoidungDAO.delete(username);
	}

	public TaikhoanNguoidung findUser(String username) {
		return TaikhoanNguoidung(username, congty, role);
	}

	public ArrayList<TaikhoanNguoidung> getAll() {
		return TaikhoanNguoidungDAO.getAll();
	}
}
