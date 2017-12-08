package com.athl.imp.DAOImp;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.athl.DAO.TaiKhoanDao;
import com.athl.model.Congty;
import com.athl.model.TaikhoanNguoidung;

@Repository
public class TaiKhoanDaoimpl implements TaiKhoanDao {

	@Autowired
	private SessionFactory session;

	public void add(TaikhoanNguoidung taikhoan) {
		session.getCurrentSession().save(taikhoan);

	}

	public void edit(TaikhoanNguoidung taikhoan) {
		session.getCurrentSession().update(taikhoan);

	}

	public void delete(String taikhoanid) {
		session.getCurrentSession().delete(getTaikhoan(taikhoanid));

	}

	public TaikhoanNguoidung getTaikhoan(String taikhoanid) {
		return (TaikhoanNguoidung) session.getCurrentSession().get(TaikhoanNguoidung.class, taikhoanid);
	}

	public List getAllTaikhoan() {
		return session.getCurrentSession().createQuery("from taikhoan_nguoidung").list();
	}

}
