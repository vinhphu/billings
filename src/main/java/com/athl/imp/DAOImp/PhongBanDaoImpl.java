package com.athl.imp.DAOImp;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.athl.DAO.PhongBanDao;
import com.athl.model.Congty;
import com.athl.model.Phongban;
@Repository
public class PhongBanDaoImpl implements PhongBanDao {

	@Autowired
	private SessionFactory session;
	public void add(Phongban phongban) {
		session.getCurrentSession().save(phongban);

	}

	public void edit(Phongban phongban) {
		session.getCurrentSession().update(phongban);

	}


	public void delete(String phongbanid) {
		session.getCurrentSession().delete(getPhongBan(phongbanid));

	}


	public Phongban getPhongBan(String phongbanid) {
		return (Phongban) session.getCurrentSession().get(Phongban.class, phongbanid);
	}


	public List getAllPhongBan() {
		return session.getCurrentSession().createQuery("from phongban").list();
	}

}
