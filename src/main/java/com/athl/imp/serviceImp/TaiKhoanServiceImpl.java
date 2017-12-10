package com.athl.imp.serviceImp;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.athl.DAO.*;
import com.athl.model.TaikhoanNguoidung;
import com.athl.service.TaiKhoanService;

@Service
public class TaiKhoanServiceImpl implements TaiKhoanService {

	@Autowired
	private TaiKhoanDao taiKhoanDao;

	public void add(TaikhoanNguoidung taikhoan) {
		taiKhoanDao.add(taikhoan);
	}

	@Transactional
	public void edit(TaikhoanNguoidung taikhoan) {
		taiKhoanDao.edit(taikhoan);
		;
	}

	@Transactional
	public void delete(String taikhoanid) {
		taiKhoanDao.delete(taikhoanid);

	}

	@Transactional
	public TaikhoanNguoidung getTaikhoan(String taikhoanid) {
		return taiKhoanDao.getTaikhoan(taikhoanid);
	}

	@Transactional
	public ArrayList<TaikhoanNguoidung> getAllTaiKhoan(){
		return taiKhoanDao.getAllTaiKhoan();
	}

}
