package com.athl.service;

import java.util.ArrayList;
import java.util.List;

import com.athl.model.*;

public interface TaiKhoanService {

	public void add(TaikhoanNguoidung taikhoan);

	public void edit(TaikhoanNguoidung taikhoan);

	public void delete(String taikhoanid);

	public TaikhoanNguoidung getTaikhoan(String taikhoanid);

	public ArrayList<TaikhoanNguoidung> getAllTaiKhoan();

}
