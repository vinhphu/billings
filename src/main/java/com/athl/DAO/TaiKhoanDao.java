package com.athl.DAO;

import java.util.ArrayList;
import java.util.List;

import com.athl.model.TaikhoanNguoidung;

public interface TaiKhoanDao {

	public void add(TaikhoanNguoidung taikhoan);

	public void edit(TaikhoanNguoidung taikhoan);

	public void delete(String taikhoanid);

	public TaikhoanNguoidung getTaikhoan(String taikhoanid);
	public ArrayList<TaikhoanNguoidung> getAllTaiKhoan();

}
