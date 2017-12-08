package com.athl.imp.DAOImp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.athl.DAO.TaiKhoanDao;
import com.athl.model.TaikhoanNguoidung;
import com.athl.utils.*;;

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
	public ArrayList<TaikhoanNguoidung> getAllTaiKhoan(){
	     Session session = HibernateUtils.getSessionFactory().getCurrentSession();
	     Transaction transaction = session.beginTransaction();
	     Query query = session.createQuery("FROM TaikhoanNguoidung");
	     ArrayList<TaikhoanNguoidung> list = (ArrayList<TaikhoanNguoidung>) query.list();
	     transaction.commit();
	     return list;
	}
	public static void main(String[] args) {
		System.out.println(new TaiKhoanDaoimpl().getAllTaiKhoan().size());
	}

	}
