package com.athl.imp.DAOImp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.athl.DAO.CongTyDao;
import com.athl.model.Congty;
import com.athl.model.TaikhoanNguoidung;
import com.athl.utils.HibernateUtils;
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
	public ArrayList<Congty> getAllCongTy(){
		Session session = HibernateUtils.getSessionFactory().getCurrentSession();
	     Transaction transaction = session.beginTransaction();
	     Query query = session.createQuery("FROM Congty");
	     ArrayList<Congty> list = (ArrayList<Congty>) query.list();
	     transaction.commit();
	     return list;
	}
	public static void main(String[] args) {
		System.out.println(new CongTyDaoImpl().getAllCongTy().size());
	}

}
