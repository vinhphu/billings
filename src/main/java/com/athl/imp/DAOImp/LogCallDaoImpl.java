package com.athl.imp.DAOImp;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.athl.DAO.LogCallDao;
import com.athl.model.LogCall;
@Repository
public class LogCallDaoImpl implements LogCallDao {

	@Autowired
	private SessionFactory session;
	public void add(LogCallDao logcall) {
		session.getCurrentSession().save(logcall);

	}


	public void edit(LogCallDao logcall) {
		session.getCurrentSession().update(logcall);

	}


	public void delete(String logcallid) {
		session.getCurrentSession().delete(getLogCall(logcallid));

	}


	public LogCall getLogCall(String logcallid) {
		return (LogCall) session.getCurrentSession().get(LogCall.class, logcallid);
	}


	public List getAllLogCall() {
		return session.getCurrentSession().createQuery("from log_call").list();
	}

}
