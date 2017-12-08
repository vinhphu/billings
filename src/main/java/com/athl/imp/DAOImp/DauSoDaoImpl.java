package com.athl.imp.DAOImp;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.athl.DAO.DauSoDao;
import com.athl.model.Congty;
import com.athl.model.Dauso;
@Repository
public class DauSoDaoImpl implements DauSoDao {

	@Autowired
	private SessionFactory session;
	public void add(Dauso dauso) {
		session.getCurrentSession().save(dauso);

	}

	
	public void edit(Dauso dauso) {
		session.getCurrentSession().update(dauso);

	}

	
	public void delete(String dausoid) {
		session.getCurrentSession().delete(getDauSo(dausoid));

	}

	
	public Dauso getDauSo(String dausoid) {
		return (Dauso) session.getCurrentSession().get(Dauso.class, dausoid);
	}

	
	public List getAllDauSo() {
		return session.getCurrentSession().createQuery("from dauso").list();
	}

}
