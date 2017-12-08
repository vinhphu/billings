package com.athl.utils;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.athl.model.Congty;

public class CongTyDAO {
	public static ArrayList<Congty> getAllcategory() {
		Session session = HibernateUtils.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("from congty");
		ArrayList<Congty> list = (ArrayList<Congty>) query.list();
		transaction.commit();
		return list;
	}

	public static void main(String[] args) {
		ArrayList<Congty> arr = getAllcategory();
		for (Congty congty : arr) {
			System.out.println(congty.toString());
		}
	}
}
