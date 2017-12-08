package com.athl.imp.serviceImp;

import java.util.List;

import javax.rmi.CORBA.Stub;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.athl.DAO.CongTyDao;
import com.athl.model.Congty;
import com.athl.service.CongTyService;

@Service
public class CongTyServiceImpl implements CongTyService {
	@Autowired
	private CongTyDao congTyDao;

	@Transactional
	public void add(Congty congty) {
		congTyDao.add(congty);

	}

	@Transactional
	public void edit(Congty congty) {
		congTyDao.edit(congty);

	}

	@Transactional
	public void delete(String congtyid) {
		congTyDao.delete(congtyid);

	}

	@Transactional
	public Congty getCongTy(String congtyid) {
		return congTyDao.getCongTy(congtyid);
	}

	@Transactional
	public List getAllCongTy() {
		return congTyDao.getAllCongTy();
	}

}
