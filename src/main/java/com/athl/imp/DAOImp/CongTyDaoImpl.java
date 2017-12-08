package com.athl.imp.DAOImp;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.athl.DAO.CongTyDao;
import com.athl.model.Congty;
@Repository
public class CongTyDaoImpl implements CongTyDao {
	@Autowired
	private SessionFactory session;
	public void add(Congty congty) {
		session.getCurrentSession().save(congty);

	}

	public void edit(Congty congty) {
		session.getCurrentSession().update(congty);

	}
	public void delete(String congtyid) {
		session.getCurrentSession().delete(getCongTy(congtyid));

	}
	public Congty getCongTy(String congtyid) {
		return (Congty) session.getCurrentSession().get(Congty.class, congtyid);
	}
	public List getAllCongTy() {
		return session.getCurrentSession().createQuery("from congty").list();
	}

}
