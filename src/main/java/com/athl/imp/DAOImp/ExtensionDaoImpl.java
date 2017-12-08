package com.athl.imp.DAOImp;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.athl.DAO.ExtensionDao;
import com.athl.model.Congty;
import com.athl.model.Extension;
@Repository
public class ExtensionDaoImpl implements ExtensionDao {

	@Autowired
	private SessionFactory session;
	public void add(Extension extension) {
		session.getCurrentSession().save(extension);

	}


	public void edit(Extension extension) {
		session.getCurrentSession().update(extension);

	}


	public void delete(String extensionid) {
		session.getCurrentSession().delete(getExtension(extensionid));

	}


	public Extension getExtension(String extensionid) {
		return (Extension) session.getCurrentSession().get(Extension.class, extensionid);
	}


	public List getAllExtension() {
		return session.getCurrentSession().createQuery("from extension").list();
	}

}
