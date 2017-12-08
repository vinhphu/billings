package com.athl.imp.DAOImp;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.athl.DAO.BlocksDao;
import com.athl.model.Blocks;
import com.athl.model.Congty;
@Repository
public class BlocksDaoimpl implements BlocksDao {

	@Autowired
	private SessionFactory session;
	public void add(Blocks blocks) {
		session.getCurrentSession().save(blocks);
	}


	public void edit(Blocks blocks) {
		session.getCurrentSession().update(blocks);
	}


	public void delete(String blocksid) {
		session.getCurrentSession().delete(getBlocks(blocksid));

	}


	public Blocks getBlocks(String blocksid) {
		return (Blocks) session.getCurrentSession().get(Blocks.class, blocksid);
	}


	public List getAllBlocks() {
		return session.getCurrentSession().createQuery("from blocks").list();
	}

}
